package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.BadCode;

public class EmailNotificationService implements NotificationService{
    @Override
    public void sendMail(String email, String subject, String body) {
        System.out.println("Sending mail to "+email+"With subject: "+subject+" and body: "+body);
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        //Not applicable for EmailNotificationService
        throw new UnsupportedOperationException("SMS sending not supported in EmailNotoificationService")
    }

    @Override
    public void sendPushNotification(String message) {
        //Not implemented for EmailNotificationService as it is not applicable
    }
}
