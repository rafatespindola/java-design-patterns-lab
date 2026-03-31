package com.factory;

public class PushNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Enviando PUSH: " + message);
    }
}