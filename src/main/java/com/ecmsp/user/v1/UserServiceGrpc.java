package com.ecmsp.user.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.71.0)",
    comments = "Source: user/v1/user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "user.v1.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.GetUserRequest,
      com.ecmsp.user.v1.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = com.ecmsp.user.v1.GetUserRequest.class,
      responseType = com.ecmsp.user.v1.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.GetUserRequest,
      com.ecmsp.user.v1.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.GetUserRequest, com.ecmsp.user.v1.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.GetUserRequest, com.ecmsp.user.v1.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateUserRequest,
      com.ecmsp.user.v1.CreateUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.ecmsp.user.v1.CreateUserRequest.class,
      responseType = com.ecmsp.user.v1.CreateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateUserRequest,
      com.ecmsp.user.v1.CreateUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateUserRequest, com.ecmsp.user.v1.CreateUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.CreateUserRequest, com.ecmsp.user.v1.CreateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.CreateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.CreateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateUserRequest,
      com.ecmsp.user.v1.UpdateUserResponse> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.ecmsp.user.v1.UpdateUserRequest.class,
      responseType = com.ecmsp.user.v1.UpdateUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateUserRequest,
      com.ecmsp.user.v1.UpdateUserResponse> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateUserRequest, com.ecmsp.user.v1.UpdateUserResponse> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateUserMethod = UserServiceGrpc.getUpdateUserMethod) == null) {
          UserServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.UpdateUserRequest, com.ecmsp.user.v1.UpdateUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.UpdateUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.UpdateUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteUserRequest,
      com.ecmsp.user.v1.DeleteUserResponse> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.ecmsp.user.v1.DeleteUserRequest.class,
      responseType = com.ecmsp.user.v1.DeleteUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteUserRequest,
      com.ecmsp.user.v1.DeleteUserResponse> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteUserRequest, com.ecmsp.user.v1.DeleteUserResponse> getDeleteUserMethod;
    if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteUserMethod = UserServiceGrpc.getDeleteUserMethod) == null) {
          UserServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.DeleteUserRequest, com.ecmsp.user.v1.DeleteUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.DeleteUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.DeleteUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListUsersRequest,
      com.ecmsp.user.v1.ListUsersResponse> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.ecmsp.user.v1.ListUsersRequest.class,
      responseType = com.ecmsp.user.v1.ListUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListUsersRequest,
      com.ecmsp.user.v1.ListUsersResponse> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListUsersRequest, com.ecmsp.user.v1.ListUsersResponse> getListUsersMethod;
    if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListUsersMethod = UserServiceGrpc.getListUsersMethod) == null) {
          UserServiceGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.ListUsersRequest, com.ecmsp.user.v1.ListUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateRoleRequest,
      com.ecmsp.user.v1.CreateRoleResponse> getCreateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRole",
      requestType = com.ecmsp.user.v1.CreateRoleRequest.class,
      responseType = com.ecmsp.user.v1.CreateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateRoleRequest,
      com.ecmsp.user.v1.CreateRoleResponse> getCreateRoleMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.CreateRoleRequest, com.ecmsp.user.v1.CreateRoleResponse> getCreateRoleMethod;
    if ((getCreateRoleMethod = UserServiceGrpc.getCreateRoleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateRoleMethod = UserServiceGrpc.getCreateRoleMethod) == null) {
          UserServiceGrpc.getCreateRoleMethod = getCreateRoleMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.CreateRoleRequest, com.ecmsp.user.v1.CreateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.CreateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.CreateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateRole"))
              .build();
        }
      }
    }
    return getCreateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateRoleRequest,
      com.ecmsp.user.v1.UpdateRoleResponse> getUpdateRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRole",
      requestType = com.ecmsp.user.v1.UpdateRoleRequest.class,
      responseType = com.ecmsp.user.v1.UpdateRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateRoleRequest,
      com.ecmsp.user.v1.UpdateRoleResponse> getUpdateRoleMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.UpdateRoleRequest, com.ecmsp.user.v1.UpdateRoleResponse> getUpdateRoleMethod;
    if ((getUpdateRoleMethod = UserServiceGrpc.getUpdateRoleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUpdateRoleMethod = UserServiceGrpc.getUpdateRoleMethod) == null) {
          UserServiceGrpc.getUpdateRoleMethod = getUpdateRoleMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.UpdateRoleRequest, com.ecmsp.user.v1.UpdateRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.UpdateRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.UpdateRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("UpdateRole"))
              .build();
        }
      }
    }
    return getUpdateRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteRoleRequest,
      com.ecmsp.user.v1.DeleteRoleResponse> getDeleteRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRole",
      requestType = com.ecmsp.user.v1.DeleteRoleRequest.class,
      responseType = com.ecmsp.user.v1.DeleteRoleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteRoleRequest,
      com.ecmsp.user.v1.DeleteRoleResponse> getDeleteRoleMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.DeleteRoleRequest, com.ecmsp.user.v1.DeleteRoleResponse> getDeleteRoleMethod;
    if ((getDeleteRoleMethod = UserServiceGrpc.getDeleteRoleMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getDeleteRoleMethod = UserServiceGrpc.getDeleteRoleMethod) == null) {
          UserServiceGrpc.getDeleteRoleMethod = getDeleteRoleMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.DeleteRoleRequest, com.ecmsp.user.v1.DeleteRoleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.DeleteRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.DeleteRoleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("DeleteRole"))
              .build();
        }
      }
    }
    return getDeleteRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListRolesRequest,
      com.ecmsp.user.v1.ListRolesResponse> getListRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoles",
      requestType = com.ecmsp.user.v1.ListRolesRequest.class,
      responseType = com.ecmsp.user.v1.ListRolesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListRolesRequest,
      com.ecmsp.user.v1.ListRolesResponse> getListRolesMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListRolesRequest, com.ecmsp.user.v1.ListRolesResponse> getListRolesMethod;
    if ((getListRolesMethod = UserServiceGrpc.getListRolesMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListRolesMethod = UserServiceGrpc.getListRolesMethod) == null) {
          UserServiceGrpc.getListRolesMethod = getListRolesMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.ListRolesRequest, com.ecmsp.user.v1.ListRolesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListRolesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListRolesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListRoles"))
              .build();
        }
      }
    }
    return getListRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.AssignRoleToUsersRequest,
      com.ecmsp.user.v1.AssignRoleToUsersResponse> getAssignRoleToUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignRoleToUsers",
      requestType = com.ecmsp.user.v1.AssignRoleToUsersRequest.class,
      responseType = com.ecmsp.user.v1.AssignRoleToUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.AssignRoleToUsersRequest,
      com.ecmsp.user.v1.AssignRoleToUsersResponse> getAssignRoleToUsersMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.AssignRoleToUsersRequest, com.ecmsp.user.v1.AssignRoleToUsersResponse> getAssignRoleToUsersMethod;
    if ((getAssignRoleToUsersMethod = UserServiceGrpc.getAssignRoleToUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAssignRoleToUsersMethod = UserServiceGrpc.getAssignRoleToUsersMethod) == null) {
          UserServiceGrpc.getAssignRoleToUsersMethod = getAssignRoleToUsersMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.AssignRoleToUsersRequest, com.ecmsp.user.v1.AssignRoleToUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignRoleToUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.AssignRoleToUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.AssignRoleToUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("AssignRoleToUsers"))
              .build();
        }
      }
    }
    return getAssignRoleToUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.RemoveRoleFromUsersRequest,
      com.ecmsp.user.v1.RemoveRoleFromUsersResponse> getRemoveRoleFromUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveRoleFromUsers",
      requestType = com.ecmsp.user.v1.RemoveRoleFromUsersRequest.class,
      responseType = com.ecmsp.user.v1.RemoveRoleFromUsersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.RemoveRoleFromUsersRequest,
      com.ecmsp.user.v1.RemoveRoleFromUsersResponse> getRemoveRoleFromUsersMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.RemoveRoleFromUsersRequest, com.ecmsp.user.v1.RemoveRoleFromUsersResponse> getRemoveRoleFromUsersMethod;
    if ((getRemoveRoleFromUsersMethod = UserServiceGrpc.getRemoveRoleFromUsersMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRemoveRoleFromUsersMethod = UserServiceGrpc.getRemoveRoleFromUsersMethod) == null) {
          UserServiceGrpc.getRemoveRoleFromUsersMethod = getRemoveRoleFromUsersMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.RemoveRoleFromUsersRequest, com.ecmsp.user.v1.RemoveRoleFromUsersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveRoleFromUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.RemoveRoleFromUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.RemoveRoleFromUsersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RemoveRoleFromUsers"))
              .build();
        }
      }
    }
    return getRemoveRoleFromUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListAllPermissionsRequest,
      com.ecmsp.user.v1.ListAllPermissionsResponse> getListAllPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAllPermissions",
      requestType = com.ecmsp.user.v1.ListAllPermissionsRequest.class,
      responseType = com.ecmsp.user.v1.ListAllPermissionsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListAllPermissionsRequest,
      com.ecmsp.user.v1.ListAllPermissionsResponse> getListAllPermissionsMethod() {
    io.grpc.MethodDescriptor<com.ecmsp.user.v1.ListAllPermissionsRequest, com.ecmsp.user.v1.ListAllPermissionsResponse> getListAllPermissionsMethod;
    if ((getListAllPermissionsMethod = UserServiceGrpc.getListAllPermissionsMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getListAllPermissionsMethod = UserServiceGrpc.getListAllPermissionsMethod) == null) {
          UserServiceGrpc.getListAllPermissionsMethod = getListAllPermissionsMethod =
              io.grpc.MethodDescriptor.<com.ecmsp.user.v1.ListAllPermissionsRequest, com.ecmsp.user.v1.ListAllPermissionsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAllPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListAllPermissionsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.ecmsp.user.v1.ListAllPermissionsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ListAllPermissions"))
              .build();
        }
      }
    }
    return getListAllPermissionsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static UserServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingV2Stub>() {
        @java.lang.Override
        public UserServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return UserServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getUser(com.ecmsp.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void createUser(com.ecmsp.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUser(com.ecmsp.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.ecmsp.user.v1.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    default void listUsers(com.ecmsp.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    default void createRole(com.ecmsp.user.v1.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRoleMethod(), responseObserver);
    }

    /**
     */
    default void updateRole(com.ecmsp.user.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRoleMethod(), responseObserver);
    }

    /**
     */
    default void deleteRole(com.ecmsp.user.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRoleMethod(), responseObserver);
    }

    /**
     */
    default void listRoles(com.ecmsp.user.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListRolesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRolesMethod(), responseObserver);
    }

    /**
     */
    default void assignRoleToUsers(com.ecmsp.user.v1.AssignRoleToUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.AssignRoleToUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignRoleToUsersMethod(), responseObserver);
    }

    /**
     */
    default void removeRoleFromUsers(com.ecmsp.user.v1.RemoveRoleFromUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.RemoveRoleFromUsersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveRoleFromUsersMethod(), responseObserver);
    }

    /**
     */
    default void listAllPermissions(com.ecmsp.user.v1.ListAllPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListAllPermissionsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllPermissionsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(com.ecmsp.user.v1.GetUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.ecmsp.user.v1.CreateUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.ecmsp.user.v1.UpdateUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.ecmsp.user.v1.DeleteUserRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUsers(com.ecmsp.user.v1.ListUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRole(com.ecmsp.user.v1.CreateRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRole(com.ecmsp.user.v1.UpdateRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRole(com.ecmsp.user.v1.DeleteRoleRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteRoleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoles(com.ecmsp.user.v1.ListRolesRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListRolesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void assignRoleToUsers(com.ecmsp.user.v1.AssignRoleToUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.AssignRoleToUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignRoleToUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeRoleFromUsers(com.ecmsp.user.v1.RemoveRoleFromUsersRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.RemoveRoleFromUsersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveRoleFromUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAllPermissions(com.ecmsp.user.v1.ListAllPermissionsRequest request,
        io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListAllPermissionsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllPermissionsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingV2Stub> {
    private UserServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.user.v1.GetUserResponse getUser(com.ecmsp.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.CreateUserResponse createUser(com.ecmsp.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.UpdateUserResponse updateUser(com.ecmsp.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.DeleteUserResponse deleteUser(com.ecmsp.user.v1.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListUsersResponse listUsers(com.ecmsp.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.CreateRoleResponse createRole(com.ecmsp.user.v1.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.UpdateRoleResponse updateRole(com.ecmsp.user.v1.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.DeleteRoleResponse deleteRole(com.ecmsp.user.v1.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListRolesResponse listRoles(com.ecmsp.user.v1.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.AssignRoleToUsersResponse assignRoleToUsers(com.ecmsp.user.v1.AssignRoleToUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleToUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.RemoveRoleFromUsersResponse removeRoleFromUsers(com.ecmsp.user.v1.RemoveRoleFromUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleFromUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListAllPermissionsResponse listAllPermissions(com.ecmsp.user.v1.ListAllPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.ecmsp.user.v1.GetUserResponse getUser(com.ecmsp.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.CreateUserResponse createUser(com.ecmsp.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.UpdateUserResponse updateUser(com.ecmsp.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.DeleteUserResponse deleteUser(com.ecmsp.user.v1.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListUsersResponse listUsers(com.ecmsp.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.CreateRoleResponse createRole(com.ecmsp.user.v1.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.UpdateRoleResponse updateRole(com.ecmsp.user.v1.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.DeleteRoleResponse deleteRole(com.ecmsp.user.v1.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListRolesResponse listRoles(com.ecmsp.user.v1.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRolesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.AssignRoleToUsersResponse assignRoleToUsers(com.ecmsp.user.v1.AssignRoleToUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignRoleToUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.RemoveRoleFromUsersResponse removeRoleFromUsers(com.ecmsp.user.v1.RemoveRoleFromUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveRoleFromUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.ecmsp.user.v1.ListAllPermissionsResponse listAllPermissions(com.ecmsp.user.v1.ListAllPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllPermissionsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.GetUserResponse> getUser(
        com.ecmsp.user.v1.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.CreateUserResponse> createUser(
        com.ecmsp.user.v1.CreateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.UpdateUserResponse> updateUser(
        com.ecmsp.user.v1.UpdateUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.DeleteUserResponse> deleteUser(
        com.ecmsp.user.v1.DeleteUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.ListUsersResponse> listUsers(
        com.ecmsp.user.v1.ListUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.CreateRoleResponse> createRole(
        com.ecmsp.user.v1.CreateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.UpdateRoleResponse> updateRole(
        com.ecmsp.user.v1.UpdateRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.DeleteRoleResponse> deleteRole(
        com.ecmsp.user.v1.DeleteRoleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.ListRolesResponse> listRoles(
        com.ecmsp.user.v1.ListRolesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRolesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.AssignRoleToUsersResponse> assignRoleToUsers(
        com.ecmsp.user.v1.AssignRoleToUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignRoleToUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.RemoveRoleFromUsersResponse> removeRoleFromUsers(
        com.ecmsp.user.v1.RemoveRoleFromUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveRoleFromUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.ecmsp.user.v1.ListAllPermissionsResponse> listAllPermissions(
        com.ecmsp.user.v1.ListAllPermissionsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllPermissionsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;
  private static final int METHODID_CREATE_USER = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER = 3;
  private static final int METHODID_LIST_USERS = 4;
  private static final int METHODID_CREATE_ROLE = 5;
  private static final int METHODID_UPDATE_ROLE = 6;
  private static final int METHODID_DELETE_ROLE = 7;
  private static final int METHODID_LIST_ROLES = 8;
  private static final int METHODID_ASSIGN_ROLE_TO_USERS = 9;
  private static final int METHODID_REMOVE_ROLE_FROM_USERS = 10;
  private static final int METHODID_LIST_ALL_PERMISSIONS = 11;

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
        case METHODID_GET_USER:
          serviceImpl.getUser((com.ecmsp.user.v1.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.GetUserResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.ecmsp.user.v1.CreateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateUserResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.ecmsp.user.v1.UpdateUserRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateUserResponse>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.ecmsp.user.v1.DeleteUserRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteUserResponse>) responseObserver);
          break;
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.ecmsp.user.v1.ListUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListUsersResponse>) responseObserver);
          break;
        case METHODID_CREATE_ROLE:
          serviceImpl.createRole((com.ecmsp.user.v1.CreateRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.CreateRoleResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ROLE:
          serviceImpl.updateRole((com.ecmsp.user.v1.UpdateRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.UpdateRoleResponse>) responseObserver);
          break;
        case METHODID_DELETE_ROLE:
          serviceImpl.deleteRole((com.ecmsp.user.v1.DeleteRoleRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.DeleteRoleResponse>) responseObserver);
          break;
        case METHODID_LIST_ROLES:
          serviceImpl.listRoles((com.ecmsp.user.v1.ListRolesRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListRolesResponse>) responseObserver);
          break;
        case METHODID_ASSIGN_ROLE_TO_USERS:
          serviceImpl.assignRoleToUsers((com.ecmsp.user.v1.AssignRoleToUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.AssignRoleToUsersResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ROLE_FROM_USERS:
          serviceImpl.removeRoleFromUsers((com.ecmsp.user.v1.RemoveRoleFromUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.RemoveRoleFromUsersResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_PERMISSIONS:
          serviceImpl.listAllPermissions((com.ecmsp.user.v1.ListAllPermissionsRequest) request,
              (io.grpc.stub.StreamObserver<com.ecmsp.user.v1.ListAllPermissionsResponse>) responseObserver);
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
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.GetUserRequest,
              com.ecmsp.user.v1.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.CreateUserRequest,
              com.ecmsp.user.v1.CreateUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getUpdateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.UpdateUserRequest,
              com.ecmsp.user.v1.UpdateUserResponse>(
                service, METHODID_UPDATE_USER)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.DeleteUserRequest,
              com.ecmsp.user.v1.DeleteUserResponse>(
                service, METHODID_DELETE_USER)))
        .addMethod(
          getListUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.ListUsersRequest,
              com.ecmsp.user.v1.ListUsersResponse>(
                service, METHODID_LIST_USERS)))
        .addMethod(
          getCreateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.CreateRoleRequest,
              com.ecmsp.user.v1.CreateRoleResponse>(
                service, METHODID_CREATE_ROLE)))
        .addMethod(
          getUpdateRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.UpdateRoleRequest,
              com.ecmsp.user.v1.UpdateRoleResponse>(
                service, METHODID_UPDATE_ROLE)))
        .addMethod(
          getDeleteRoleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.DeleteRoleRequest,
              com.ecmsp.user.v1.DeleteRoleResponse>(
                service, METHODID_DELETE_ROLE)))
        .addMethod(
          getListRolesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.ListRolesRequest,
              com.ecmsp.user.v1.ListRolesResponse>(
                service, METHODID_LIST_ROLES)))
        .addMethod(
          getAssignRoleToUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.AssignRoleToUsersRequest,
              com.ecmsp.user.v1.AssignRoleToUsersResponse>(
                service, METHODID_ASSIGN_ROLE_TO_USERS)))
        .addMethod(
          getRemoveRoleFromUsersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.RemoveRoleFromUsersRequest,
              com.ecmsp.user.v1.RemoveRoleFromUsersResponse>(
                service, METHODID_REMOVE_ROLE_FROM_USERS)))
        .addMethod(
          getListAllPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.ecmsp.user.v1.ListAllPermissionsRequest,
              com.ecmsp.user.v1.ListAllPermissionsResponse>(
                service, METHODID_LIST_ALL_PERMISSIONS)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.ecmsp.user.v1.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getListUsersMethod())
              .addMethod(getCreateRoleMethod())
              .addMethod(getUpdateRoleMethod())
              .addMethod(getDeleteRoleMethod())
              .addMethod(getListRolesMethod())
              .addMethod(getAssignRoleToUsersMethod())
              .addMethod(getRemoveRoleFromUsersMethod())
              .addMethod(getListAllPermissionsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
