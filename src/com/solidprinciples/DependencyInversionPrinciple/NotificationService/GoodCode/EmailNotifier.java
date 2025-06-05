package com.solidprinciples.DependencyInversionPrinciple.NotificationService.GoodCode;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to: "+ recipient+" message: "+message);
    }
}
