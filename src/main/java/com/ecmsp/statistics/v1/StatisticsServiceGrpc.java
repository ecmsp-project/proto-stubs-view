package com.ecmsp.statistics.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: statistics/v1/statistics_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StatisticsServiceGrpc {

  private StatisticsServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "statistics.v1.StatisticsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetAvailableVariantsRequest,
      com.ecmsp.statistics.v1.GetAvailableVariantsResponse> getGetAvailableVariantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAvailableVariants",
      requestType = com.ecmsp.statistics.v1.GetAvailableVariantsRequest.class,
      responseType = com.ecmsp.statistics.v1.GetAvailableVariantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetAvailableVariantsRequest,
      com.ecmsp.statistics.v1.GetAvailableVariantsResponse> getGetAvailableVariantsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetAvailableVariantsRequest, com.ecmsp.statistics.v1.GetAvailableVariantsResponse> getGetAvailableVariantsMethod;
    if ((getGetAvailableVariantsMethod = StatisticsServiceGrpc.getGetAvailableVariantsMethod) == null) {
      synchronized (StatisticsServiceGrpc.class) {
        if ((getGetAvailableVariantsMethod = StatisticsServiceGrpc.getGetAvailableVariantsMethod) == null) {
          StatisticsServiceGrpc.getGetAvailableVariantsMethod = getGetAvailableVariantsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.statistics.v1.GetAvailableVariantsRequest, com.ecmsp.statistics.v1.GetAvailableVariantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAvailableVariants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetAvailableVariantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetAvailableVariantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatisticsServiceMethodDescriptorSupplier("GetAvailableVariants"))
              .build();
        }
      }
    }
    return getGetAvailableVariantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest,
      com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> getGetVariantSalesOverTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVariantSalesOverTime",
      requestType = com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest.class,
      responseType = com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest,
      com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> getGetVariantSalesOverTimeMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest, com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> getGetVariantSalesOverTimeMethod;
    if ((getGetVariantSalesOverTimeMethod = StatisticsServiceGrpc.getGetVariantSalesOverTimeMethod) == null) {
      synchronized (StatisticsServiceGrpc.class) {
        if ((getGetVariantSalesOverTimeMethod = StatisticsServiceGrpc.getGetVariantSalesOverTimeMethod) == null) {
          StatisticsServiceGrpc.getGetVariantSalesOverTimeMethod = getGetVariantSalesOverTimeMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest, com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVariantSalesOverTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatisticsServiceMethodDescriptorSupplier("GetVariantSalesOverTime"))
              .build();
        }
      }
    }
    return getGetVariantSalesOverTimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest,
      com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> getGetStockLevelOverTimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStockLevelOverTime",
      requestType = com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest.class,
      responseType = com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest,
      com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> getGetStockLevelOverTimeMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest, com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> getGetStockLevelOverTimeMethod;
    if ((getGetStockLevelOverTimeMethod = StatisticsServiceGrpc.getGetStockLevelOverTimeMethod) == null) {
      synchronized (StatisticsServiceGrpc.class) {
        if ((getGetStockLevelOverTimeMethod = StatisticsServiceGrpc.getGetStockLevelOverTimeMethod) == null) {
          StatisticsServiceGrpc.getGetStockLevelOverTimeMethod = getGetStockLevelOverTimeMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest, com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStockLevelOverTime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new StatisticsServiceMethodDescriptorSupplier("GetStockLevelOverTime"))
              .build();
        }
      }
    }
    return getGetStockLevelOverTimeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StatisticsServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceStub>() {
        @java.lang.Override
        public StatisticsServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatisticsServiceStub(channel, callOptions);
        }
      };
    return StatisticsServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static StatisticsServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceBlockingV2Stub>() {
        @java.lang.Override
        public StatisticsServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatisticsServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return StatisticsServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StatisticsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceBlockingStub>() {
        @java.lang.Override
        public StatisticsServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatisticsServiceBlockingStub(channel, callOptions);
        }
      };
    return StatisticsServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StatisticsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StatisticsServiceFutureStub>() {
        @java.lang.Override
        public StatisticsServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StatisticsServiceFutureStub(channel, callOptions);
        }
      };
    return StatisticsServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAvailableVariants(com.ecmsp.statistics.v1.GetAvailableVariantsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetAvailableVariantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAvailableVariantsMethod(), responseObserver);
    }

    /**
     */
    default void getVariantSalesOverTime(com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVariantSalesOverTimeMethod(), responseObserver);
    }

    /**
     */
    default void getStockLevelOverTime(com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockLevelOverTimeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service StatisticsService.
   */
  public static abstract class StatisticsServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return StatisticsServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service StatisticsService.
   */
  public static final class StatisticsServiceStub
      extends io.grpc.stub.AbstractAsyncStub<StatisticsServiceStub> {
    private StatisticsServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatisticsServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatisticsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAvailableVariants(com.ecmsp.statistics.v1.GetAvailableVariantsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetAvailableVariantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAvailableVariantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVariantSalesOverTime(com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVariantSalesOverTimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStockLevelOverTime(com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockLevelOverTimeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service StatisticsService.
   */
  public static final class StatisticsServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<StatisticsServiceBlockingV2Stub> {
    private StatisticsServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatisticsServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatisticsServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetAvailableVariantsResponse getAvailableVariants(com.ecmsp.statistics.v1.GetAvailableVariantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableVariantsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse getVariantSalesOverTime(com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVariantSalesOverTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse getStockLevelOverTime(com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockLevelOverTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service StatisticsService.
   */
  public static final class StatisticsServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<StatisticsServiceBlockingStub> {
    private StatisticsServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatisticsServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatisticsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetAvailableVariantsResponse getAvailableVariants(com.ecmsp.statistics.v1.GetAvailableVariantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAvailableVariantsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse getVariantSalesOverTime(com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVariantSalesOverTimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse getStockLevelOverTime(com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockLevelOverTimeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service StatisticsService.
   */
  public static final class StatisticsServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<StatisticsServiceFutureStub> {
    private StatisticsServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StatisticsServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StatisticsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.statistics.v1.GetAvailableVariantsResponse> getAvailableVariants(
        com.ecmsp.statistics.v1.GetAvailableVariantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAvailableVariantsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse> getVariantSalesOverTime(
        com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVariantSalesOverTimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse> getStockLevelOverTime(
        com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockLevelOverTimeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AVAILABLE_VARIANTS = 0;
  private static final int METHODID_GET_VARIANT_SALES_OVER_TIME = 1;
  private static final int METHODID_GET_STOCK_LEVEL_OVER_TIME = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AVAILABLE_VARIANTS:
          serviceImpl.getAvailableVariants((com.ecmsp.statistics.v1.GetAvailableVariantsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetAvailableVariantsResponse>) responseObserver);
          break;
        case METHODID_GET_VARIANT_SALES_OVER_TIME:
          serviceImpl.getVariantSalesOverTime((com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse>) responseObserver);
          break;
        case METHODID_GET_STOCK_LEVEL_OVER_TIME:
          serviceImpl.getStockLevelOverTime((com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetAvailableVariantsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.statistics.v1.GetAvailableVariantsRequest,
              com.ecmsp.statistics.v1.GetAvailableVariantsResponse>(
                service, METHODID_GET_AVAILABLE_VARIANTS)))
        .addMethod(
          getGetVariantSalesOverTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.statistics.v1.GetVariantSalesOverTimeRequest,
              com.ecmsp.statistics.v1.GetVariantSalesOverTimeResponse>(
                service, METHODID_GET_VARIANT_SALES_OVER_TIME)))
        .addMethod(
          getGetStockLevelOverTimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.statistics.v1.GetStockLevelOverTimeRequest,
              com.ecmsp.statistics.v1.GetStockLevelOverTimeResponse>(
                service, METHODID_GET_STOCK_LEVEL_OVER_TIME)))
        .build();
  }

  private static abstract class StatisticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StatisticsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.statistics.v1.StatisticsServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StatisticsService");
    }
  }

  private static final class StatisticsServiceFileDescriptorSupplier
      extends StatisticsServiceBaseDescriptorSupplier {
    StatisticsServiceFileDescriptorSupplier() {}
  }

  private static final class StatisticsServiceMethodDescriptorSupplier
      extends StatisticsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    StatisticsServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (StatisticsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StatisticsServiceFileDescriptorSupplier())
              .addMethod(getGetAvailableVariantsMethod())
              .addMethod(getGetVariantSalesOverTimeMethod())
              .addMethod(getGetStockLevelOverTimeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
