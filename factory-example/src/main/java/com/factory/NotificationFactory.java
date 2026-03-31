package com.factory;

public class NotificationFactory {

    public static NotificationService create(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotificationService();
            case SMS -> new SmsNotificationService();
            case PUSH -> new PushNotificationService();
        };
    }
}
