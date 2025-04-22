 enum NotificationPriority {
    HIGH, MEDIUM, LOW;
}

public interface NotificationService {
    void sendNotification(String message, NotificationPriority priority);
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message ,NotificationPriority priority) {
        System.out.println("Sending Email Notification(Priority: "+priority + "):" + message);
    }
}

class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message,NotificationPriority priority) {
        System.out.println("Sending SMS Notification(Priority: "+priority + "):" + message);
    }
}
