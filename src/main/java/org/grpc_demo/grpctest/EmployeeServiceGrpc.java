package org.grpc_demo.grpctest;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: employee.proto")
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "grpctest.EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> getEmpAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empAdd",
      requestType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest.class,
      responseType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> getEmpAddMethod() {
    io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> getEmpAddMethod;
    if ((getEmpAddMethod = EmployeeServiceGrpc.getEmpAddMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getEmpAddMethod = EmployeeServiceGrpc.getEmpAddMethod) == null) {
          EmployeeServiceGrpc.getEmpAddMethod = getEmpAddMethod = 
              io.grpc.MethodDescriptor.<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpctest.EmployeeService", "empAdd"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("empAdd"))
                  .build();
          }
        }
     }
     return getEmpAddMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> getEmpFindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empFind",
      requestType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest.class,
      responseType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> getEmpFindMethod() {
    io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> getEmpFindMethod;
    if ((getEmpFindMethod = EmployeeServiceGrpc.getEmpFindMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getEmpFindMethod = EmployeeServiceGrpc.getEmpFindMethod) == null) {
          EmployeeServiceGrpc.getEmpFindMethod = getEmpFindMethod = 
              io.grpc.MethodDescriptor.<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpctest.EmployeeService", "empFind"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("empFind"))
                  .build();
          }
        }
     }
     return getEmpFindMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> getEmpListAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "empListAll",
      requestType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq.class,
      responseType = org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq,
      org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> getEmpListAllMethod() {
    io.grpc.MethodDescriptor<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> getEmpListAllMethod;
    if ((getEmpListAllMethod = EmployeeServiceGrpc.getEmpListAllMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getEmpListAllMethod = EmployeeServiceGrpc.getEmpListAllMethod) == null) {
          EmployeeServiceGrpc.getEmpListAllMethod = getEmpListAllMethod = 
              io.grpc.MethodDescriptor.<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq, org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "grpctest.EmployeeService", "empListAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp.getDefaultInstance()))
                  .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("empListAll"))
                  .build();
          }
        }
     }
     return getEmpListAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    return new EmployeeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EmployeeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class EmployeeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void empAdd(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmpAddMethod(), responseObserver);
    }

    /**
     */
    public void empFind(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmpFindMethod(), responseObserver);
    }

    /**
     */
    public void empListAll(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> responseObserver) {
      asyncUnimplementedUnaryCall(getEmpListAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmpAddMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest,
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse>(
                  this, METHODID_EMP_ADD)))
          .addMethod(
            getEmpFindMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest,
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse>(
                  this, METHODID_EMP_FIND)))
          .addMethod(
            getEmpListAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq,
                org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp>(
                  this, METHODID_EMP_LIST_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class EmployeeServiceStub extends io.grpc.stub.AbstractStub<EmployeeServiceStub> {
    private EmployeeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void empAdd(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmpAddMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empFind(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmpFindMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void empListAll(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq request,
        io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmpListAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EmployeeServiceBlockingStub extends io.grpc.stub.AbstractStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse empAdd(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmpAddMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse empFind(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmpFindMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp empListAll(org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq request) {
      return blockingUnaryCall(
          getChannel(), getEmpListAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EmployeeServiceFutureStub extends io.grpc.stub.AbstractStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EmployeeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse> empAdd(
        org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmpAddMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse> empFind(
        org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmpFindMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp> empListAll(
        org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq request) {
      return futureUnaryCall(
          getChannel().newCall(getEmpListAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMP_ADD = 0;
  private static final int METHODID_EMP_FIND = 1;
  private static final int METHODID_EMP_LIST_ALL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EmployeeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EmployeeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMP_ADD:
          serviceImpl.empAdd((org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeAddResponse>) responseObserver);
          break;
        case METHODID_EMP_FIND:
          serviceImpl.empFind((org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindRequest) request,
              (io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeFindResponse>) responseObserver);
          break;
        case METHODID_EMP_LIST_ALL:
          serviceImpl.empListAll((org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllReq) request,
              (io.grpc.stub.StreamObserver<org.grpc_demo.grpctest.EmployeeOuterClass.EmployeeListAllResp>) responseObserver);
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

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.grpc_demo.grpctest.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getEmpAddMethod())
              .addMethod(getEmpFindMethod())
              .addMethod(getEmpListAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
