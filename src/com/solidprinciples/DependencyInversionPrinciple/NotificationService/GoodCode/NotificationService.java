package com.solidprinciples.DependencyInversionPrinciple.NotificationService.GoodCode;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier){
        this.notifier = notifier;
    }

    public void notifyUser(String recipient, String message){
        notifier.send(recipient,message);
    }
}
