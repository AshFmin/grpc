import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: pet/v1/pet.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PetStoreServiceGrpc {

  private PetStoreServiceGrpc() {}

  public static final String SERVICE_NAME = "pet.v1.PetStoreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pet.v1.PetOuterClass.GetPetRequest,
      pet.v1.PetOuterClass.GetPetResponse> getGetPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPet",
      requestType = pet.v1.PetOuterClass.GetPetRequest.class,
      responseType = pet.v1.PetOuterClass.GetPetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pet.v1.PetOuterClass.GetPetRequest,
      pet.v1.PetOuterClass.GetPetResponse> getGetPetMethod() {
    io.grpc.MethodDescriptor<pet.v1.PetOuterClass.GetPetRequest, pet.v1.PetOuterClass.GetPetResponse> getGetPetMethod;
    if ((getGetPetMethod = PetStoreServiceGrpc.getGetPetMethod) == null) {
      synchronized (PetStoreServiceGrpc.class) {
        if ((getGetPetMethod = PetStoreServiceGrpc.getGetPetMethod) == null) {
          PetStoreServiceGrpc.getGetPetMethod = getGetPetMethod =
              io.grpc.MethodDescriptor.<pet.v1.PetOuterClass.GetPetRequest, pet.v1.PetOuterClass.GetPetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.GetPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.GetPetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetStoreServiceMethodDescriptorSupplier("GetPet"))
              .build();
        }
      }
    }
    return getGetPetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pet.v1.PetOuterClass.PutPetRequest,
      pet.v1.PetOuterClass.PutPetResponse> getPutPetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PutPet",
      requestType = pet.v1.PetOuterClass.PutPetRequest.class,
      responseType = pet.v1.PetOuterClass.PutPetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pet.v1.PetOuterClass.PutPetRequest,
      pet.v1.PetOuterClass.PutPetResponse> getPutPetMethod() {
    io.grpc.MethodDescriptor<pet.v1.PetOuterClass.PutPetRequest, pet.v1.PetOuterClass.PutPetResponse> getPutPetMethod;
    if ((getPutPetMethod = PetStoreServiceGrpc.getPutPetMethod) == null) {
      synchronized (PetStoreServiceGrpc.class) {
        if ((getPutPetMethod = PetStoreServiceGrpc.getPutPetMethod) == null) {
          PetStoreServiceGrpc.getPutPetMethod = getPutPetMethod =
              io.grpc.MethodDescriptor.<pet.v1.PetOuterClass.PutPetRequest, pet.v1.PetOuterClass.PutPetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PutPet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.PutPetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.PutPetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetStoreServiceMethodDescriptorSupplier("PutPet"))
              .build();
        }
      }
    }
    return getPutPetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pet.v1.PetOuterClass.DeletePetRequest,
      pet.v1.PetOuterClass.DeletePetResponse> getDeletePetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePet",
      requestType = pet.v1.PetOuterClass.DeletePetRequest.class,
      responseType = pet.v1.PetOuterClass.DeletePetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pet.v1.PetOuterClass.DeletePetRequest,
      pet.v1.PetOuterClass.DeletePetResponse> getDeletePetMethod() {
    io.grpc.MethodDescriptor<pet.v1.PetOuterClass.DeletePetRequest, pet.v1.PetOuterClass.DeletePetResponse> getDeletePetMethod;
    if ((getDeletePetMethod = PetStoreServiceGrpc.getDeletePetMethod) == null) {
      synchronized (PetStoreServiceGrpc.class) {
        if ((getDeletePetMethod = PetStoreServiceGrpc.getDeletePetMethod) == null) {
          PetStoreServiceGrpc.getDeletePetMethod = getDeletePetMethod =
              io.grpc.MethodDescriptor.<pet.v1.PetOuterClass.DeletePetRequest, pet.v1.PetOuterClass.DeletePetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.DeletePetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pet.v1.PetOuterClass.DeletePetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PetStoreServiceMethodDescriptorSupplier("DeletePet"))
              .build();
        }
      }
    }
    return getDeletePetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PetStoreServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceStub>() {
        @java.lang.Override
        public PetStoreServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetStoreServiceStub(channel, callOptions);
        }
      };
    return PetStoreServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PetStoreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceBlockingStub>() {
        @java.lang.Override
        public PetStoreServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetStoreServiceBlockingStub(channel, callOptions);
        }
      };
    return PetStoreServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PetStoreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PetStoreServiceFutureStub>() {
        @java.lang.Override
        public PetStoreServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PetStoreServiceFutureStub(channel, callOptions);
        }
      };
    return PetStoreServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PetStoreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPet(pet.v1.PetOuterClass.GetPetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.GetPetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPetMethod(), responseObserver);
    }

    /**
     */
    public void putPet(pet.v1.PetOuterClass.PutPetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.PutPetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPutPetMethod(), responseObserver);
    }

    /**
     */
    public void deletePet(pet.v1.PetOuterClass.DeletePetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.DeletePetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pet.v1.PetOuterClass.GetPetRequest,
                pet.v1.PetOuterClass.GetPetResponse>(
                  this, METHODID_GET_PET)))
          .addMethod(
            getPutPetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pet.v1.PetOuterClass.PutPetRequest,
                pet.v1.PetOuterClass.PutPetResponse>(
                  this, METHODID_PUT_PET)))
          .addMethod(
            getDeletePetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pet.v1.PetOuterClass.DeletePetRequest,
                pet.v1.PetOuterClass.DeletePetResponse>(
                  this, METHODID_DELETE_PET)))
          .build();
    }
  }

  /**
   */
  public static final class PetStoreServiceStub extends io.grpc.stub.AbstractAsyncStub<PetStoreServiceStub> {
    private PetStoreServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetStoreServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetStoreServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPet(pet.v1.PetOuterClass.GetPetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.GetPetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void putPet(pet.v1.PetOuterClass.PutPetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.PutPetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPutPetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePet(pet.v1.PetOuterClass.DeletePetRequest request,
        io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.DeletePetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PetStoreServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PetStoreServiceBlockingStub> {
    private PetStoreServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetStoreServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetStoreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pet.v1.PetOuterClass.GetPetResponse getPet(pet.v1.PetOuterClass.GetPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPetMethod(), getCallOptions(), request);
    }

    /**
     */
    public pet.v1.PetOuterClass.PutPetResponse putPet(pet.v1.PetOuterClass.PutPetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPutPetMethod(), getCallOptions(), request);
    }

    /**
     */
    public pet.v1.PetOuterClass.DeletePetResponse deletePet(pet.v1.PetOuterClass.DeletePetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PetStoreServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PetStoreServiceFutureStub> {
    private PetStoreServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PetStoreServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PetStoreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pet.v1.PetOuterClass.GetPetResponse> getPet(
        pet.v1.PetOuterClass.GetPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pet.v1.PetOuterClass.PutPetResponse> putPet(
        pet.v1.PetOuterClass.PutPetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPutPetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pet.v1.PetOuterClass.DeletePetResponse> deletePet(
        pet.v1.PetOuterClass.DeletePetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PET = 0;
  private static final int METHODID_PUT_PET = 1;
  private static final int METHODID_DELETE_PET = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PetStoreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PetStoreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PET:
          serviceImpl.getPet((pet.v1.PetOuterClass.GetPetRequest) request,
              (io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.GetPetResponse>) responseObserver);
          break;
        case METHODID_PUT_PET:
          serviceImpl.putPet((pet.v1.PetOuterClass.PutPetRequest) request,
              (io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.PutPetResponse>) responseObserver);
          break;
        case METHODID_DELETE_PET:
          serviceImpl.deletePet((pet.v1.PetOuterClass.DeletePetRequest) request,
              (io.grpc.stub.StreamObserver<pet.v1.PetOuterClass.DeletePetResponse>) responseObserver);
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

  private static abstract class PetStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PetStoreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pet.v1.PetOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PetStoreService");
    }
  }

  private static final class PetStoreServiceFileDescriptorSupplier
      extends PetStoreServiceBaseDescriptorSupplier {
    PetStoreServiceFileDescriptorSupplier() {}
  }

  private static final class PetStoreServiceMethodDescriptorSupplier
      extends PetStoreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PetStoreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PetStoreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PetStoreServiceFileDescriptorSupplier())
              .addMethod(getGetPetMethod())
              .addMethod(getPutPetMethod())
              .addMethod(getDeletePetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
