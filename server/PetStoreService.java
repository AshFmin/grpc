import com.google.protobuf.DescriptorProtos;
import com.google.type.DateTime;
import io.grpc.stub.StreamObserver;
import pet.v1.PetOuterClass;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @ author 吉天相
 * @ version 1.0
 */
public class PetStoreService extends PetStoreServiceGrpc.PetStoreServiceImplBase{
    private Map<String, PetOuterClass.Pet> petMap = new HashMap<>();
    private int idNum = 0;

    @Override
    public void getPet(PetOuterClass.GetPetRequest request, StreamObserver<PetOuterClass.GetPetResponse> responseObserver) {
        String petId = request.getPetId();
        PetOuterClass.Pet pet = petMap.get(petId);
        PetOuterClass.GetPetResponse response = PetOuterClass.GetPetResponse.newBuilder().setPet(pet).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void putPet(PetOuterClass.PutPetRequest request, StreamObserver<PetOuterClass.PutPetResponse> responseObserver) {
        String name = request.getName();
        PetOuterClass.PetType petType = request.getPetType();
        int petId = idNum++;
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTime createAt = DateTime.newBuilder()
                .setYear(localDateTime.getYear())
                .setMonth(localDateTime.getMonthValue())
                .setDay(localDateTime.getDayOfMonth())
                .setHours(localDateTime.getHour())
                .setMinutes(localDateTime.getMinute())
                .setSeconds(localDateTime.getSecond())
                .setNanos(localDateTime.getNano())
                .build();
        PetOuterClass.Pet pet = PetOuterClass.Pet.newBuilder()
                .setPetType(petType)
                .setPetId(String.valueOf(petId))
                .setName(name)
                .setCreatedAt(createAt)
                .build();
        petMap.put(String.valueOf(petId),pet);
        PetOuterClass.PutPetResponse response = PetOuterClass.PutPetResponse.newBuilder().setPet(pet).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deletePet(PetOuterClass.DeletePetRequest request, StreamObserver<PetOuterClass.DeletePetResponse> responseObserver) {
        String petId = request.getPetId();
        if(petMap.containsKey(petId)){
           petMap.remove(petId);
        }
        PetOuterClass.DeletePetResponse response = PetOuterClass.DeletePetResponse.newBuilder().build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}



