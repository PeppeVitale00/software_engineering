public class PaymentAdapter extends ThirdPartyPayment implements PaymentProcessor{

    
    @Override
    public void processPayment(double amount){
        makePayment(amount);
    }
    
}
