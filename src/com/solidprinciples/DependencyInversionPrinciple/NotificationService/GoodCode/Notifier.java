package com.solidprinciples.DependencyInversionPrinciple.NotificationService.GoodCode;

public interface Notifier {
    void send(String recipient, String message);
}
