// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/catalog/catalog_master.proto

package alluxio.grpc.catalog;

public interface HiveTableInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.catalog.HiveTableInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string database_name = 1;</code>
   */
  boolean hasDatabaseName();
  /**
   * <code>optional string database_name = 1;</code>
   */
  java.lang.String getDatabaseName();
  /**
   * <code>optional string database_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDatabaseNameBytes();

  /**
   * <code>optional string table_name = 2;</code>
   */
  boolean hasTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>optional string table_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>optional string owner = 3;</code>
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 3;</code>
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 3;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>optional string table_type = 4;</code>
   */
  boolean hasTableType();
  /**
   * <code>optional string table_type = 4;</code>
   */
  java.lang.String getTableType();
  /**
   * <code>optional string table_type = 4;</code>
   */
  com.google.protobuf.ByteString
      getTableTypeBytes();

  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema data_columns = 5;</code>
   */
  java.util.List<alluxio.grpc.catalog.FieldSchema> 
      getDataColumnsList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema data_columns = 5;</code>
   */
  alluxio.grpc.catalog.FieldSchema getDataColumns(int index);
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema data_columns = 5;</code>
   */
  int getDataColumnsCount();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema data_columns = 5;</code>
   */
  java.util.List<? extends alluxio.grpc.catalog.FieldSchemaOrBuilder> 
      getDataColumnsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema data_columns = 5;</code>
   */
  alluxio.grpc.catalog.FieldSchemaOrBuilder getDataColumnsOrBuilder(
      int index);

  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema partition_columns = 6;</code>
   */
  java.util.List<alluxio.grpc.catalog.FieldSchema> 
      getPartitionColumnsList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema partition_columns = 6;</code>
   */
  alluxio.grpc.catalog.FieldSchema getPartitionColumns(int index);
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema partition_columns = 6;</code>
   */
  int getPartitionColumnsCount();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema partition_columns = 6;</code>
   */
  java.util.List<? extends alluxio.grpc.catalog.FieldSchemaOrBuilder> 
      getPartitionColumnsOrBuilderList();
  /**
   * <code>repeated .alluxio.grpc.catalog.FieldSchema partition_columns = 6;</code>
   */
  alluxio.grpc.catalog.FieldSchemaOrBuilder getPartitionColumnsOrBuilder(
      int index);

  /**
   * <code>optional .alluxio.grpc.catalog.Storage storage = 7;</code>
   */
  boolean hasStorage();
  /**
   * <code>optional .alluxio.grpc.catalog.Storage storage = 7;</code>
   */
  alluxio.grpc.catalog.Storage getStorage();
  /**
   * <code>optional .alluxio.grpc.catalog.Storage storage = 7;</code>
   */
  alluxio.grpc.catalog.StorageOrBuilder getStorageOrBuilder();

  /**
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  int getParametersCount();
  /**
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  boolean containsParameters(
      java.lang.String key);
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getParameters();
  /**
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getParametersMap();
  /**
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */

  java.lang.String getParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; parameters = 8;</code>
   */

  java.lang.String getParametersOrThrow(
      java.lang.String key);

  /**
   * <code>optional string view_original_text = 9;</code>
   */
  boolean hasViewOriginalText();
  /**
   * <code>optional string view_original_text = 9;</code>
   */
  java.lang.String getViewOriginalText();
  /**
   * <code>optional string view_original_text = 9;</code>
   */
  com.google.protobuf.ByteString
      getViewOriginalTextBytes();

  /**
   * <code>optional string view_expanded_text = 10;</code>
   */
  boolean hasViewExpandedText();
  /**
   * <code>optional string view_expanded_text = 10;</code>
   */
  java.lang.String getViewExpandedText();
  /**
   * <code>optional string view_expanded_text = 10;</code>
   */
  com.google.protobuf.ByteString
      getViewExpandedTextBytes();
}