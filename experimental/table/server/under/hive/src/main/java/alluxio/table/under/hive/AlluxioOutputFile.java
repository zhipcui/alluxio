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

package alluxio.table.under.hive;

import alluxio.underfs.UnderFileSystem;

import org.apache.iceberg.io.InputFile;
import org.apache.iceberg.io.OutputFile;
import org.apache.iceberg.io.PositionOutputStream;

/**
 * {@link OutputFile} implementation using the Alluxio API.
 */
public class AlluxioOutputFile implements OutputFile {
  /**
   * Conctruct an outputfile from path.
   *
   * @param fs underlying filesystem
   * @param path file path
   * @return an output file
   */
  public static OutputFile fromPath(UnderFileSystem fs, String path) {
    return new AlluxioOutputFile(path, fs);
  }

  private final String mPath;
  private final UnderFileSystem mFileSystem;

  private AlluxioOutputFile(String path, UnderFileSystem fs) {
    mPath = path;
    mFileSystem = fs;
  }

  @Override
  public PositionOutputStream create() {
    try {
      return AlluxioStreams.wrap(mFileSystem.createNonexistingFile(mPath));
    } catch (Exception e) {
      throw new RuntimeException("Failed to create file:" + mPath, e);
    }
  }

  @Override
  public PositionOutputStream createOrOverwrite() {
    try {
      return AlluxioStreams.wrap(mFileSystem.create(mPath));
    } catch (Exception e) {
      throw new RuntimeException("Failed to create file:" + mPath, e);
    }
  }

  /**
   * get the path of the output file.
   *
   * @return the path
   */
  public String getPath() {
    return mPath;
  }

  @Override
  public String location() {
    return mPath;
  }

  @Override
  public InputFile toInputFile() {
    return AlluxioInputFile.fromPath(mFileSystem, mPath);
  }

  @Override
  public String toString() {
    return location();
  }
}