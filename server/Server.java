import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.ServerBuilder;
import pet.v1.PetOuterClass;

import java.io.IOException;


// TODO may delete the copyright
/**
 * @ author 吉天相
 * @ version 1.0
 */
public class Server{
    private static final int port = 9999;
    public static void main(String[] args) throws InterruptedException, IOException {
        io.grpc.Server server = ServerBuilder.forPort(port).addService(new PetStoreService()).build().start();
        System.out.println("GRPC_SERVER BEGIN");
        server.awaitTermination();
    }
}
