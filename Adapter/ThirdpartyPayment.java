//Classe Adaptee con una interfaccia diversa che il Client ignaramente utilizzerà
public class ThirdpartyPayment {
    
    public void makePayment(double amount){
        System.out.println("€"+amount+ " payed using the new payment method");
    }
}
