public class Client {


    public static void main(String[] args) {
        
        Pizzeria pizzeria = new Pizzeria();

        //pizzeria.setStrategy(new BikeDelivery());
        pizzeria.deliverPizza("Viale Vincenzo Giuffrida");


      
         pizzeria.setStrategy(new ScooterDelivery());
         pizzeria.deliverPizza("Viale XX Settembre");
         
        
         pizzeria.setStrategy(new CarDelivery());
         pizzeria.deliverPizza("Via Etnea");

    }
    
}
