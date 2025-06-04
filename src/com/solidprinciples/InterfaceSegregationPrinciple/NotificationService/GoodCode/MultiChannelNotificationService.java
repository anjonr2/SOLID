package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

public class MultiChannelNotificationService implements EmailNotification, SMSNotification,PushNotification{
    private EmailNotificationService emailService;
    private SMSNotificationService smsService;
    private PushNotificationService pushService;

    public MultiChannelNotificationService(EmailNotificationService emailService, SMSNotificationService smsService, PushNotificationService pushService){
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;

    }
    @Override
    public void sendEmail(String email, String subject, String body) {
        emailService.sendEmail(email, subject, body);
    }

    @Override
    public void sendPushNotification(String message) {
        pushService.sendPushNotification(message);
    }

    @Override
    public void sendSMS(String phoneNumber, String message) {
        smsService.sendSMS(phoneNumber, message);
    }
}
