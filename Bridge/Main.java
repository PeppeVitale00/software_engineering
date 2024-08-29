public class Main {
    
    public static void main(String[] args) {
        Notification urgentEmail = new UrgentNotification(new EmailSender());
        Notification urgentSMS = new UrgentNotification(new SMSSender());
        Notification normalSMS = new NormalNotification(new SMSSender());
        Notification normalEmail = new NormalNotification(new EmailSender());

        urgentEmail.notifyUser("Server is down!");
        normalSMS.notifyUser("Your package has been shipped.");
        urgentSMS.notifyUser("Your OTP code is 12345");
        normalEmail.notifyUser("Nike: 10% discount for your birthday");
    }
}
