package com.ecmsp.product.v1.variant.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/variant/v1/variant_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VariantServiceGrpc {

  private VariantServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.variant.v1.VariantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.CreateVariantRequest,
      com.ecmsp.product.v1.variant.v1.CreateVariantResponse> getCreateVariantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateVariant",
      requestType = com.ecmsp.product.v1.variant.v1.CreateVariantRequest.class,
      responseType = com.ecmsp.product.v1.variant.v1.CreateVariantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.CreateVariantRequest,
      com.ecmsp.product.v1.variant.v1.CreateVariantResponse> getCreateVariantMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.CreateVariantRequest, com.ecmsp.product.v1.variant.v1.CreateVariantResponse> getCreateVariantMethod;
    if ((getCreateVariantMethod = VariantServiceGrpc.getCreateVariantMethod) == null) {
      synchronized (VariantServiceGrpc.class) {
        if ((getCreateVariantMethod = VariantServiceGrpc.getCreateVariantMethod) == null) {
          VariantServiceGrpc.getCreateVariantMethod = getCreateVariantMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.variant.v1.CreateVariantRequest, com.ecmsp.product.v1.variant.v1.CreateVariantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateVariant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.variant.v1.CreateVariantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.variant.v1.CreateVariantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VariantServiceMethodDescriptorSupplier("CreateVariant"))
              .build();
        }
      }
    }
    return getCreateVariantMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.DeleteVariantRequest,
      com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> getDeleteVariantMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteVariant",
      requestType = com.ecmsp.product.v1.variant.v1.DeleteVariantRequest.class,
      responseType = com.ecmsp.product.v1.variant.v1.DeleteVariantResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.DeleteVariantRequest,
      com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> getDeleteVariantMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.variant.v1.DeleteVariantRequest, com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> getDeleteVariantMethod;
    if ((getDeleteVariantMethod = VariantServiceGrpc.getDeleteVariantMethod) == null) {
      synchronized (VariantServiceGrpc.class) {
        if ((getDeleteVariantMethod = VariantServiceGrpc.getDeleteVariantMethod) == null) {
          VariantServiceGrpc.getDeleteVariantMethod = getDeleteVariantMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.variant.v1.DeleteVariantRequest, com.ecmsp.product.v1.variant.v1.DeleteVariantResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteVariant"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.variant.v1.DeleteVariantRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.variant.v1.DeleteVariantResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VariantServiceMethodDescriptorSupplier("DeleteVariant"))
              .build();
        }
      }
    }
    return getDeleteVariantMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VariantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantServiceStub>() {
        @java.lang.Override
        public VariantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantServiceStub(channel, callOptions);
        }
      };
    return VariantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static VariantServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantServiceBlockingV2Stub>() {
        @java.lang.Override
        public VariantServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return VariantServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VariantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantServiceBlockingStub>() {
        @java.lang.Override
        public VariantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantServiceBlockingStub(channel, callOptions);
        }
      };
    return VariantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VariantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VariantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VariantServiceFutureStub>() {
        @java.lang.Override
        public VariantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VariantServiceFutureStub(channel, callOptions);
        }
      };
    return VariantServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createVariant(com.ecmsp.product.v1.variant.v1.CreateVariantRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.CreateVariantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateVariantMethod(), responseObserver);
    }

    /**
     */
    default void deleteVariant(com.ecmsp.product.v1.variant.v1.DeleteVariantRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteVariantMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VariantService.
   */
  public static abstract class VariantServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VariantServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VariantService.
   */
  public static final class VariantServiceStub
      extends io.grpc.stub.AbstractAsyncStub<VariantServiceStub> {
    private VariantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantServiceStub(channel, callOptions);
    }

    /**
     */
    public void createVariant(com.ecmsp.product.v1.variant.v1.CreateVariantRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.CreateVariantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateVariantMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVariant(com.ecmsp.product.v1.variant.v1.DeleteVariantRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteVariantMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VariantService.
   */
  public static final class VariantServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<VariantServiceBlockingV2Stub> {
    private VariantServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.variant.v1.CreateVariantResponse createVariant(com.ecmsp.product.v1.variant.v1.CreateVariantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVariantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.variant.v1.DeleteVariantResponse deleteVariant(com.ecmsp.product.v1.variant.v1.DeleteVariantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVariantMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service VariantService.
   */
  public static final class VariantServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VariantServiceBlockingStub> {
    private VariantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.variant.v1.CreateVariantResponse createVariant(com.ecmsp.product.v1.variant.v1.CreateVariantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateVariantMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.variant.v1.DeleteVariantResponse deleteVariant(com.ecmsp.product.v1.variant.v1.DeleteVariantRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteVariantMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VariantService.
   */
  public static final class VariantServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<VariantServiceFutureStub> {
    private VariantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VariantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VariantServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.variant.v1.CreateVariantResponse> createVariant(
        com.ecmsp.product.v1.variant.v1.CreateVariantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateVariantMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.variant.v1.DeleteVariantResponse> deleteVariant(
        com.ecmsp.product.v1.variant.v1.DeleteVariantRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteVariantMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_VARIANT = 0;
  private static final int METHODID_DELETE_VARIANT = 1;

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
        case METHODID_CREATE_VARIANT:
          serviceImpl.createVariant((com.ecmsp.product.v1.variant.v1.CreateVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.CreateVariantResponse>) responseObserver);
          break;
        case METHODID_DELETE_VARIANT:
          serviceImpl.deleteVariant((com.ecmsp.product.v1.variant.v1.DeleteVariantRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.variant.v1.DeleteVariantResponse>) responseObserver);
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
          getCreateVariantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.variant.v1.CreateVariantRequest,
              com.ecmsp.product.v1.variant.v1.CreateVariantResponse>(
                service, METHODID_CREATE_VARIANT)))
        .addMethod(
          getDeleteVariantMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.variant.v1.DeleteVariantRequest,
              com.ecmsp.product.v1.variant.v1.DeleteVariantResponse>(
                service, METHODID_DELETE_VARIANT)))
        .build();
  }

  private static abstract class VariantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VariantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.variant.v1.VariantServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VariantService");
    }
  }

  private static final class VariantServiceFileDescriptorSupplier
      extends VariantServiceBaseDescriptorSupplier {
    VariantServiceFileDescriptorSupplier() {}
  }

  private static final class VariantServiceMethodDescriptorSupplier
      extends VariantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VariantServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (VariantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VariantServiceFileDescriptorSupplier())
              .addMethod(getCreateVariantMethod())
              .addMethod(getDeleteVariantMethod())
              .build();
        }
      }
    }
    return result;
  }
}
