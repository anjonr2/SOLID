package com.solidprinciples.DependencyInversionPrinciple.NotificationService.GoodCode;

public class DIPExample {
    public static void main(String []args){
        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        NotificationService emailService = new NotificationService(emailNotifier);
        emailNotifier.send("test@gmail.com", "Notify via Email");
    }
}
