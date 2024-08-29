public abstract class Notification {
    protected MessageSender messageSender;

    protected Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void notifyUser(String message);
}