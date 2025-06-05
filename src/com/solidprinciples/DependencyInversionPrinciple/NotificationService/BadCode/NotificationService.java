package com.solidprinciples.DependencyInversionPrinciple.NotificationService.BadCode;

// This class violates the Dependency Inversion Principle as
// it directly depends on a concrete implementation (EmailNotifier)
public class NotificationService {
    private EmailNotifier emailNotifier;

    public NotificationService(EmailNotifier emailNotifier){
        this.emailNotifier=emailNotifier;
    }

    public void notifyUser(String recipient, String message){
        // This method is tightly coupled to EmailNotifier
        // It cannot be easily changed to use other notification methods
        emailNotifier.sendEmail(recipient, message);
    }
}
