
//Classe Adapter che adatta ThirdpartPayment a PaymentProcess

public class PaymentAdapter implements PaymentProcessor {
    private ThirdpartyPayment thirdPartyPayment;

    public PaymentAdapter (ThirdpartyPayment thirdpartyPayment){
        this.thirdPartyPayment=thirdpartyPayment;
    }

    @Override
    public void processPayment(double amount){
        thirdPartyPayment.makePayment(amount);
    }
    


}
