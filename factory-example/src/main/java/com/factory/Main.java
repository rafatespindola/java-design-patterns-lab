package com.factory;

public class Main {
    static void main(String[] args) {
        NotificationService email = NotificationFactory.create(NotificationType.EMAIL);
        NotificationService sms = NotificationFactory.create(NotificationType.SMS);
        NotificationService push = NotificationFactory.create(NotificationType.PUSH);

        email.send("Olá bom dia por email");
        sms.send("Olá bom dia por sms");
        push.send("Olá bom dia por push");
    }
}
