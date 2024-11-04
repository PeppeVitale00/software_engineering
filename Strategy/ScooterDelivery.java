//Concrete Strategy

public class ScooterDelivery implements DeliveryStrategy{

    @Override
    public void deliver(String address){
        System.out.println("Consegno la pizza all'indirizzo "+address+" in scooter");
    }


}