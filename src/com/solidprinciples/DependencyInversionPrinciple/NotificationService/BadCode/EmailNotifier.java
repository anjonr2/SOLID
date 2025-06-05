package com.solidprinciples.DependencyInversionPrinciple.NotificationService.BadCode;

public class EmailNotifier {
    public void sendEmail(String recipient, String message){
        System.out.println("Sending "+message+" to "+recipient);
    }
}
