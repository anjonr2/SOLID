package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

public interface SMSNotification {
    void sendSMS(String phoneNumber, String message);
}
