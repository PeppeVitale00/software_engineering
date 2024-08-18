public class Main {

    public static void main(String[] args) {
        ThirdpartyPayment thirdPartyPayment = new ThirdpartyPayment();

        PaymentProcessor paymentProcessor = new PaymentAdapter(thirdPartyPayment);            
        
        paymentProcessor.processPayment(100);

    }
    
}
