package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

public class PushNotificationService implements PushNotification{
    @Override
    public void sendPushNotification(String message) {
        System.out.println("Sending push notification: "+message);
    }
}
