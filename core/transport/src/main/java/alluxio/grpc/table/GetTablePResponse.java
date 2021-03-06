// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

/**
 * Protobuf type {@code alluxio.grpc.table.GetTablePResponse}
 */
public  final class GetTablePResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.table.GetTablePResponse)
    GetTablePResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetTablePResponse.newBuilder() to construct.
  private GetTablePResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetTablePResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetTablePResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            alluxio.grpc.table.TableInfo.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = tableInfo_.toBuilder();
            }
            tableInfo_ = input.readMessage(alluxio.grpc.table.TableInfo.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tableInfo_);
              tableInfo_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTablePResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTablePResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.table.GetTablePResponse.class, alluxio.grpc.table.GetTablePResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TABLE_INFO_FIELD_NUMBER = 1;
  private alluxio.grpc.table.TableInfo tableInfo_;
  /**
   * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
   */
  public boolean hasTableInfo() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
   */
  public alluxio.grpc.table.TableInfo getTableInfo() {
    return tableInfo_ == null ? alluxio.grpc.table.TableInfo.getDefaultInstance() : tableInfo_;
  }
  /**
   * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
   */
  public alluxio.grpc.table.TableInfoOrBuilder getTableInfoOrBuilder() {
    return tableInfo_ == null ? alluxio.grpc.table.TableInfo.getDefaultInstance() : tableInfo_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (hasTableInfo()) {
      if (!getTableInfo().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeMessage(1, getTableInfo());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTableInfo());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof alluxio.grpc.table.GetTablePResponse)) {
      return super.equals(obj);
    }
    alluxio.grpc.table.GetTablePResponse other = (alluxio.grpc.table.GetTablePResponse) obj;

    boolean result = true;
    result = result && (hasTableInfo() == other.hasTableInfo());
    if (hasTableInfo()) {
      result = result && getTableInfo()
          .equals(other.getTableInfo());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTableInfo()) {
      hash = (37 * hash) + TABLE_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getTableInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTablePResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTablePResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.table.GetTablePResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(alluxio.grpc.table.GetTablePResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code alluxio.grpc.table.GetTablePResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.table.GetTablePResponse)
      alluxio.grpc.table.GetTablePResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTablePResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTablePResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.table.GetTablePResponse.class, alluxio.grpc.table.GetTablePResponse.Builder.class);
    }

    // Construct using alluxio.grpc.table.GetTablePResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTableInfoFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (tableInfoBuilder_ == null) {
        tableInfo_ = null;
      } else {
        tableInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.table.TableMasterProto.internal_static_alluxio_grpc_table_GetTablePResponse_descriptor;
    }

    public alluxio.grpc.table.GetTablePResponse getDefaultInstanceForType() {
      return alluxio.grpc.table.GetTablePResponse.getDefaultInstance();
    }

    public alluxio.grpc.table.GetTablePResponse build() {
      alluxio.grpc.table.GetTablePResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.table.GetTablePResponse buildPartial() {
      alluxio.grpc.table.GetTablePResponse result = new alluxio.grpc.table.GetTablePResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (tableInfoBuilder_ == null) {
        result.tableInfo_ = tableInfo_;
      } else {
        result.tableInfo_ = tableInfoBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof alluxio.grpc.table.GetTablePResponse) {
        return mergeFrom((alluxio.grpc.table.GetTablePResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.table.GetTablePResponse other) {
      if (other == alluxio.grpc.table.GetTablePResponse.getDefaultInstance()) return this;
      if (other.hasTableInfo()) {
        mergeTableInfo(other.getTableInfo());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (hasTableInfo()) {
        if (!getTableInfo().isInitialized()) {
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      alluxio.grpc.table.GetTablePResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.table.GetTablePResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private alluxio.grpc.table.TableInfo tableInfo_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.table.TableInfo, alluxio.grpc.table.TableInfo.Builder, alluxio.grpc.table.TableInfoOrBuilder> tableInfoBuilder_;
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public boolean hasTableInfo() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public alluxio.grpc.table.TableInfo getTableInfo() {
      if (tableInfoBuilder_ == null) {
        return tableInfo_ == null ? alluxio.grpc.table.TableInfo.getDefaultInstance() : tableInfo_;
      } else {
        return tableInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public Builder setTableInfo(alluxio.grpc.table.TableInfo value) {
      if (tableInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tableInfo_ = value;
        onChanged();
      } else {
        tableInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public Builder setTableInfo(
        alluxio.grpc.table.TableInfo.Builder builderForValue) {
      if (tableInfoBuilder_ == null) {
        tableInfo_ = builderForValue.build();
        onChanged();
      } else {
        tableInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public Builder mergeTableInfo(alluxio.grpc.table.TableInfo value) {
      if (tableInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            tableInfo_ != null &&
            tableInfo_ != alluxio.grpc.table.TableInfo.getDefaultInstance()) {
          tableInfo_ =
            alluxio.grpc.table.TableInfo.newBuilder(tableInfo_).mergeFrom(value).buildPartial();
        } else {
          tableInfo_ = value;
        }
        onChanged();
      } else {
        tableInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public Builder clearTableInfo() {
      if (tableInfoBuilder_ == null) {
        tableInfo_ = null;
        onChanged();
      } else {
        tableInfoBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public alluxio.grpc.table.TableInfo.Builder getTableInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getTableInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    public alluxio.grpc.table.TableInfoOrBuilder getTableInfoOrBuilder() {
      if (tableInfoBuilder_ != null) {
        return tableInfoBuilder_.getMessageOrBuilder();
      } else {
        return tableInfo_ == null ?
            alluxio.grpc.table.TableInfo.getDefaultInstance() : tableInfo_;
      }
    }
    /**
     * <code>optional .alluxio.grpc.table.TableInfo table_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        alluxio.grpc.table.TableInfo, alluxio.grpc.table.TableInfo.Builder, alluxio.grpc.table.TableInfoOrBuilder> 
        getTableInfoFieldBuilder() {
      if (tableInfoBuilder_ == null) {
        tableInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            alluxio.grpc.table.TableInfo, alluxio.grpc.table.TableInfo.Builder, alluxio.grpc.table.TableInfoOrBuilder>(
                getTableInfo(),
                getParentForChildren(),
                isClean());
        tableInfo_ = null;
      }
      return tableInfoBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.table.GetTablePResponse)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.table.GetTablePResponse)
  private static final alluxio.grpc.table.GetTablePResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.table.GetTablePResponse();
  }

  public static alluxio.grpc.table.GetTablePResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GetTablePResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetTablePResponse>() {
    public GetTablePResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetTablePResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetTablePResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetTablePResponse> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.table.GetTablePResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

