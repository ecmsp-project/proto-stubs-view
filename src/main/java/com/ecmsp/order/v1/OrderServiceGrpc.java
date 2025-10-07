package com.ecmsp.order.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: order/v1/order_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OrderServiceGrpc {

  private OrderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "order.v1.OrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderRequest,
      com.ecmsp.order.v1.GetOrderResponse> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = com.ecmsp.order.v1.GetOrderRequest.class,
      responseType = com.ecmsp.order.v1.GetOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderRequest,
      com.ecmsp.order.v1.GetOrderResponse> getGetOrderMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderRequest, com.ecmsp.order.v1.GetOrderResponse> getGetOrderMethod;
    if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderMethod = OrderServiceGrpc.getGetOrderMethod) == null) {
          OrderServiceGrpc.getGetOrderMethod = getGetOrderMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.GetOrderRequest, com.ecmsp.order.v1.GetOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrder"))
              .build();
        }
      }
    }
    return getGetOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderStatusRequest,
      com.ecmsp.order.v1.GetOrderStatusResponse> getGetOrderStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderStatus",
      requestType = com.ecmsp.order.v1.GetOrderStatusRequest.class,
      responseType = com.ecmsp.order.v1.GetOrderStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderStatusRequest,
      com.ecmsp.order.v1.GetOrderStatusResponse> getGetOrderStatusMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderStatusRequest, com.ecmsp.order.v1.GetOrderStatusResponse> getGetOrderStatusMethod;
    if ((getGetOrderStatusMethod = OrderServiceGrpc.getGetOrderStatusMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderStatusMethod = OrderServiceGrpc.getGetOrderStatusMethod) == null) {
          OrderServiceGrpc.getGetOrderStatusMethod = getGetOrderStatusMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.GetOrderStatusRequest, com.ecmsp.order.v1.GetOrderStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrderStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrderStatus"))
              .build();
        }
      }
    }
    return getGetOrderStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderItemsRequest,
      com.ecmsp.order.v1.GetOrderItemsResponse> getGetOrderItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrderItems",
      requestType = com.ecmsp.order.v1.GetOrderItemsRequest.class,
      responseType = com.ecmsp.order.v1.GetOrderItemsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderItemsRequest,
      com.ecmsp.order.v1.GetOrderItemsResponse> getGetOrderItemsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.GetOrderItemsRequest, com.ecmsp.order.v1.GetOrderItemsResponse> getGetOrderItemsMethod;
    if ((getGetOrderItemsMethod = OrderServiceGrpc.getGetOrderItemsMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getGetOrderItemsMethod = OrderServiceGrpc.getGetOrderItemsMethod) == null) {
          OrderServiceGrpc.getGetOrderItemsMethod = getGetOrderItemsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.GetOrderItemsRequest, com.ecmsp.order.v1.GetOrderItemsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOrderItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderItemsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.GetOrderItemsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("GetOrderItems"))
              .build();
        }
      }
    }
    return getGetOrderItemsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersRequest,
      com.ecmsp.order.v1.ListOrdersResponse> getListOrdersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrders",
      requestType = com.ecmsp.order.v1.ListOrdersRequest.class,
      responseType = com.ecmsp.order.v1.ListOrdersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersRequest,
      com.ecmsp.order.v1.ListOrdersResponse> getListOrdersMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersRequest, com.ecmsp.order.v1.ListOrdersResponse> getListOrdersMethod;
    if ((getListOrdersMethod = OrderServiceGrpc.getListOrdersMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getListOrdersMethod = OrderServiceGrpc.getListOrdersMethod) == null) {
          OrderServiceGrpc.getListOrdersMethod = getListOrdersMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.ListOrdersRequest, com.ecmsp.order.v1.ListOrdersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrders"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.ListOrdersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.ListOrdersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("ListOrders"))
              .build();
        }
      }
    }
    return getListOrdersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersByUserIdRequest,
      com.ecmsp.order.v1.ListOrdersByUserIdResponse> getListOrdersByUserIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOrdersByUserId",
      requestType = com.ecmsp.order.v1.ListOrdersByUserIdRequest.class,
      responseType = com.ecmsp.order.v1.ListOrdersByUserIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersByUserIdRequest,
      com.ecmsp.order.v1.ListOrdersByUserIdResponse> getListOrdersByUserIdMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.order.v1.ListOrdersByUserIdRequest, com.ecmsp.order.v1.ListOrdersByUserIdResponse> getListOrdersByUserIdMethod;
    if ((getListOrdersByUserIdMethod = OrderServiceGrpc.getListOrdersByUserIdMethod) == null) {
      synchronized (OrderServiceGrpc.class) {
        if ((getListOrdersByUserIdMethod = OrderServiceGrpc.getListOrdersByUserIdMethod) == null) {
          OrderServiceGrpc.getListOrdersByUserIdMethod = getListOrdersByUserIdMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.order.v1.ListOrdersByUserIdRequest, com.ecmsp.order.v1.ListOrdersByUserIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOrdersByUserId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.ListOrdersByUserIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.order.v1.ListOrdersByUserIdResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderServiceMethodDescriptorSupplier("ListOrdersByUserId"))
              .build();
        }
      }
    }
    return getListOrdersByUserIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceStub>() {
        @java.lang.Override
        public OrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceStub(channel, callOptions);
        }
      };
    return OrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static OrderServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingV2Stub>() {
        @java.lang.Override
        public OrderServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return OrderServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceBlockingStub>() {
        @java.lang.Override
        public OrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceBlockingStub(channel, callOptions);
        }
      };
    return OrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderServiceFutureStub>() {
        @java.lang.Override
        public OrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderServiceFutureStub(channel, callOptions);
        }
      };
    return OrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getOrder(com.ecmsp.order.v1.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    /**
     */
    default void getOrderStatus(com.ecmsp.order.v1.GetOrderStatusRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderStatusMethod(), responseObserver);
    }

    /**
     */
    default void getOrderItems(com.ecmsp.order.v1.GetOrderItemsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderItemsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetOrderItemsMethod(), responseObserver);
    }

    /**
     */
    default void listOrders(com.ecmsp.order.v1.ListOrdersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrdersMethod(), responseObserver);
    }

    /**
     */
    default void listOrdersByUserId(com.ecmsp.order.v1.ListOrdersByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersByUserIdResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOrdersByUserIdMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service OrderService.
   */
  public static abstract class OrderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return OrderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<OrderServiceStub> {
    private OrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOrder(com.ecmsp.order.v1.GetOrderRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderStatus(com.ecmsp.order.v1.GetOrderStatusRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderItems(com.ecmsp.order.v1.GetOrderItemsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderItemsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetOrderItemsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrders(com.ecmsp.order.v1.ListOrdersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrdersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listOrdersByUserId(com.ecmsp.order.v1.ListOrdersByUserIdRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersByUserIdResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOrdersByUserIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingV2Stub> {
    private OrderServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderResponse getOrder(com.ecmsp.order.v1.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderStatusResponse getOrderStatus(com.ecmsp.order.v1.GetOrderStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderItemsResponse getOrderItems(com.ecmsp.order.v1.GetOrderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.ListOrdersResponse listOrders(com.ecmsp.order.v1.ListOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.ListOrdersByUserIdResponse listOrdersByUserId(com.ecmsp.order.v1.ListOrdersByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrdersByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service OrderService.
   */
  public static final class OrderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<OrderServiceBlockingStub> {
    private OrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderResponse getOrder(com.ecmsp.order.v1.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderStatusResponse getOrderStatus(com.ecmsp.order.v1.GetOrderStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.GetOrderItemsResponse getOrderItems(com.ecmsp.order.v1.GetOrderItemsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetOrderItemsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.ListOrdersResponse listOrders(com.ecmsp.order.v1.ListOrdersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrdersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.order.v1.ListOrdersByUserIdResponse listOrdersByUserId(com.ecmsp.order.v1.ListOrdersByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOrdersByUserIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service OrderService.
   */
  public static final class OrderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<OrderServiceFutureStub> {
    private OrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.GetOrderResponse> getOrder(
        com.ecmsp.order.v1.GetOrderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.GetOrderStatusResponse> getOrderStatus(
        com.ecmsp.order.v1.GetOrderStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.GetOrderItemsResponse> getOrderItems(
        com.ecmsp.order.v1.GetOrderItemsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetOrderItemsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.ListOrdersResponse> listOrders(
        com.ecmsp.order.v1.ListOrdersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrdersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.order.v1.ListOrdersByUserIdResponse> listOrdersByUserId(
        com.ecmsp.order.v1.ListOrdersByUserIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOrdersByUserIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDER = 0;
  private static final int METHODID_GET_ORDER_STATUS = 1;
  private static final int METHODID_GET_ORDER_ITEMS = 2;
  private static final int METHODID_LIST_ORDERS = 3;
  private static final int METHODID_LIST_ORDERS_BY_USER_ID = 4;

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
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((com.ecmsp.order.v1.GetOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_STATUS:
          serviceImpl.getOrderStatus((com.ecmsp.order.v1.GetOrderStatusRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderStatusResponse>) responseObserver);
          break;
        case METHODID_GET_ORDER_ITEMS:
          serviceImpl.getOrderItems((com.ecmsp.order.v1.GetOrderItemsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.GetOrderItemsResponse>) responseObserver);
          break;
        case METHODID_LIST_ORDERS:
          serviceImpl.listOrders((com.ecmsp.order.v1.ListOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersResponse>) responseObserver);
          break;
        case METHODID_LIST_ORDERS_BY_USER_ID:
          serviceImpl.listOrdersByUserId((com.ecmsp.order.v1.ListOrdersByUserIdRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.order.v1.ListOrdersByUserIdResponse>) responseObserver);
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
          getGetOrderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.GetOrderRequest,
              com.ecmsp.order.v1.GetOrderResponse>(
                service, METHODID_GET_ORDER)))
        .addMethod(
          getGetOrderStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.GetOrderStatusRequest,
              com.ecmsp.order.v1.GetOrderStatusResponse>(
                service, METHODID_GET_ORDER_STATUS)))
        .addMethod(
          getGetOrderItemsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.GetOrderItemsRequest,
              com.ecmsp.order.v1.GetOrderItemsResponse>(
                service, METHODID_GET_ORDER_ITEMS)))
        .addMethod(
          getListOrdersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.ListOrdersRequest,
              com.ecmsp.order.v1.ListOrdersResponse>(
                service, METHODID_LIST_ORDERS)))
        .addMethod(
          getListOrdersByUserIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.order.v1.ListOrdersByUserIdRequest,
              com.ecmsp.order.v1.ListOrdersByUserIdResponse>(
                service, METHODID_LIST_ORDERS_BY_USER_ID)))
        .build();
  }

  private static abstract class OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.order.v1.OrderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OrderService");
    }
  }

  private static final class OrderServiceFileDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier {
    OrderServiceFileDescriptorSupplier() {}
  }

  private static final class OrderServiceMethodDescriptorSupplier
      extends OrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    OrderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (OrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderServiceFileDescriptorSupplier())
              .addMethod(getGetOrderMethod())
              .addMethod(getGetOrderStatusMethod())
              .addMethod(getGetOrderItemsMethod())
              .addMethod(getListOrdersMethod())
              .addMethod(getListOrdersByUserIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
