package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.BadCode;

//a large generalised interface
public interface NotificationService {
    void sendMail(String email, String subject, String body);
    void sendSMS(String phoneNumber, String message);
    void sendPushNotification(String message);
}
