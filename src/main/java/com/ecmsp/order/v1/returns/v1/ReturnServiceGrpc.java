package com.ecmsp.order.v1.returns.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: order/v1/returns/v1/return_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReturnServiceGrpc {

  private ReturnServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "order.v1.returns.v1.ReturnService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.CreateReturnRequest,
      com.ecmsp.order.v1.returns.v1.CreateReturnResponse> getCreateReturnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReturn",
      requestType = com.ecmsp.order.v1.returns.v1.CreateReturnRequest.class,
      responseType = com.ecmsp.order.v1.returns.v1.CreateReturnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.CreateReturnRequest,
      com.ecmsp.order.v1.returns.v1.CreateReturnResponse> getCreateReturnMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.CreateReturnRequest, com.ecmsp.order.v1.returns.v1.CreateReturnResponse> getCreateReturnMethod;
    if ((getCreateReturnMethod = ReturnServiceGrpc.getCreateReturnMethod) == null) {
      synchronized (ReturnServiceGrpc.class) {
        if ((getCreateReturnMethod = ReturnServiceGrpc.getCreateReturnMethod) == null) {
          ReturnServiceGrpc.getCreateReturnMethod = getCreateReturnMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.returns.v1.CreateReturnRequest, com.ecmsp.order.v1.returns.v1.CreateReturnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateReturn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.CreateReturnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.CreateReturnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReturnServiceMethodDescriptorSupplier("CreateReturn"))
              .build();
        }
      }
    }
    return getCreateReturnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.GetReturnRequest,
      com.ecmsp.order.v1.returns.v1.GetReturnResponse> getGetReturnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReturn",
      requestType = com.ecmsp.order.v1.returns.v1.GetReturnRequest.class,
      responseType = com.ecmsp.order.v1.returns.v1.GetReturnResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.GetReturnRequest,
      com.ecmsp.order.v1.returns.v1.GetReturnResponse> getGetReturnMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.GetReturnRequest, com.ecmsp.order.v1.returns.v1.GetReturnResponse> getGetReturnMethod;
    if ((getGetReturnMethod = ReturnServiceGrpc.getGetReturnMethod) == null) {
      synchronized (ReturnServiceGrpc.class) {
        if ((getGetReturnMethod = ReturnServiceGrpc.getGetReturnMethod) == null) {
          ReturnServiceGrpc.getGetReturnMethod = getGetReturnMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.returns.v1.GetReturnRequest, com.ecmsp.order.v1.returns.v1.GetReturnResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetReturn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.GetReturnRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.GetReturnResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReturnServiceMethodDescriptorSupplier("GetReturn"))
              .build();
        }
      }
    }
    return getGetReturnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest,
      com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> getListReturnsByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReturnsByUserId",
      requestType = com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest.class,
      responseType = com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest,
      com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> getListReturnsByUserIdMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest, com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> getListReturnsByUserIdMethod;
    if ((getListReturnsByUserIdMethod = ReturnServiceGrpc.getListReturnsByUserIdMethod) == null) {
      synchronized (ReturnServiceGrpc.class) {
        if ((getListReturnsByUserIdMethod = ReturnServiceGrpc.getListReturnsByUserIdMethod) == null) {
          ReturnServiceGrpc.getListReturnsByUserIdMethod = getListReturnsByUserIdMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest, com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListReturnsByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReturnServiceMethodDescriptorSupplier("ListReturnsByUserId"))
              .build();
        }
      }
    }
    return getListReturnsByUserIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsRequest,
      com.ecmsp.order.v1.returns.v1.ListReturnsResponse> getListReturnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReturns",
      requestType = com.ecmsp.order.v1.returns.v1.ListReturnsRequest.class,
      responseType = com.ecmsp.order.v1.returns.v1.ListReturnsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsRequest,
      com.ecmsp.order.v1.returns.v1.ListReturnsResponse> getListReturnsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.returns.v1.ListReturnsRequest, com.ecmsp.order.v1.returns.v1.ListReturnsResponse> getListReturnsMethod;
    if ((getListReturnsMethod = ReturnServiceGrpc.getListReturnsMethod) == null) {
      synchronized (ReturnServiceGrpc.class) {
        if ((getListReturnsMethod = ReturnServiceGrpc.getListReturnsMethod) == null) {
          ReturnServiceGrpc.getListReturnsMethod = getListReturnsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.returns.v1.ListReturnsRequest, com.ecmsp.order.v1.returns.v1.ListReturnsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListReturns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.ListReturnsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.returns.v1.ListReturnsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ReturnServiceMethodDescriptorSupplier("ListReturns"))
              .build();
        }
      }
    }
    return getListReturnsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReturnServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReturnServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReturnServiceStub>() {
        @java.lang.Override
        public ReturnServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReturnServiceStub(channel, callOptions);
        }
      };
    return ReturnServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ReturnServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReturnServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReturnServiceBlockingV2Stub>() {
        @java.lang.Override
        public ReturnServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReturnServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ReturnServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReturnServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReturnServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReturnServiceBlockingStub>() {
        @java.lang.Override
        public ReturnServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReturnServiceBlockingStub(channel, callOptions);
        }
      };
    return ReturnServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReturnServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReturnServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReturnServiceFutureStub>() {
        @java.lang.Override
        public ReturnServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReturnServiceFutureStub(channel, callOptions);
        }
      };
    return ReturnServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createReturn(com.ecmsp.order.v1.returns.v1.CreateReturnRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.CreateReturnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateReturnMethod(), responseObserver);
    }

    /**
     */
    default void getReturn(com.ecmsp.order.v1.returns.v1.GetReturnRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.GetReturnResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetReturnMethod(), responseObserver);
    }

    /**
     */
    default void listReturnsByUserId(com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListReturnsByUserIdMethod(), responseObserver);
    }

    /**
     */
    default void listReturns(com.ecmsp.order.v1.returns.v1.ListReturnsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListReturnsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReturnService.
   */
  public static abstract class ReturnServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReturnServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReturnService.
   */
  public static final class ReturnServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReturnServiceStub> {
    private ReturnServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReturnServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReturnServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReturn(com.ecmsp.order.v1.returns.v1.CreateReturnRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.CreateReturnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateReturnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReturn(com.ecmsp.order.v1.returns.v1.GetReturnRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.GetReturnResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetReturnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listReturnsByUserId(com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListReturnsByUserIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listReturns(com.ecmsp.order.v1.returns.v1.ListReturnsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListReturnsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReturnService.
   */
  public static final class ReturnServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ReturnServiceBlockingV2Stub> {
    private ReturnServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReturnServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReturnServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.CreateReturnResponse createReturn(com.ecmsp.order.v1.returns.v1.CreateReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReturnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.GetReturnResponse getReturn(com.ecmsp.order.v1.returns.v1.GetReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReturnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse listReturnsByUserId(com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReturnsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.ListReturnsResponse listReturns(com.ecmsp.order.v1.returns.v1.ListReturnsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReturnsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ReturnService.
   */
  public static final class ReturnServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReturnServiceBlockingStub> {
    private ReturnServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReturnServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReturnServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.CreateReturnResponse createReturn(com.ecmsp.order.v1.returns.v1.CreateReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateReturnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.GetReturnResponse getReturn(com.ecmsp.order.v1.returns.v1.GetReturnRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetReturnMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse listReturnsByUserId(com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReturnsByUserIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.returns.v1.ListReturnsResponse listReturns(com.ecmsp.order.v1.returns.v1.ListReturnsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReturnsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReturnService.
   */
  public static final class ReturnServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReturnServiceFutureStub> {
    private ReturnServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReturnServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReturnServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.returns.v1.CreateReturnResponse> createReturn(
        com.ecmsp.order.v1.returns.v1.CreateReturnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateReturnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.returns.v1.GetReturnResponse> getReturn(
        com.ecmsp.order.v1.returns.v1.GetReturnRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetReturnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse> listReturnsByUserId(
        com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListReturnsByUserIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.returns.v1.ListReturnsResponse> listReturns(
        com.ecmsp.order.v1.returns.v1.ListReturnsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListReturnsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RETURN = 0;
  private static final int METHODID_GET_RETURN = 1;
  private static final int METHODID_LIST_RETURNS_BY_USER_ID = 2;
  private static final int METHODID_LIST_RETURNS = 3;

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
        case METHODID_CREATE_RETURN:
          serviceImpl.createReturn((com.ecmsp.order.v1.returns.v1.CreateReturnRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.CreateReturnResponse>) responseObserver);
          break;
        case METHODID_GET_RETURN:
          serviceImpl.getReturn((com.ecmsp.order.v1.returns.v1.GetReturnRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.GetReturnResponse>) responseObserver);
          break;
        case METHODID_LIST_RETURNS_BY_USER_ID:
          serviceImpl.listReturnsByUserId((com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse>) responseObserver);
          break;
        case METHODID_LIST_RETURNS:
          serviceImpl.listReturns((com.ecmsp.order.v1.returns.v1.ListReturnsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.returns.v1.ListReturnsResponse>) responseObserver);
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
          getCreateReturnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.returns.v1.CreateReturnRequest,
              com.ecmsp.order.v1.returns.v1.CreateReturnResponse>(
                service, METHODID_CREATE_RETURN)))
        .addMethod(
          getGetReturnMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.returns.v1.GetReturnRequest,
              com.ecmsp.order.v1.returns.v1.GetReturnResponse>(
                service, METHODID_GET_RETURN)))
        .addMethod(
          getListReturnsByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdRequest,
              com.ecmsp.order.v1.returns.v1.ListReturnsByUserIdResponse>(
                service, METHODID_LIST_RETURNS_BY_USER_ID)))
        .addMethod(
          getListReturnsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.returns.v1.ListReturnsRequest,
              com.ecmsp.order.v1.returns.v1.ListReturnsResponse>(
                service, METHODID_LIST_RETURNS)))
        .build();
  }

  private static abstract class ReturnServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReturnServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.order.v1.returns.v1.ReturnServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReturnService");
    }
  }

  private static final class ReturnServiceFileDescriptorSupplier
      extends ReturnServiceBaseDescriptorSupplier {
    ReturnServiceFileDescriptorSupplier() {}
  }

  private static final class ReturnServiceMethodDescriptorSupplier
      extends ReturnServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReturnServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ReturnServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReturnServiceFileDescriptorSupplier())
              .addMethod(getCreateReturnMethod())
              .addMethod(getGetReturnMethod())
              .addMethod(getListReturnsByUserIdMethod())
              .addMethod(getListReturnsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
