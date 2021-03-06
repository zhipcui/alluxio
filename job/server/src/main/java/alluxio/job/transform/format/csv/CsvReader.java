/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the "License"). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.job.transform.format.csv;

import alluxio.job.transform.format.Format;
import alluxio.job.transform.format.TableReader;
import alluxio.job.transform.format.TableRow;
import alluxio.job.transform.format.TableSchema;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData.Record;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.parquet.cli.csv.AvroCSV;
import org.apache.parquet.cli.csv.AvroCSVReader;
import org.apache.parquet.cli.csv.CSVProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/**
 * A reader for reading {@link CsvRow}.
 */
public final class CsvReader implements TableReader {
  private static final Logger LOG = LoggerFactory.getLogger(CsvReader.class);

  private final AvroCSVReader<Record> mReader;
  private final CsvSchema mSchema;

  /**
   * @param reader the CSV reader
   * @param schema the schema
   */
  private CsvReader(AvroCSVReader<Record> reader, Schema schema) {
    mReader = reader;
    mSchema = new CsvSchema(schema);
  }

  private static InputStream open(FileSystem fs, Path path) throws IOException {
    InputStream stream = fs.open(path);
    if (Format.isGzipped(path.toString())) {
      stream = new GZIPInputStream(stream);
    }
    return stream;
  }

  /**
   * Creates a CSV reader.
   *
   * @param scheme the scheme of the source, e.g. "alluxio", "file"
   * @param input the input file
   * @return the reader
   * @throws IOException when failed to create the reader
   */
  // TODO(cc): lazily open input streams
  public static CsvReader create(String scheme, String input) throws IOException {
    CSVProperties props = new CSVProperties.Builder()
        .hasHeader()
        .build();
    Path inputPath = new Path(scheme, "", input);
    Configuration conf = new Configuration();
    FileSystem fs = inputPath.getFileSystem(conf);
    Schema schema;
    try (InputStream inputStream = open(fs, inputPath)) {
      String schemaName = inputPath.getName();
      if (schemaName.contains(".")) {
        schemaName = schemaName.substring(0, schemaName.indexOf("."));
      }
      schema = AvroCSV.inferSchema(schemaName, inputStream, props);
    }
    AvroCSVReader<Record> reader = new AvroCSVReader<>(open(fs, inputPath), props, schema,
        Record.class, false);
    return new CsvReader(reader, schema);
  }

  @Override
  public TableSchema getSchema() throws IOException {
    return mSchema;
  }

  @Override
  public TableRow read() throws IOException {
    return mReader.hasNext() ? new CsvRow(mReader.next()) : null;
  }

  @Override
  public void close() throws IOException {
    mReader.close();
  }
}
