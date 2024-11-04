public class Pizzeria {

    private DeliveryStrategy deliveryStrategy;

    public void setStrategy(DeliveryStrategy deliveryStrategy){
        this.deliveryStrategy=deliveryStrategy;
    }

    public void deliverPizza(String address){
        if(deliveryStrategy==null){
            System.out.println("Impossibile consegnare all'indirizzo "+address+". Seleziona strategia di consegna");
        } else{
            deliveryStrategy.deliver(address);
        }
    }
    
}
