package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

//A service that only supports sending emails
public class EmailNotificationService implements EmailNotification{
    @Override
    public void sendEmail(String email, String subject, String body) {
        System.out.println("Sending email to"+email+"with subject:"+subject+"and body:"+body);
    }
}
