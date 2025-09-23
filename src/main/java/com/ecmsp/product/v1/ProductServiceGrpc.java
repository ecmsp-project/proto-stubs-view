package com.ecmsp.product.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: product/v1/product_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "product.v1.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsRequest,
      com.ecmsp.product.v1.GetProductsResponse> getGetProductsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProducts",
      requestType = com.ecmsp.product.v1.GetProductsRequest.class,
      responseType = com.ecmsp.product.v1.GetProductsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsRequest,
      com.ecmsp.product.v1.GetProductsResponse> getGetProductsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsRequest, com.ecmsp.product.v1.GetProductsResponse> getGetProductsMethod;
    if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsMethod = ProductServiceGrpc.getGetProductsMethod) == null) {
          ProductServiceGrpc.getGetProductsMethod = getGetProductsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.GetProductsRequest, com.ecmsp.product.v1.GetProductsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProducts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProducts"))
              .build();
        }
      }
    }
    return getGetProductsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsByQueryRequest,
      com.ecmsp.product.v1.GetProductsByQueryResponse> getGetProductsByQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductsByQuery",
      requestType = com.ecmsp.product.v1.GetProductsByQueryRequest.class,
      responseType = com.ecmsp.product.v1.GetProductsByQueryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsByQueryRequest,
      com.ecmsp.product.v1.GetProductsByQueryResponse> getGetProductsByQueryMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductsByQueryRequest, com.ecmsp.product.v1.GetProductsByQueryResponse> getGetProductsByQueryMethod;
    if ((getGetProductsByQueryMethod = ProductServiceGrpc.getGetProductsByQueryMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductsByQueryMethod = ProductServiceGrpc.getGetProductsByQueryMethod) == null) {
          ProductServiceGrpc.getGetProductsByQueryMethod = getGetProductsByQueryMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.GetProductsByQueryRequest, com.ecmsp.product.v1.GetProductsByQueryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductsByQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductsByQueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductsByQueryResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductsByQuery"))
              .build();
        }
      }
    }
    return getGetProductsByQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductDetailsRequest,
      com.ecmsp.product.v1.GetProductDetailsResponse> getGetProductDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProductDetails",
      requestType = com.ecmsp.product.v1.GetProductDetailsRequest.class,
      responseType = com.ecmsp.product.v1.GetProductDetailsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductDetailsRequest,
      com.ecmsp.product.v1.GetProductDetailsResponse> getGetProductDetailsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.product.v1.GetProductDetailsRequest, com.ecmsp.product.v1.GetProductDetailsResponse> getGetProductDetailsMethod;
    if ((getGetProductDetailsMethod = ProductServiceGrpc.getGetProductDetailsMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductDetailsMethod = ProductServiceGrpc.getGetProductDetailsMethod) == null) {
          ProductServiceGrpc.getGetProductDetailsMethod = getGetProductDetailsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.product.v1.GetProductDetailsRequest, com.ecmsp.product.v1.GetProductDetailsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProductDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductDetailsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.product.v1.GetProductDetailsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("GetProductDetails"))
              .build();
        }
      }
    }
    return getGetProductDetailsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ProductServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingV2Stub>() {
        @java.lang.Override
        public ProductServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ProductServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Searches for products based on category and returns only one variant per product, as a representative
     * </pre>
     */
    default void getProducts(com.ecmsp.product.v1.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Searches for products based on provided query (and category) and returns only one variant per product, as a representative
     * </pre>
     */
    default void getProductsByQuery(com.ecmsp.product.v1.GetProductsByQueryRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsByQueryResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductsByQueryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Searches for product details (including all variants). Returns images, prices, descriptions etc. 
     * </pre>
     */
    default void getProductDetails(com.ecmsp.product.v1.GetProductDetailsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductDetailsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductDetailsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductService.
   */
  public static abstract class ProductServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for products based on category and returns only one variant per product, as a representative
     * </pre>
     */
    public void getProducts(com.ecmsp.product.v1.GetProductsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for products based on provided query (and category) and returns only one variant per product, as a representative
     * </pre>
     */
    public void getProductsByQuery(com.ecmsp.product.v1.GetProductsByQueryRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsByQueryResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductsByQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Searches for product details (including all variants). Returns images, prices, descriptions etc. 
     * </pre>
     */
    public void getProductDetails(com.ecmsp.product.v1.GetProductDetailsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductDetailsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductDetailsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingV2Stub> {
    private ProductServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for products based on category and returns only one variant per product, as a representative
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductsResponse getProducts(com.ecmsp.product.v1.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for products based on provided query (and category) and returns only one variant per product, as a representative
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductsByQueryResponse getProductsByQuery(com.ecmsp.product.v1.GetProductsByQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for product details (including all variants). Returns images, prices, descriptions etc. 
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductDetailsResponse getProductDetails(com.ecmsp.product.v1.GetProductDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ProductService.
   */
  public static final class ProductServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for products based on category and returns only one variant per product, as a representative
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductsResponse getProducts(com.ecmsp.product.v1.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for products based on provided query (and category) and returns only one variant per product, as a representative
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductsByQueryResponse getProductsByQuery(com.ecmsp.product.v1.GetProductsByQueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductsByQueryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Searches for product details (including all variants). Returns images, prices, descriptions etc. 
     * </pre>
     */
    public com.ecmsp.product.v1.GetProductDetailsResponse getProductDetails(com.ecmsp.product.v1.GetProductDetailsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductDetailsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductService.
   */
  public static final class ProductServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Searches for products based on category and returns only one variant per product, as a representative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.GetProductsResponse> getProducts(
        com.ecmsp.product.v1.GetProductsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for products based on provided query (and category) and returns only one variant per product, as a representative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.GetProductsByQueryResponse> getProductsByQuery(
        com.ecmsp.product.v1.GetProductsByQueryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductsByQueryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Searches for product details (including all variants). Returns images, prices, descriptions etc. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.product.v1.GetProductDetailsResponse> getProductDetails(
        com.ecmsp.product.v1.GetProductDetailsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductDetailsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;
  private static final int METHODID_GET_PRODUCTS_BY_QUERY = 1;
  private static final int METHODID_GET_PRODUCT_DETAILS = 2;

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
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((com.ecmsp.product.v1.GetProductsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCTS_BY_QUERY:
          serviceImpl.getProductsByQuery((com.ecmsp.product.v1.GetProductsByQueryRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductsByQueryResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_DETAILS:
          serviceImpl.getProductDetails((com.ecmsp.product.v1.GetProductDetailsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.product.v1.GetProductDetailsResponse>) responseObserver);
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
          getGetProductsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.GetProductsRequest,
              com.ecmsp.product.v1.GetProductsResponse>(
                service, METHODID_GET_PRODUCTS)))
        .addMethod(
          getGetProductsByQueryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.GetProductsByQueryRequest,
              com.ecmsp.product.v1.GetProductsByQueryResponse>(
                service, METHODID_GET_PRODUCTS_BY_QUERY)))
        .addMethod(
          getGetProductDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.product.v1.GetProductDetailsRequest,
              com.ecmsp.product.v1.GetProductDetailsResponse>(
                service, METHODID_GET_PRODUCT_DETAILS)))
        .build();
  }

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.product.v1.ProductServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ProductServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getGetProductsMethod())
              .addMethod(getGetProductsByQueryMethod())
              .addMethod(getGetProductDetailsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
