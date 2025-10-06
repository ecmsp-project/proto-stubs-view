package com.ecmsp.cart.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * CartService provides operations for managing shopping carts
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: cart/v1/cart_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CartServiceGrpc {

  private CartServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "cart.v1.CartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.GetCartRequest,
      com.ecmsp.cart.v1.GetCartResponse> getGetCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCart",
      requestType = com.ecmsp.cart.v1.GetCartRequest.class,
      responseType = com.ecmsp.cart.v1.GetCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.GetCartRequest,
      com.ecmsp.cart.v1.GetCartResponse> getGetCartMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.GetCartRequest, com.ecmsp.cart.v1.GetCartResponse> getGetCartMethod;
    if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getGetCartMethod = CartServiceGrpc.getGetCartMethod) == null) {
          CartServiceGrpc.getGetCartMethod = getGetCartMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.GetCartRequest, com.ecmsp.cart.v1.GetCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.GetCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.GetCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("GetCart"))
              .build();
        }
      }
    }
    return getGetCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.AddProductRequest,
      com.ecmsp.cart.v1.AddProductResponse> getAddProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddProduct",
      requestType = com.ecmsp.cart.v1.AddProductRequest.class,
      responseType = com.ecmsp.cart.v1.AddProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.AddProductRequest,
      com.ecmsp.cart.v1.AddProductResponse> getAddProductMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.AddProductRequest, com.ecmsp.cart.v1.AddProductResponse> getAddProductMethod;
    if ((getAddProductMethod = CartServiceGrpc.getAddProductMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getAddProductMethod = CartServiceGrpc.getAddProductMethod) == null) {
          CartServiceGrpc.getAddProductMethod = getAddProductMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.AddProductRequest, com.ecmsp.cart.v1.AddProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.AddProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.AddProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("AddProduct"))
              .build();
        }
      }
    }
    return getAddProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteProductRequest,
      com.ecmsp.cart.v1.DeleteProductResponse> getDeleteProductMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteProduct",
      requestType = com.ecmsp.cart.v1.DeleteProductRequest.class,
      responseType = com.ecmsp.cart.v1.DeleteProductResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteProductRequest,
      com.ecmsp.cart.v1.DeleteProductResponse> getDeleteProductMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteProductRequest, com.ecmsp.cart.v1.DeleteProductResponse> getDeleteProductMethod;
    if ((getDeleteProductMethod = CartServiceGrpc.getDeleteProductMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteProductMethod = CartServiceGrpc.getDeleteProductMethod) == null) {
          CartServiceGrpc.getDeleteProductMethod = getDeleteProductMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.DeleteProductRequest, com.ecmsp.cart.v1.DeleteProductResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteProduct"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.DeleteProductRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.DeleteProductResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteProduct"))
              .build();
        }
      }
    }
    return getDeleteProductMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteCartRequest,
      com.ecmsp.cart.v1.DeleteCartResponse> getDeleteCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCart",
      requestType = com.ecmsp.cart.v1.DeleteCartRequest.class,
      responseType = com.ecmsp.cart.v1.DeleteCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteCartRequest,
      com.ecmsp.cart.v1.DeleteCartResponse> getDeleteCartMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.DeleteCartRequest, com.ecmsp.cart.v1.DeleteCartResponse> getDeleteCartMethod;
    if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getDeleteCartMethod = CartServiceGrpc.getDeleteCartMethod) == null) {
          CartServiceGrpc.getDeleteCartMethod = getDeleteCartMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.DeleteCartRequest, com.ecmsp.cart.v1.DeleteCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.DeleteCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.DeleteCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("DeleteCart"))
              .build();
        }
      }
    }
    return getDeleteCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.UpdateQuantitiesRequest,
      com.ecmsp.cart.v1.UpdateQuantitiesResponse> getUpdateQuantitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateQuantities",
      requestType = com.ecmsp.cart.v1.UpdateQuantitiesRequest.class,
      responseType = com.ecmsp.cart.v1.UpdateQuantitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.UpdateQuantitiesRequest,
      com.ecmsp.cart.v1.UpdateQuantitiesResponse> getUpdateQuantitiesMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.UpdateQuantitiesRequest, com.ecmsp.cart.v1.UpdateQuantitiesResponse> getUpdateQuantitiesMethod;
    if ((getUpdateQuantitiesMethod = CartServiceGrpc.getUpdateQuantitiesMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getUpdateQuantitiesMethod = CartServiceGrpc.getUpdateQuantitiesMethod) == null) {
          CartServiceGrpc.getUpdateQuantitiesMethod = getUpdateQuantitiesMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.UpdateQuantitiesRequest, com.ecmsp.cart.v1.UpdateQuantitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateQuantities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.UpdateQuantitiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.UpdateQuantitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("UpdateQuantities"))
              .build();
        }
      }
    }
    return getUpdateQuantitiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.cart.v1.CreateOrderRequest,
      com.ecmsp.cart.v1.CreateOrderResponse> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateOrder",
      requestType = com.ecmsp.cart.v1.CreateOrderRequest.class,
      responseType = com.ecmsp.cart.v1.CreateOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.cart.v1.CreateOrderRequest,
      com.ecmsp.cart.v1.CreateOrderResponse> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.cart.v1.CreateOrderRequest, com.ecmsp.cart.v1.CreateOrderResponse> getCreateOrderMethod;
    if ((getCreateOrderMethod = CartServiceGrpc.getCreateOrderMethod) == null) {
      synchronized (CartServiceGrpc.class) {
        if ((getCreateOrderMethod = CartServiceGrpc.getCreateOrderMethod) == null) {
          CartServiceGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.cart.v1.CreateOrderRequest, com.ecmsp.cart.v1.CreateOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.cart.v1.CreateOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CartServiceMethodDescriptorSupplier("CreateOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceStub>() {
        @java.lang.Override
        public CartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceStub(channel, callOptions);
        }
      };
    return CartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CartServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingV2Stub>() {
        @java.lang.Override
        public CartServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CartServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceBlockingStub>() {
        @java.lang.Override
        public CartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceBlockingStub(channel, callOptions);
        }
      };
    return CartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CartServiceFutureStub>() {
        @java.lang.Override
        public CartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CartServiceFutureStub(channel, callOptions);
        }
      };
    return CartServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get cart by user (creates new if doesn't exist)
     * </pre>
     */
    default void getCart(com.ecmsp.cart.v1.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.GetCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Add product to cart
     * </pre>
     */
    default void addProduct(com.ecmsp.cart.v1.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.AddProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete product from cart
     * </pre>
     */
    default void deleteProduct(com.ecmsp.cart.v1.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteProductResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProductMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete entire cart
     * </pre>
     */
    default void deleteCart(com.ecmsp.cart.v1.DeleteCartRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteCartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCartMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update quantities of existing products
     * </pre>
     */
    default void updateQuantities(com.ecmsp.cart.v1.UpdateQuantitiesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.UpdateQuantitiesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateQuantitiesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create order/reservation from cart
     * </pre>
     */
    default void createOrder(com.ecmsp.cart.v1.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.CreateOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CartService.
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public static abstract class CartServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CartServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CartService.
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public static final class CartServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CartServiceStub> {
    private CartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get cart by user (creates new if doesn't exist)
     * </pre>
     */
    public void getCart(com.ecmsp.cart.v1.GetCartRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.GetCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Add product to cart
     * </pre>
     */
    public void addProduct(com.ecmsp.cart.v1.AddProductRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.AddProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete product from cart
     * </pre>
     */
    public void deleteProduct(com.ecmsp.cart.v1.DeleteProductRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteProductResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete entire cart
     * </pre>
     */
    public void deleteCart(com.ecmsp.cart.v1.DeleteCartRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteCartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update quantities of existing products
     * </pre>
     */
    public void updateQuantities(com.ecmsp.cart.v1.UpdateQuantitiesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.UpdateQuantitiesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateQuantitiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create order/reservation from cart
     * </pre>
     */
    public void createOrder(com.ecmsp.cart.v1.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.CreateOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CartService.
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public static final class CartServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingV2Stub> {
    private CartServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     * <pre>
     * Get cart by user (creates new if doesn't exist)
     * </pre>
     */
    public com.ecmsp.cart.v1.GetCartResponse getCart(com.ecmsp.cart.v1.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add product to cart
     * </pre>
     */
    public com.ecmsp.cart.v1.AddProductResponse addProduct(com.ecmsp.cart.v1.AddProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete product from cart
     * </pre>
     */
    public com.ecmsp.cart.v1.DeleteProductResponse deleteProduct(com.ecmsp.cart.v1.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete entire cart
     * </pre>
     */
    public com.ecmsp.cart.v1.DeleteCartResponse deleteCart(com.ecmsp.cart.v1.DeleteCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update quantities of existing products
     * </pre>
     */
    public com.ecmsp.cart.v1.UpdateQuantitiesResponse updateQuantities(com.ecmsp.cart.v1.UpdateQuantitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQuantitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create order/reservation from cart
     * </pre>
     */
    public com.ecmsp.cart.v1.CreateOrderResponse createOrder(com.ecmsp.cart.v1.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CartService.
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public static final class CartServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CartServiceBlockingStub> {
    private CartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get cart by user (creates new if doesn't exist)
     * </pre>
     */
    public com.ecmsp.cart.v1.GetCartResponse getCart(com.ecmsp.cart.v1.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Add product to cart
     * </pre>
     */
    public com.ecmsp.cart.v1.AddProductResponse addProduct(com.ecmsp.cart.v1.AddProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete product from cart
     * </pre>
     */
    public com.ecmsp.cart.v1.DeleteProductResponse deleteProduct(com.ecmsp.cart.v1.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProductMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete entire cart
     * </pre>
     */
    public com.ecmsp.cart.v1.DeleteCartResponse deleteCart(com.ecmsp.cart.v1.DeleteCartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update quantities of existing products
     * </pre>
     */
    public com.ecmsp.cart.v1.UpdateQuantitiesResponse updateQuantities(com.ecmsp.cart.v1.UpdateQuantitiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateQuantitiesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create order/reservation from cart
     * </pre>
     */
    public com.ecmsp.cart.v1.CreateOrderResponse createOrder(com.ecmsp.cart.v1.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CartService.
   * <pre>
   * CartService provides operations for managing shopping carts
   * </pre>
   */
  public static final class CartServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CartServiceFutureStub> {
    private CartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CartServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get cart by user (creates new if doesn't exist)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.GetCartResponse> getCart(
        com.ecmsp.cart.v1.GetCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Add product to cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.AddProductResponse> addProduct(
        com.ecmsp.cart.v1.AddProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete product from cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.DeleteProductResponse> deleteProduct(
        com.ecmsp.cart.v1.DeleteProductRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProductMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete entire cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.DeleteCartResponse> deleteCart(
        com.ecmsp.cart.v1.DeleteCartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update quantities of existing products
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.UpdateQuantitiesResponse> updateQuantities(
        com.ecmsp.cart.v1.UpdateQuantitiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateQuantitiesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create order/reservation from cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.cart.v1.CreateOrderResponse> createOrder(
        com.ecmsp.cart.v1.CreateOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CART = 0;
  private static final int METHODID_ADD_PRODUCT = 1;
  private static final int METHODID_DELETE_PRODUCT = 2;
  private static final int METHODID_DELETE_CART = 3;
  private static final int METHODID_UPDATE_QUANTITIES = 4;
  private static final int METHODID_CREATE_ORDER = 5;

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
        case METHODID_GET_CART:
          serviceImpl.getCart((com.ecmsp.cart.v1.GetCartRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.GetCartResponse>) responseObserver);
          break;
        case METHODID_ADD_PRODUCT:
          serviceImpl.addProduct((com.ecmsp.cart.v1.AddProductRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.AddProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCT:
          serviceImpl.deleteProduct((com.ecmsp.cart.v1.DeleteProductRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteProductResponse>) responseObserver);
          break;
        case METHODID_DELETE_CART:
          serviceImpl.deleteCart((com.ecmsp.cart.v1.DeleteCartRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.DeleteCartResponse>) responseObserver);
          break;
        case METHODID_UPDATE_QUANTITIES:
          serviceImpl.updateQuantities((com.ecmsp.cart.v1.UpdateQuantitiesRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.UpdateQuantitiesResponse>) responseObserver);
          break;
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.ecmsp.cart.v1.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.cart.v1.CreateOrderResponse>) responseObserver);
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
          getGetCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.GetCartRequest,
              com.ecmsp.cart.v1.GetCartResponse>(
                service, METHODID_GET_CART)))
        .addMethod(
          getAddProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.AddProductRequest,
              com.ecmsp.cart.v1.AddProductResponse>(
                service, METHODID_ADD_PRODUCT)))
        .addMethod(
          getDeleteProductMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.DeleteProductRequest,
              com.ecmsp.cart.v1.DeleteProductResponse>(
                service, METHODID_DELETE_PRODUCT)))
        .addMethod(
          getDeleteCartMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.DeleteCartRequest,
              com.ecmsp.cart.v1.DeleteCartResponse>(
                service, METHODID_DELETE_CART)))
        .addMethod(
          getUpdateQuantitiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.UpdateQuantitiesRequest,
              com.ecmsp.cart.v1.UpdateQuantitiesResponse>(
                service, METHODID_UPDATE_QUANTITIES)))
        .addMethod(
          getCreateOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.cart.v1.CreateOrderRequest,
              com.ecmsp.cart.v1.CreateOrderResponse>(
                service, METHODID_CREATE_ORDER)))
        .build();
  }

  private static abstract class CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.cart.v1.CartServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CartService");
    }
  }

  private static final class CartServiceFileDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier {
    CartServiceFileDescriptorSupplier() {}
  }

  private static final class CartServiceMethodDescriptorSupplier
      extends CartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CartServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CartServiceFileDescriptorSupplier())
              .addMethod(getGetCartMethod())
              .addMethod(getAddProductMethod())
              .addMethod(getDeleteProductMethod())
              .addMethod(getDeleteCartMethod())
              .addMethod(getUpdateQuantitiesMethod())
              .addMethod(getCreateOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
