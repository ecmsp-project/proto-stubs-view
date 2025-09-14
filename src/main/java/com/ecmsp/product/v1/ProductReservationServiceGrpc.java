package com.ecmsp.product.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/product_reservation_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductReservationServiceGrpc {

  private ProductReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.ProductReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReserveProductsRequest,
      com.ecmsp.product.v1.ReserveProductsResponse> getReserveProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReserveProducts",
      requestType = com.ecmsp.product.v1.ReserveProductsRequest.class,
      responseType = com.ecmsp.product.v1.ReserveProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReserveProductsRequest,
      com.ecmsp.product.v1.ReserveProductsResponse> getReserveProductsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReserveProductsRequest, com.ecmsp.product.v1.ReserveProductsResponse> getReserveProductsMethod;
    if ((getReserveProductsMethod = ProductReservationServiceGrpc.getReserveProductsMethod) == null) {
      synchronized (ProductReservationServiceGrpc.class) {
        if ((getReserveProductsMethod = ProductReservationServiceGrpc.getReserveProductsMethod) == null) {
          ProductReservationServiceGrpc.getReserveProductsMethod = getReserveProductsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.ReserveProductsRequest, com.ecmsp.product.v1.ReserveProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReserveProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.ReserveProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.ReserveProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductReservationServiceMethodDescriptorSupplier("ReserveProducts"))
              .build();
        }
      }
    }
    return getReserveProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReleaseReservationRequest,
      com.ecmsp.product.v1.ReleaseReservationResponse> getReleaseReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseReservation",
      requestType = com.ecmsp.product.v1.ReleaseReservationRequest.class,
      responseType = com.ecmsp.product.v1.ReleaseReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReleaseReservationRequest,
      com.ecmsp.product.v1.ReleaseReservationResponse> getReleaseReservationMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.ReleaseReservationRequest, com.ecmsp.product.v1.ReleaseReservationResponse> getReleaseReservationMethod;
    if ((getReleaseReservationMethod = ProductReservationServiceGrpc.getReleaseReservationMethod) == null) {
      synchronized (ProductReservationServiceGrpc.class) {
        if ((getReleaseReservationMethod = ProductReservationServiceGrpc.getReleaseReservationMethod) == null) {
          ProductReservationServiceGrpc.getReleaseReservationMethod = getReleaseReservationMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.ReleaseReservationRequest, com.ecmsp.product.v1.ReleaseReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.ReleaseReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.ReleaseReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductReservationServiceMethodDescriptorSupplier("ReleaseReservation"))
              .build();
        }
      }
    }
    return getReleaseReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceStub>() {
        @java.lang.Override
        public ProductReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReservationServiceStub(channel, callOptions);
        }
      };
    return ProductReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductReservationServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductReservationServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReservationServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductReservationServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceBlockingStub>() {
        @java.lang.Override
        public ProductReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductReservationServiceFutureStub>() {
        @java.lang.Override
        public ProductReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ProductReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void reserveProducts(com.ecmsp.product.v1.ReserveProductsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReserveProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveProductsMethod(), responseObserver);
    }

    /**
     */
    default void releaseReservation(com.ecmsp.product.v1.ReleaseReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReleaseReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseReservationMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductReservationService.
   */
  public static abstract class ProductReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductReservationService.
   */
  public static final class ProductReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductReservationServiceStub> {
    private ProductReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void reserveProducts(com.ecmsp.product.v1.ReserveProductsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReserveProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void releaseReservation(com.ecmsp.product.v1.ReleaseReservationRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReleaseReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductReservationService.
   */
  public static final class ProductReservationServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductReservationServiceBlockingV2Stub> {
    private ProductReservationServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReservationServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReservationServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.ReserveProductsResponse reserveProducts(com.ecmsp.product.v1.ReserveProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.ReleaseReservationResponse releaseReservation(com.ecmsp.product.v1.ReleaseReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductReservationService.
   */
  public static final class ProductReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductReservationServiceBlockingStub> {
    private ProductReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.product.v1.ReserveProductsResponse reserveProducts(com.ecmsp.product.v1.ReserveProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveProductsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.product.v1.ReleaseReservationResponse releaseReservation(com.ecmsp.product.v1.ReleaseReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductReservationService.
   */
  public static final class ProductReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductReservationServiceFutureStub> {
    private ProductReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.ReserveProductsResponse> reserveProducts(
        com.ecmsp.product.v1.ReserveProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveProductsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.ReleaseReservationResponse> releaseReservation(
        com.ecmsp.product.v1.ReleaseReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESERVE_PRODUCTS = 0;
  private static final int METHODID_RELEASE_RESERVATION = 1;

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
        case METHODID_RESERVE_PRODUCTS:
          serviceImpl.reserveProducts((com.ecmsp.product.v1.ReserveProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReserveProductsResponse>) responseObserver);
          break;
        case METHODID_RELEASE_RESERVATION:
          serviceImpl.releaseReservation((com.ecmsp.product.v1.ReleaseReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.ReleaseReservationResponse>) responseObserver);
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
          getReserveProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.ReserveProductsRequest,
              com.ecmsp.product.v1.ReserveProductsResponse>(
                service, METHODID_RESERVE_PRODUCTS)))
        .addMethod(
          getReleaseReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.ReleaseReservationRequest,
              com.ecmsp.product.v1.ReleaseReservationResponse>(
                service, METHODID_RELEASE_RESERVATION)))
        .build();
  }

  private static abstract class ProductReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.ProductReservationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductReservationService");
    }
  }

  private static final class ProductReservationServiceFileDescriptorSupplier
      extends ProductReservationServiceBaseDescriptorSupplier {
    ProductReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ProductReservationServiceMethodDescriptorSupplier
      extends ProductReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductReservationServiceFileDescriptorSupplier())
              .addMethod(getReserveProductsMethod())
              .addMethod(getReleaseReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
