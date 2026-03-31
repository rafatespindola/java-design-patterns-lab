package com.factory;

public class EmailNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Enviando EMAIL: " + message);
    }
}