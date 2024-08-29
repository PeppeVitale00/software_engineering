// Refined Abstraction 2
public class NormalNotification extends Notification {
    public NormalNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Normal Notification:");
        messageSender.sendMessage(message);
    }
}