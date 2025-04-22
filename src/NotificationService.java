public interface NotificationService {
    void sendNotification(String message);
}

class EmailNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }
}

class SMSNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }
}
