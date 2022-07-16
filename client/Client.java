import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pet.v1.PetOuterClass;

import java.util.Scanner;

/**
 * @ author 吉天相
 * @ version 1.0
 */
public class Client {
    private static final String host = "localhost";
    private static final int serverPort = 9999;


    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host,serverPort).usePlaintext().build();
        PetStoreServiceGrpc.PetStoreServiceBlockingStub stub = PetStoreServiceGrpc.newBlockingStub(channel);
        Scanner scanner = new Scanner(System.in);
        while(true){
            menu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    petName();
                    String petName = scanner.next();
                    petType();
                    String petType = scanner.next();
                    putPet(petName,petType,stub);
                    break;
                case 2:
                    petId();
                    String petId = scanner.next();
                    getPet(petId,stub);
                    break;
                case 3:
                    petId();
                    String PetId = scanner.next();
                    deletePet(PetId,stub);
                    break;
                case 0:
                default:
                    scanner.close();
                    System.out.println("exit");
                    return;
            }
        }
    }


    public static void menu(){
        System.out.println("---------------");
        System.out.println("1.putPet       ");
        System.out.println("2.getPet       ");
        System.out.println("3.deletePet    ");
        System.out.println("0.exit         ");
        System.out.println("---------------");
    }

    public static void petName(){
        System.out.println("PetName:");
    }
    public static void petType(){
        System.out.println("---------------");
        System.out.println("0.UNSPECIFIED  ");
        System.out.println("1.CAT          ");
        System.out.println("2.DOG          ");
        System.out.println("3.SNAKE        ");
        System.out.println("4.HAMSTER      ");
        System.out.println("---------------");
        System.out.println("PetType:");
    }
    public static void petId(){
        System.out.println("PetId:");
    }

    public static void putPet(String petName,String petType,PetStoreServiceGrpc.PetStoreServiceBlockingStub stub){
        PetOuterClass.PutPetRequest request = PetOuterClass.PutPetRequest.newBuilder()
                .setPetType(PetOuterClass.PetType.forNumber(Integer.parseInt(petType)))
                .setName(petName)
                .build();
        PetOuterClass.PutPetResponse putPetResponse = stub.putPet(request);
        System.out.println(putPetResponse.getPet());
    }

    public static void getPet(String petId,PetStoreServiceGrpc.PetStoreServiceBlockingStub stub){
        PetOuterClass.GetPetRequest request = PetOuterClass.GetPetRequest.newBuilder().setPetId(petId).build();
        PetOuterClass.GetPetResponse getPetResponse = stub.getPet(request);
        System.out.println(getPetResponse);
    }

    public static void deletePet(String petId,PetStoreServiceGrpc.PetStoreServiceBlockingStub stub){
        PetOuterClass.DeletePetRequest request = PetOuterClass.DeletePetRequest.newBuilder().setPetId(petId).build();
        PetOuterClass.DeletePetResponse deletePetResponse = stub.deletePet(request);
        System.out.println(deletePetResponse);
    }



}
