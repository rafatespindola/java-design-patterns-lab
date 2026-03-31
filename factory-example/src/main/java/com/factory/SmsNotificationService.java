package com.factory;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}