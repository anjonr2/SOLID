package com.solidprinciples.DependencyInversionPrinciple.NotificationService.GoodCode;

public class SMSNotifier implements Notifier{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending SMS to: "+recipient+" message: "+message);
    }
}
