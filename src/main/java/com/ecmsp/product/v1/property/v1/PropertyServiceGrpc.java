package com.ecmsp.product.v1.property.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/property/v1/property_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PropertyServiceGrpc {

  private PropertyServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.property.v1.PropertyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.CreatePropertyRequest,
      com.ecmsp.product.v1.property.v1.CreatePropertyResponse> getCreatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateProperty",
      requestType = com.ecmsp.product.v1.property.v1.CreatePropertyRequest.class,
      responseType = com.ecmsp.product.v1.property.v1.CreatePropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.CreatePropertyRequest,
      com.ecmsp.product.v1.property.v1.CreatePropertyResponse> getCreatePropertyMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.CreatePropertyRequest, com.ecmsp.product.v1.property.v1.CreatePropertyResponse> getCreatePropertyMethod;
    if ((getCreatePropertyMethod = PropertyServiceGrpc.getCreatePropertyMethod) == null) {
      synchronized (PropertyServiceGrpc.class) {
        if ((getCreatePropertyMethod = PropertyServiceGrpc.getCreatePropertyMethod) == null) {
          PropertyServiceGrpc.getCreatePropertyMethod = getCreatePropertyMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.property.v1.CreatePropertyRequest, com.ecmsp.product.v1.property.v1.CreatePropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.property.v1.CreatePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.property.v1.CreatePropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PropertyServiceMethodDescriptorSupplier("CreateProperty"))
              .build();
        }
      }
    }
    return getCreatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.DeletePropertyRequest,
      com.ecmsp.product.v1.property.v1.DeletePropertyResponse> getDeletePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProperty",
      requestType = com.ecmsp.product.v1.property.v1.DeletePropertyRequest.class,
      responseType = com.ecmsp.product.v1.property.v1.DeletePropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.DeletePropertyRequest,
      com.ecmsp.product.v1.property.v1.DeletePropertyResponse> getDeletePropertyMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.property.v1.DeletePropertyRequest, com.ecmsp.product.v1.property.v1.DeletePropertyResponse> getDeletePropertyMethod;
    if ((getDeletePropertyMethod = PropertyServiceGrpc.getDeletePropertyMethod) == null) {
      synchronized (PropertyServiceGrpc.class) {
        if ((getDeletePropertyMethod = PropertyServiceGrpc.getDeletePropertyMethod) == null) {
          PropertyServiceGrpc.getDeletePropertyMethod = getDeletePropertyMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.property.v1.DeletePropertyRequest, com.ecmsp.product.v1.property.v1.DeletePropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.property.v1.DeletePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.property.v1.DeletePropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PropertyServiceMethodDescriptorSupplier("DeleteProperty"))
              .build();
        }
      }
    }
    return getDeletePropertyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PropertyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyServiceStub>() {
        @java.lang.Override
        public PropertyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyServiceStub(channel, callOptions);
        }
      };
    return PropertyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static PropertyServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyServiceBlockingV2Stub>() {
        @java.lang.Override
        public PropertyServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return PropertyServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PropertyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyServiceBlockingStub>() {
        @java.lang.Override
        public PropertyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyServiceBlockingStub(channel, callOptions);
        }
      };
    return PropertyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PropertyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PropertyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PropertyServiceFutureStub>() {
        @java.lang.Override
        public PropertyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PropertyServiceFutureStub(channel, callOptions);
        }
      };
    return PropertyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createProperty(com.ecmsp.product.v1.property.v1.CreatePropertyRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.CreatePropertyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePropertyMethod(), responseObserver);
    }

    /**
     */
    default void deleteProperty(com.ecmsp.product.v1.property.v1.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.DeletePropertyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePropertyMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PropertyService.
   */
  public static abstract class PropertyServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PropertyServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PropertyService.
   */
  public static final class PropertyServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PropertyServiceStub> {
    private PropertyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createProperty(com.ecmsp.product.v1.property.v1.CreatePropertyRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.CreatePropertyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProperty(com.ecmsp.product.v1.property.v1.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.DeletePropertyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PropertyService.
   */
  public static final class PropertyServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<PropertyServiceBlockingV2Stub> {
    private PropertyServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.property.v1.CreatePropertyResponse createProperty(com.ecmsp.product.v1.property.v1.CreatePropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.property.v1.DeletePropertyResponse deleteProperty(com.ecmsp.product.v1.property.v1.DeletePropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePropertyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service PropertyService.
   */
  public static final class PropertyServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PropertyServiceBlockingStub> {
    private PropertyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.property.v1.CreatePropertyResponse createProperty(com.ecmsp.product.v1.property.v1.CreatePropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.property.v1.DeletePropertyResponse deleteProperty(com.ecmsp.product.v1.property.v1.DeletePropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePropertyMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PropertyService.
   */
  public static final class PropertyServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PropertyServiceFutureStub> {
    private PropertyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PropertyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PropertyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.property.v1.CreatePropertyResponse> createProperty(
        com.ecmsp.product.v1.property.v1.CreatePropertyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.property.v1.DeletePropertyResponse> deleteProperty(
        com.ecmsp.product.v1.property.v1.DeletePropertyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROPERTY = 0;
  private static final int METHODID_DELETE_PROPERTY = 1;

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
        case METHODID_CREATE_PROPERTY:
          serviceImpl.createProperty((com.ecmsp.product.v1.property.v1.CreatePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.CreatePropertyResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTY:
          serviceImpl.deleteProperty((com.ecmsp.product.v1.property.v1.DeletePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.property.v1.DeletePropertyResponse>) responseObserver);
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
          getCreatePropertyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.property.v1.CreatePropertyRequest,
              com.ecmsp.product.v1.property.v1.CreatePropertyResponse>(
                service, METHODID_CREATE_PROPERTY)))
        .addMethod(
          getDeletePropertyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.property.v1.DeletePropertyRequest,
              com.ecmsp.product.v1.property.v1.DeletePropertyResponse>(
                service, METHODID_DELETE_PROPERTY)))
        .build();
  }

  private static abstract class PropertyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PropertyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.property.v1.PropertyServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PropertyService");
    }
  }

  private static final class PropertyServiceFileDescriptorSupplier
      extends PropertyServiceBaseDescriptorSupplier {
    PropertyServiceFileDescriptorSupplier() {}
  }

  private static final class PropertyServiceMethodDescriptorSupplier
      extends PropertyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PropertyServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PropertyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PropertyServiceFileDescriptorSupplier())
              .addMethod(getCreatePropertyMethod())
              .addMethod(getDeletePropertyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
