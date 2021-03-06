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

package alluxio.job.transform.format;

import alluxio.Constants;
import alluxio.job.transform.format.parquet.ParquetWriter;

import java.io.Closeable;
import java.io.IOException;

/**
 * A writer for writing rows to a table.
 */
public interface TableWriter extends Closeable {
  /**
   * @param schema the table schema
   * @param scheme the scheme of the path, e.g. "alluxio", "file"
   * @param path the path to the file representing the table
   * @return the writer for the table
   * @throws IOException when failed to create the writer
   */
  static TableWriter create(TableSchema schema, String scheme, String path) throws IOException {
    return ParquetWriter.create(schema, scheme, path);
  }

  /**
   * @param schema the table schema
   * @param path the path to the file representing the table
   * @return the result of {@link #create(TableSchema, String, String)} with scheme set to "alluxio"
   * @throws IOException when failed to create the writer
   */
  static TableWriter create(TableSchema schema, String path) throws IOException {
    return create(schema, Constants.SCHEME, path);
  }

  /**
   * Writes a row.
   *
   * @param row a row
   * @throws IOException when write fails
   */
  void write(TableRow row) throws IOException;

  /**
   * Closes a writer, which means the table is complete now.
   *
   * @throws IOException when failing to close the underlying output stream
   */
  void close() throws IOException;

  /**
   * @return the number of rows that have been written
   */
  int getRows();

  /**
   * Note that the bytes written should take compression and encoding into consideration.
   * If the writer writes to a file, the bytes written should be an estimate of the actual bytes
   * written to the file.
   *
   * @return the number of bytes that have been written
   */
  long getBytes();
}
