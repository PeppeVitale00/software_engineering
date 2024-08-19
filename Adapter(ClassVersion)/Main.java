public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentAdapter();

        paymentProcessor.processPayment(100);
    }
}
