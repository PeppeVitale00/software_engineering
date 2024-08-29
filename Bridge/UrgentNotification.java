// Refined Abstraction 
public class UrgentNotification extends Notification {
    public UrgentNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Urgent Notification:");
        messageSender.sendMessage(message);
    }
}