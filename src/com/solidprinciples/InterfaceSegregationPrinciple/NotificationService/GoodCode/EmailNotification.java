package com.solidprinciples.InterfaceSegregationPrinciple.NotificationService.GoodCode;

public interface EmailNotification {
    void sendEmail(String email, String subject, String body);
}
