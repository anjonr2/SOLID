package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

// A service that supports only sending SMS notifications
public class SMSNotificationService implements SMSNotification{
    @Override
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Sending "+message+" to "+phoneNumber);
    }
}
