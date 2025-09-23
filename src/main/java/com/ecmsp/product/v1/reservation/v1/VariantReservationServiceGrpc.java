package com.ecmsp.product.v1.reservation.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/reservation/v1/variant_reservation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VariantReservationServiceGrpc {

  private VariantReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.reservation.v1.VariantReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> getCreateVariantsReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVariantsReservation",
      requestType = com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest.class,
      responseType = com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> getCreateVariantsReservationMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> getCreateVariantsReservationMethod;
    if ((getCreateVariantsReservationMethod = VariantReservationServiceGrpc.getCreateVariantsReservationMethod) == null) {
      synchronized (VariantReservationServiceGrpc.class) {
        if ((getCreateVariantsReservationMethod = VariantReservationServiceGrpc.getCreateVariantsReservationMethod) == null) {
          VariantReservationServiceGrpc.getCreateVariantsReservationMethod = getCreateVariantsReservationMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVariantsReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VariantReservationServiceMethodDescriptorSupplier("CreateVariantsReservation"))
              .build();
        }
      }
    }
    return getCreateVariantsReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> getRemoveVariantsReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveVariantsReservation",
      requestType = com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest.class,
      responseType = com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> getRemoveVariantsReservationMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> getRemoveVariantsReservationMethod;
    if ((getRemoveVariantsReservationMethod = VariantReservationServiceGrpc.getRemoveVariantsReservationMethod) == null) {
      synchronized (VariantReservationServiceGrpc.class) {
        if ((getRemoveVariantsReservationMethod = VariantReservationServiceGrpc.getRemoveVariantsReservationMethod) == null) {
          VariantReservationServiceGrpc.getRemoveVariantsReservationMethod = getRemoveVariantsReservationMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveVariantsReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VariantReservationServiceMethodDescriptorSupplier("RemoveVariantsReservation"))
              .build();
        }
      }
    }
    return getRemoveVariantsReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> getGetVariantsReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVariantsReservation",
      requestType = com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest.class,
      responseType = com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest,
      com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> getGetVariantsReservationMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> getGetVariantsReservationMethod;
    if ((getGetVariantsReservationMethod = VariantReservationServiceGrpc.getGetVariantsReservationMethod) == null) {
      synchronized (VariantReservationServiceGrpc.class) {
        if ((getGetVariantsReservationMethod = VariantReservationServiceGrpc.getGetVariantsReservationMethod) == null) {
          VariantReservationServiceGrpc.getGetVariantsReservationMethod = getGetVariantsReservationMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest, com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVariantsReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VariantReservationServiceMethodDescriptorSupplier("GetVariantsReservation"))
              .build();
        }
      }
    }
    return getGetVariantsReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VariantReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceStub>() {
        @java.lang.Override
        public VariantReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantReservationServiceStub(channel, callOptions);
        }
      };
    return VariantReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VariantReservationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceBlockingV2Stub>() {
        @java.lang.Override
        public VariantReservationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantReservationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return VariantReservationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VariantReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceBlockingStub>() {
        @java.lang.Override
        public VariantReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return VariantReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VariantReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantReservationServiceFutureStub>() {
        @java.lang.Override
        public VariantReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantReservationServiceFutureStub(channel, callOptions);
        }
      };
    return VariantReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createVariantsReservation(com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVariantsReservationMethod(), responseObserver);
    }

    /**
     */
    default void removeVariantsReservation(com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveVariantsReservationMethod(), responseObserver);
    }

    /**
     */
    default void getVariantsReservation(com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetVariantsReservationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VariantReservationService.
   */
  public static abstract class VariantReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VariantReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VariantReservationService.
   */
  public static final class VariantReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VariantReservationServiceStub> {
    private VariantReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createVariantsReservation(com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVariantsReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeVariantsReservation(com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveVariantsReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVariantsReservation(com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetVariantsReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VariantReservationService.
   */
  public static final class VariantReservationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VariantReservationServiceBlockingV2Stub> {
    private VariantReservationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantReservationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantReservationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse createVariantsReservation(com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVariantsReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse removeVariantsReservation(com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveVariantsReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse getVariantsReservation(com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVariantsReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service VariantReservationService.
   */
  public static final class VariantReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VariantReservationServiceBlockingStub> {
    private VariantReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse createVariantsReservation(com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVariantsReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse removeVariantsReservation(com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveVariantsReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse getVariantsReservation(com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetVariantsReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VariantReservationService.
   */
  public static final class VariantReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VariantReservationServiceFutureStub> {
    private VariantReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse> createVariantsReservation(
        com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVariantsReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse> removeVariantsReservation(
        com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveVariantsReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse> getVariantsReservation(
        com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetVariantsReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VARIANTS_RESERVATION = 0;
  private static final int METHODID_REMOVE_VARIANTS_RESERVATION = 1;
  private static final int METHODID_GET_VARIANTS_RESERVATION = 2;

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
        case METHODID_CREATE_VARIANTS_RESERVATION:
          serviceImpl.createVariantsReservation((com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse>) responseObserver);
          break;
        case METHODID_REMOVE_VARIANTS_RESERVATION:
          serviceImpl.removeVariantsReservation((com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse>) responseObserver);
          break;
        case METHODID_GET_VARIANTS_RESERVATION:
          serviceImpl.getVariantsReservation((com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse>) responseObserver);
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
          getCreateVariantsReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationRequest,
              com.ecmsp.product.v1.reservation.v1.CreateVariantsReservationResponse>(
                service, METHODID_CREATE_VARIANTS_RESERVATION)))
        .addMethod(
          getRemoveVariantsReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationRequest,
              com.ecmsp.product.v1.reservation.v1.RemoveVariantsReservationResponse>(
                service, METHODID_REMOVE_VARIANTS_RESERVATION)))
        .addMethod(
          getGetVariantsReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.reservation.v1.GetVariantsReservationRequest,
              com.ecmsp.product.v1.reservation.v1.GetVariantsReservationResponse>(
                service, METHODID_GET_VARIANTS_RESERVATION)))
        .build();
  }

  private static abstract class VariantReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VariantReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.reservation.v1.VariantReservationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VariantReservationService");
    }
  }

  private static final class VariantReservationServiceFileDescriptorSupplier
      extends VariantReservationServiceBaseDescriptorSupplier {
    VariantReservationServiceFileDescriptorSupplier() {}
  }

  private static final class VariantReservationServiceMethodDescriptorSupplier
      extends VariantReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VariantReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VariantReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VariantReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateVariantsReservationMethod())
              .addMethod(getRemoveVariantsReservationMethod())
              .addMethod(getGetVariantsReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
