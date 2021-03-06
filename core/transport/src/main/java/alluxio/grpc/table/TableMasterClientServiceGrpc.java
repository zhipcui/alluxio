package alluxio.grpc.table;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 * This interface contains table master service endpoints for Alluxio clients.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.17.1)",
    comments = "Source: grpc/table/table_master.proto")
public final class TableMasterClientServiceGrpc {

  private TableMasterClientServiceGrpc() {}

  public static final String SERVICE_NAME = "alluxio.grpc.table.TableMasterClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllDatabasesPRequest,
      alluxio.grpc.table.GetAllDatabasesPResponse> getGetAllDatabasesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllDatabases",
      requestType = alluxio.grpc.table.GetAllDatabasesPRequest.class,
      responseType = alluxio.grpc.table.GetAllDatabasesPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllDatabasesPRequest,
      alluxio.grpc.table.GetAllDatabasesPResponse> getGetAllDatabasesMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllDatabasesPRequest, alluxio.grpc.table.GetAllDatabasesPResponse> getGetAllDatabasesMethod;
    if ((getGetAllDatabasesMethod = TableMasterClientServiceGrpc.getGetAllDatabasesMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetAllDatabasesMethod = TableMasterClientServiceGrpc.getGetAllDatabasesMethod) == null) {
          TableMasterClientServiceGrpc.getGetAllDatabasesMethod = getGetAllDatabasesMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetAllDatabasesPRequest, alluxio.grpc.table.GetAllDatabasesPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetAllDatabases"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetAllDatabasesPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetAllDatabasesPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetAllDatabases"))
                  .build();
          }
        }
     }
     return getGetAllDatabasesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllTablesPRequest,
      alluxio.grpc.table.GetAllTablesPResponse> getGetAllTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllTables",
      requestType = alluxio.grpc.table.GetAllTablesPRequest.class,
      responseType = alluxio.grpc.table.GetAllTablesPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllTablesPRequest,
      alluxio.grpc.table.GetAllTablesPResponse> getGetAllTablesMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetAllTablesPRequest, alluxio.grpc.table.GetAllTablesPResponse> getGetAllTablesMethod;
    if ((getGetAllTablesMethod = TableMasterClientServiceGrpc.getGetAllTablesMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetAllTablesMethod = TableMasterClientServiceGrpc.getGetAllTablesMethod) == null) {
          TableMasterClientServiceGrpc.getGetAllTablesMethod = getGetAllTablesMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetAllTablesPRequest, alluxio.grpc.table.GetAllTablesPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetAllTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetAllTablesPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetAllTablesPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetAllTables"))
                  .build();
          }
        }
     }
     return getGetAllTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetDatabasePRequest,
      alluxio.grpc.table.GetDatabasePResponse> getGetDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDatabase",
      requestType = alluxio.grpc.table.GetDatabasePRequest.class,
      responseType = alluxio.grpc.table.GetDatabasePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetDatabasePRequest,
      alluxio.grpc.table.GetDatabasePResponse> getGetDatabaseMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetDatabasePRequest, alluxio.grpc.table.GetDatabasePResponse> getGetDatabaseMethod;
    if ((getGetDatabaseMethod = TableMasterClientServiceGrpc.getGetDatabaseMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetDatabaseMethod = TableMasterClientServiceGrpc.getGetDatabaseMethod) == null) {
          TableMasterClientServiceGrpc.getGetDatabaseMethod = getGetDatabaseMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetDatabasePRequest, alluxio.grpc.table.GetDatabasePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetDatabasePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetDatabasePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetDatabase"))
                  .build();
          }
        }
     }
     return getGetDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetTablePRequest,
      alluxio.grpc.table.GetTablePResponse> getGetTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTable",
      requestType = alluxio.grpc.table.GetTablePRequest.class,
      responseType = alluxio.grpc.table.GetTablePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetTablePRequest,
      alluxio.grpc.table.GetTablePResponse> getGetTableMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetTablePRequest, alluxio.grpc.table.GetTablePResponse> getGetTableMethod;
    if ((getGetTableMethod = TableMasterClientServiceGrpc.getGetTableMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetTableMethod = TableMasterClientServiceGrpc.getGetTableMethod) == null) {
          TableMasterClientServiceGrpc.getGetTableMethod = getGetTableMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetTablePRequest, alluxio.grpc.table.GetTablePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetTablePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetTablePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetTable"))
                  .build();
          }
        }
     }
     return getGetTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.AttachDatabasePRequest,
      alluxio.grpc.table.AttachDatabasePResponse> getAttachDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AttachDatabase",
      requestType = alluxio.grpc.table.AttachDatabasePRequest.class,
      responseType = alluxio.grpc.table.AttachDatabasePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.AttachDatabasePRequest,
      alluxio.grpc.table.AttachDatabasePResponse> getAttachDatabaseMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.AttachDatabasePRequest, alluxio.grpc.table.AttachDatabasePResponse> getAttachDatabaseMethod;
    if ((getAttachDatabaseMethod = TableMasterClientServiceGrpc.getAttachDatabaseMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getAttachDatabaseMethod = TableMasterClientServiceGrpc.getAttachDatabaseMethod) == null) {
          TableMasterClientServiceGrpc.getAttachDatabaseMethod = getAttachDatabaseMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.AttachDatabasePRequest, alluxio.grpc.table.AttachDatabasePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "AttachDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.AttachDatabasePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.AttachDatabasePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("AttachDatabase"))
                  .build();
          }
        }
     }
     return getAttachDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.DetachDatabasePRequest,
      alluxio.grpc.table.DetachDatabasePResponse> getDetachDatabaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetachDatabase",
      requestType = alluxio.grpc.table.DetachDatabasePRequest.class,
      responseType = alluxio.grpc.table.DetachDatabasePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.DetachDatabasePRequest,
      alluxio.grpc.table.DetachDatabasePResponse> getDetachDatabaseMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.DetachDatabasePRequest, alluxio.grpc.table.DetachDatabasePResponse> getDetachDatabaseMethod;
    if ((getDetachDatabaseMethod = TableMasterClientServiceGrpc.getDetachDatabaseMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getDetachDatabaseMethod = TableMasterClientServiceGrpc.getDetachDatabaseMethod) == null) {
          TableMasterClientServiceGrpc.getDetachDatabaseMethod = getDetachDatabaseMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.DetachDatabasePRequest, alluxio.grpc.table.DetachDatabasePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "DetachDatabase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.DetachDatabasePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.DetachDatabasePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("DetachDatabase"))
                  .build();
          }
        }
     }
     return getDetachDatabaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetTableColumnStatisticsPRequest,
      alluxio.grpc.table.GetTableColumnStatisticsPResponse> getGetTableColumnStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTableColumnStatistics",
      requestType = alluxio.grpc.table.GetTableColumnStatisticsPRequest.class,
      responseType = alluxio.grpc.table.GetTableColumnStatisticsPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetTableColumnStatisticsPRequest,
      alluxio.grpc.table.GetTableColumnStatisticsPResponse> getGetTableColumnStatisticsMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetTableColumnStatisticsPRequest, alluxio.grpc.table.GetTableColumnStatisticsPResponse> getGetTableColumnStatisticsMethod;
    if ((getGetTableColumnStatisticsMethod = TableMasterClientServiceGrpc.getGetTableColumnStatisticsMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetTableColumnStatisticsMethod = TableMasterClientServiceGrpc.getGetTableColumnStatisticsMethod) == null) {
          TableMasterClientServiceGrpc.getGetTableColumnStatisticsMethod = getGetTableColumnStatisticsMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetTableColumnStatisticsPRequest, alluxio.grpc.table.GetTableColumnStatisticsPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetTableColumnStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetTableColumnStatisticsPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetTableColumnStatisticsPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetTableColumnStatistics"))
                  .build();
          }
        }
     }
     return getGetTableColumnStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.GetPartitionColumnStatisticsPRequest,
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> getGetPartitionColumnStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPartitionColumnStatistics",
      requestType = alluxio.grpc.table.GetPartitionColumnStatisticsPRequest.class,
      responseType = alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.GetPartitionColumnStatisticsPRequest,
      alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> getGetPartitionColumnStatisticsMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.GetPartitionColumnStatisticsPRequest, alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> getGetPartitionColumnStatisticsMethod;
    if ((getGetPartitionColumnStatisticsMethod = TableMasterClientServiceGrpc.getGetPartitionColumnStatisticsMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getGetPartitionColumnStatisticsMethod = TableMasterClientServiceGrpc.getGetPartitionColumnStatisticsMethod) == null) {
          TableMasterClientServiceGrpc.getGetPartitionColumnStatisticsMethod = getGetPartitionColumnStatisticsMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.GetPartitionColumnStatisticsPRequest, alluxio.grpc.table.GetPartitionColumnStatisticsPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "GetPartitionColumnStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetPartitionColumnStatisticsPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.GetPartitionColumnStatisticsPResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("GetPartitionColumnStatistics"))
                  .build();
          }
        }
     }
     return getGetPartitionColumnStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.ReadTablePRequest,
      alluxio.grpc.table.ReadTablePResponse> getReadTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadTable",
      requestType = alluxio.grpc.table.ReadTablePRequest.class,
      responseType = alluxio.grpc.table.ReadTablePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.ReadTablePRequest,
      alluxio.grpc.table.ReadTablePResponse> getReadTableMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.ReadTablePRequest, alluxio.grpc.table.ReadTablePResponse> getReadTableMethod;
    if ((getReadTableMethod = TableMasterClientServiceGrpc.getReadTableMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getReadTableMethod = TableMasterClientServiceGrpc.getReadTableMethod) == null) {
          TableMasterClientServiceGrpc.getReadTableMethod = getReadTableMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.ReadTablePRequest, alluxio.grpc.table.ReadTablePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "ReadTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.ReadTablePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.ReadTablePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("ReadTable"))
                  .build();
          }
        }
     }
     return getReadTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<alluxio.grpc.table.TransformTablePRequest,
      alluxio.grpc.table.TransformTablePResponse> getTransformTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TransformTable",
      requestType = alluxio.grpc.table.TransformTablePRequest.class,
      responseType = alluxio.grpc.table.TransformTablePResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<alluxio.grpc.table.TransformTablePRequest,
      alluxio.grpc.table.TransformTablePResponse> getTransformTableMethod() {
    io.grpc.MethodDescriptor<alluxio.grpc.table.TransformTablePRequest, alluxio.grpc.table.TransformTablePResponse> getTransformTableMethod;
    if ((getTransformTableMethod = TableMasterClientServiceGrpc.getTransformTableMethod) == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        if ((getTransformTableMethod = TableMasterClientServiceGrpc.getTransformTableMethod) == null) {
          TableMasterClientServiceGrpc.getTransformTableMethod = getTransformTableMethod = 
              io.grpc.MethodDescriptor.<alluxio.grpc.table.TransformTablePRequest, alluxio.grpc.table.TransformTablePResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "alluxio.grpc.table.TableMasterClientService", "TransformTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.TransformTablePRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  alluxio.grpc.table.TransformTablePResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TableMasterClientServiceMethodDescriptorSupplier("TransformTable"))
                  .build();
          }
        }
     }
     return getTransformTableMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableMasterClientServiceStub newStub(io.grpc.Channel channel) {
    return new TableMasterClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableMasterClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TableMasterClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableMasterClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TableMasterClientServiceFutureStub(channel);
  }

  /**
   * <pre>
   **
   * This interface contains table master service endpoints for Alluxio clients.
   * </pre>
   */
  public static abstract class TableMasterClientServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     **
     * Returns all databases in the catalog
     * </pre>
     */
    public void getAllDatabases(alluxio.grpc.table.GetAllDatabasesPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllDatabasesPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllDatabasesMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Returns all tables in the database
     * </pre>
     */
    public void getAllTables(alluxio.grpc.table.GetAllTablesPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllTablesPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Gets a database by name from the table master
     * </pre>
     */
    public void getDatabase(alluxio.grpc.table.GetDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetDatabasePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDatabaseMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a specific table info
     * </pre>
     */
    public void getTable(alluxio.grpc.table.GetTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTablePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTableMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Attach an existing database into the catalog as a new database name
     * </pre>
     */
    public void attachDatabase(alluxio.grpc.table.AttachDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.AttachDatabasePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAttachDatabaseMethod(), responseObserver);
    }

    /**
     * <pre>
     **
     * Detach existing database into the catalog, removing any metadata about the table
     * </pre>
     */
    public void detachDatabase(alluxio.grpc.table.DetachDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.DetachDatabasePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDetachDatabaseMethod(), responseObserver);
    }

    /**
     */
    public void getTableColumnStatistics(alluxio.grpc.table.GetTableColumnStatisticsPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTableColumnStatisticsPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTableColumnStatisticsMethod(), responseObserver);
    }

    /**
     */
    public void getPartitionColumnStatistics(alluxio.grpc.table.GetPartitionColumnStatisticsPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPartitionColumnStatisticsMethod(), responseObserver);
    }

    /**
     */
    public void readTable(alluxio.grpc.table.ReadTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.ReadTablePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadTableMethod(), responseObserver);
    }

    /**
     */
    public void transformTable(alluxio.grpc.table.TransformTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.TransformTablePResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTransformTableMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllDatabasesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetAllDatabasesPRequest,
                alluxio.grpc.table.GetAllDatabasesPResponse>(
                  this, METHODID_GET_ALL_DATABASES)))
          .addMethod(
            getGetAllTablesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetAllTablesPRequest,
                alluxio.grpc.table.GetAllTablesPResponse>(
                  this, METHODID_GET_ALL_TABLES)))
          .addMethod(
            getGetDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetDatabasePRequest,
                alluxio.grpc.table.GetDatabasePResponse>(
                  this, METHODID_GET_DATABASE)))
          .addMethod(
            getGetTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetTablePRequest,
                alluxio.grpc.table.GetTablePResponse>(
                  this, METHODID_GET_TABLE)))
          .addMethod(
            getAttachDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.AttachDatabasePRequest,
                alluxio.grpc.table.AttachDatabasePResponse>(
                  this, METHODID_ATTACH_DATABASE)))
          .addMethod(
            getDetachDatabaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.DetachDatabasePRequest,
                alluxio.grpc.table.DetachDatabasePResponse>(
                  this, METHODID_DETACH_DATABASE)))
          .addMethod(
            getGetTableColumnStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetTableColumnStatisticsPRequest,
                alluxio.grpc.table.GetTableColumnStatisticsPResponse>(
                  this, METHODID_GET_TABLE_COLUMN_STATISTICS)))
          .addMethod(
            getGetPartitionColumnStatisticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.GetPartitionColumnStatisticsPRequest,
                alluxio.grpc.table.GetPartitionColumnStatisticsPResponse>(
                  this, METHODID_GET_PARTITION_COLUMN_STATISTICS)))
          .addMethod(
            getReadTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.ReadTablePRequest,
                alluxio.grpc.table.ReadTablePResponse>(
                  this, METHODID_READ_TABLE)))
          .addMethod(
            getTransformTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                alluxio.grpc.table.TransformTablePRequest,
                alluxio.grpc.table.TransformTablePResponse>(
                  this, METHODID_TRANSFORM_TABLE)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * This interface contains table master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class TableMasterClientServiceStub extends io.grpc.stub.AbstractStub<TableMasterClientServiceStub> {
    private TableMasterClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableMasterClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMasterClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableMasterClientServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Returns all databases in the catalog
     * </pre>
     */
    public void getAllDatabases(alluxio.grpc.table.GetAllDatabasesPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllDatabasesPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllDatabasesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Returns all tables in the database
     * </pre>
     */
    public void getAllTables(alluxio.grpc.table.GetAllTablesPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllTablesPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Gets a database by name from the table master
     * </pre>
     */
    public void getDatabase(alluxio.grpc.table.GetDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetDatabasePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Returns a specific table info
     * </pre>
     */
    public void getTable(alluxio.grpc.table.GetTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTablePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Attach an existing database into the catalog as a new database name
     * </pre>
     */
    public void attachDatabase(alluxio.grpc.table.AttachDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.AttachDatabasePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAttachDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     **
     * Detach existing database into the catalog, removing any metadata about the table
     * </pre>
     */
    public void detachDatabase(alluxio.grpc.table.DetachDatabasePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.DetachDatabasePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetachDatabaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTableColumnStatistics(alluxio.grpc.table.GetTableColumnStatisticsPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTableColumnStatisticsPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTableColumnStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPartitionColumnStatistics(alluxio.grpc.table.GetPartitionColumnStatisticsPRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPartitionColumnStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readTable(alluxio.grpc.table.ReadTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.ReadTablePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transformTable(alluxio.grpc.table.TransformTablePRequest request,
        io.grpc.stub.StreamObserver<alluxio.grpc.table.TransformTablePResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransformTableMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * This interface contains table master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class TableMasterClientServiceBlockingStub extends io.grpc.stub.AbstractStub<TableMasterClientServiceBlockingStub> {
    private TableMasterClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableMasterClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMasterClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableMasterClientServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Returns all databases in the catalog
     * </pre>
     */
    public alluxio.grpc.table.GetAllDatabasesPResponse getAllDatabases(alluxio.grpc.table.GetAllDatabasesPRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllDatabasesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Returns all tables in the database
     * </pre>
     */
    public alluxio.grpc.table.GetAllTablesPResponse getAllTables(alluxio.grpc.table.GetAllTablesPRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Gets a database by name from the table master
     * </pre>
     */
    public alluxio.grpc.table.GetDatabasePResponse getDatabase(alluxio.grpc.table.GetDatabasePRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDatabaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Returns a specific table info
     * </pre>
     */
    public alluxio.grpc.table.GetTablePResponse getTable(alluxio.grpc.table.GetTablePRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Attach an existing database into the catalog as a new database name
     * </pre>
     */
    public alluxio.grpc.table.AttachDatabasePResponse attachDatabase(alluxio.grpc.table.AttachDatabasePRequest request) {
      return blockingUnaryCall(
          getChannel(), getAttachDatabaseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     **
     * Detach existing database into the catalog, removing any metadata about the table
     * </pre>
     */
    public alluxio.grpc.table.DetachDatabasePResponse detachDatabase(alluxio.grpc.table.DetachDatabasePRequest request) {
      return blockingUnaryCall(
          getChannel(), getDetachDatabaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public alluxio.grpc.table.GetTableColumnStatisticsPResponse getTableColumnStatistics(alluxio.grpc.table.GetTableColumnStatisticsPRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTableColumnStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public alluxio.grpc.table.GetPartitionColumnStatisticsPResponse getPartitionColumnStatistics(alluxio.grpc.table.GetPartitionColumnStatisticsPRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPartitionColumnStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public alluxio.grpc.table.ReadTablePResponse readTable(alluxio.grpc.table.ReadTablePRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public alluxio.grpc.table.TransformTablePResponse transformTable(alluxio.grpc.table.TransformTablePRequest request) {
      return blockingUnaryCall(
          getChannel(), getTransformTableMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * This interface contains table master service endpoints for Alluxio clients.
   * </pre>
   */
  public static final class TableMasterClientServiceFutureStub extends io.grpc.stub.AbstractStub<TableMasterClientServiceFutureStub> {
    private TableMasterClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableMasterClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMasterClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableMasterClientServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Returns all databases in the catalog
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetAllDatabasesPResponse> getAllDatabases(
        alluxio.grpc.table.GetAllDatabasesPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllDatabasesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Returns all tables in the database
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetAllTablesPResponse> getAllTables(
        alluxio.grpc.table.GetAllTablesPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Gets a database by name from the table master
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetDatabasePResponse> getDatabase(
        alluxio.grpc.table.GetDatabasePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDatabaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Returns a specific table info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetTablePResponse> getTable(
        alluxio.grpc.table.GetTablePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Attach an existing database into the catalog as a new database name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.AttachDatabasePResponse> attachDatabase(
        alluxio.grpc.table.AttachDatabasePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAttachDatabaseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     **
     * Detach existing database into the catalog, removing any metadata about the table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.DetachDatabasePResponse> detachDatabase(
        alluxio.grpc.table.DetachDatabasePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDetachDatabaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetTableColumnStatisticsPResponse> getTableColumnStatistics(
        alluxio.grpc.table.GetTableColumnStatisticsPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTableColumnStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.GetPartitionColumnStatisticsPResponse> getPartitionColumnStatistics(
        alluxio.grpc.table.GetPartitionColumnStatisticsPRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPartitionColumnStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.ReadTablePResponse> readTable(
        alluxio.grpc.table.ReadTablePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<alluxio.grpc.table.TransformTablePResponse> transformTable(
        alluxio.grpc.table.TransformTablePRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTransformTableMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_DATABASES = 0;
  private static final int METHODID_GET_ALL_TABLES = 1;
  private static final int METHODID_GET_DATABASE = 2;
  private static final int METHODID_GET_TABLE = 3;
  private static final int METHODID_ATTACH_DATABASE = 4;
  private static final int METHODID_DETACH_DATABASE = 5;
  private static final int METHODID_GET_TABLE_COLUMN_STATISTICS = 6;
  private static final int METHODID_GET_PARTITION_COLUMN_STATISTICS = 7;
  private static final int METHODID_READ_TABLE = 8;
  private static final int METHODID_TRANSFORM_TABLE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableMasterClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableMasterClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_DATABASES:
          serviceImpl.getAllDatabases((alluxio.grpc.table.GetAllDatabasesPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllDatabasesPResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_TABLES:
          serviceImpl.getAllTables((alluxio.grpc.table.GetAllTablesPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetAllTablesPResponse>) responseObserver);
          break;
        case METHODID_GET_DATABASE:
          serviceImpl.getDatabase((alluxio.grpc.table.GetDatabasePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetDatabasePResponse>) responseObserver);
          break;
        case METHODID_GET_TABLE:
          serviceImpl.getTable((alluxio.grpc.table.GetTablePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTablePResponse>) responseObserver);
          break;
        case METHODID_ATTACH_DATABASE:
          serviceImpl.attachDatabase((alluxio.grpc.table.AttachDatabasePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.AttachDatabasePResponse>) responseObserver);
          break;
        case METHODID_DETACH_DATABASE:
          serviceImpl.detachDatabase((alluxio.grpc.table.DetachDatabasePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.DetachDatabasePResponse>) responseObserver);
          break;
        case METHODID_GET_TABLE_COLUMN_STATISTICS:
          serviceImpl.getTableColumnStatistics((alluxio.grpc.table.GetTableColumnStatisticsPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetTableColumnStatisticsPResponse>) responseObserver);
          break;
        case METHODID_GET_PARTITION_COLUMN_STATISTICS:
          serviceImpl.getPartitionColumnStatistics((alluxio.grpc.table.GetPartitionColumnStatisticsPRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.GetPartitionColumnStatisticsPResponse>) responseObserver);
          break;
        case METHODID_READ_TABLE:
          serviceImpl.readTable((alluxio.grpc.table.ReadTablePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.ReadTablePResponse>) responseObserver);
          break;
        case METHODID_TRANSFORM_TABLE:
          serviceImpl.transformTable((alluxio.grpc.table.TransformTablePRequest) request,
              (io.grpc.stub.StreamObserver<alluxio.grpc.table.TransformTablePResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TableMasterClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableMasterClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return alluxio.grpc.table.TableMasterProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableMasterClientService");
    }
  }

  private static final class TableMasterClientServiceFileDescriptorSupplier
      extends TableMasterClientServiceBaseDescriptorSupplier {
    TableMasterClientServiceFileDescriptorSupplier() {}
  }

  private static final class TableMasterClientServiceMethodDescriptorSupplier
      extends TableMasterClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableMasterClientServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TableMasterClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableMasterClientServiceFileDescriptorSupplier())
              .addMethod(getGetAllDatabasesMethod())
              .addMethod(getGetAllTablesMethod())
              .addMethod(getGetDatabaseMethod())
              .addMethod(getGetTableMethod())
              .addMethod(getAttachDatabaseMethod())
              .addMethod(getDetachDatabaseMethod())
              .addMethod(getGetTableColumnStatisticsMethod())
              .addMethod(getGetPartitionColumnStatisticsMethod())
              .addMethod(getReadTableMethod())
              .addMethod(getTransformTableMethod())
              .build();
        }
      }
    }
    return result;
  }
}
