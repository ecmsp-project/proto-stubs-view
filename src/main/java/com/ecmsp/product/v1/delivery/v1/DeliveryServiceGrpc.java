package com.ecmsp.product.v1.delivery.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/delivery/v1/delivery_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DeliveryServiceGrpc {

  private DeliveryServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.delivery.v1.DeliveryService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest,
      com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> getRecordDeliveryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordDelivery",
      requestType = com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest.class,
      responseType = com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest,
      com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> getRecordDeliveryMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest, com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> getRecordDeliveryMethod;
    if ((getRecordDeliveryMethod = DeliveryServiceGrpc.getRecordDeliveryMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getRecordDeliveryMethod = DeliveryServiceGrpc.getRecordDeliveryMethod) == null) {
          DeliveryServiceGrpc.getRecordDeliveryMethod = getRecordDeliveryMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest, com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordDelivery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("RecordDelivery"))
              .build();
        }
      }
    }
    return getRecordDeliveryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest,
      com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> getListDeliveriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeliveries",
      requestType = com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest.class,
      responseType = com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest,
      com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> getListDeliveriesMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest, com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> getListDeliveriesMethod;
    if ((getListDeliveriesMethod = DeliveryServiceGrpc.getListDeliveriesMethod) == null) {
      synchronized (DeliveryServiceGrpc.class) {
        if ((getListDeliveriesMethod = DeliveryServiceGrpc.getListDeliveriesMethod) == null) {
          DeliveryServiceGrpc.getListDeliveriesMethod = getListDeliveriesMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest, com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDeliveries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeliveryServiceMethodDescriptorSupplier("ListDeliveries"))
              .build();
        }
      }
    }
    return getListDeliveriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeliveryServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceStub>() {
        @java.lang.Override
        public DeliveryServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceStub(channel, callOptions);
        }
      };
    return DeliveryServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static DeliveryServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingV2Stub>() {
        @java.lang.Override
        public DeliveryServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return DeliveryServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeliveryServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceBlockingStub>() {
        @java.lang.Override
        public DeliveryServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceBlockingStub(channel, callOptions);
        }
      };
    return DeliveryServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeliveryServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeliveryServiceFutureStub>() {
        @java.lang.Override
        public DeliveryServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeliveryServiceFutureStub(channel, callOptions);
        }
      };
    return DeliveryServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void recordDelivery(com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordDeliveryMethod(), responseObserver);
    }

    /**
     */
    default void listDeliveries(com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDeliveriesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DeliveryService.
   */
  public static abstract class DeliveryServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DeliveryServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DeliveryServiceStub> {
    private DeliveryServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceStub(channel, callOptions);
    }

    /**
     */
    public void recordDelivery(com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordDeliveryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDeliveries(com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDeliveriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<DeliveryServiceBlockingV2Stub> {
    private DeliveryServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse recordDelivery(com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordDeliveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse listDeliveries(com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DeliveryServiceBlockingStub> {
    private DeliveryServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse recordDelivery(com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordDeliveryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse listDeliveries(com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDeliveriesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DeliveryService.
   */
  public static final class DeliveryServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DeliveryServiceFutureStub> {
    private DeliveryServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeliveryServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeliveryServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse> recordDelivery(
        com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordDeliveryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse> listDeliveries(
        com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDeliveriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_DELIVERY = 0;
  private static final int METHODID_LIST_DELIVERIES = 1;

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
        case METHODID_RECORD_DELIVERY:
          serviceImpl.recordDelivery((com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse>) responseObserver);
          break;
        case METHODID_LIST_DELIVERIES:
          serviceImpl.listDeliveries((com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse>) responseObserver);
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
          getRecordDeliveryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.delivery.v1.RecordDeliveryRequest,
              com.ecmsp.product.v1.delivery.v1.RecordDeliveryResponse>(
                service, METHODID_RECORD_DELIVERY)))
        .addMethod(
          getListDeliveriesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.delivery.v1.ListDeliveriesRequest,
              com.ecmsp.product.v1.delivery.v1.ListDeliveriesResponse>(
                service, METHODID_LIST_DELIVERIES)))
        .build();
  }

  private static abstract class DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeliveryServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.delivery.v1.DeliveryServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeliveryService");
    }
  }

  private static final class DeliveryServiceFileDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier {
    DeliveryServiceFileDescriptorSupplier() {}
  }

  private static final class DeliveryServiceMethodDescriptorSupplier
      extends DeliveryServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DeliveryServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (DeliveryServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeliveryServiceFileDescriptorSupplier())
              .addMethod(getRecordDeliveryMethod())
              .addMethod(getListDeliveriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
