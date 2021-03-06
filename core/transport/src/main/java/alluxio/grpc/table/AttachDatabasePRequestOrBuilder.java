// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface AttachDatabasePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.AttachDatabasePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string db_name = 1;</code>
   */
  boolean hasDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  java.lang.String getDbName();
  /**
   * <code>optional string db_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDbNameBytes();

  /**
   * <code>optional string db_type = 2;</code>
   */
  boolean hasDbType();
  /**
   * <code>optional string db_type = 2;</code>
   */
  java.lang.String getDbType();
  /**
   * <code>optional string db_type = 2;</code>
   */
  com.google.protobuf.ByteString
      getDbTypeBytes();

  /**
   * <code>map&lt;string, string&gt; options = 3;</code>
   */
  int getOptionsCount();
  /**
   * <code>map&lt;string, string&gt; options = 3;</code>
   */
  boolean containsOptions(
      java.lang.String key);
  /**
   * Use {@link #getOptionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getOptions();
  /**
   * <code>map&lt;string, string&gt; options = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getOptionsMap();
  /**
   * <code>map&lt;string, string&gt; options = 3;</code>
   */

  java.lang.String getOptionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; options = 3;</code>
   */

  java.lang.String getOptionsOrThrow(
      java.lang.String key);
}
