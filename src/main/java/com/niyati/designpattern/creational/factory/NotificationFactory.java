package com.niyati.designpattern.creational.factory;

public class NotificationFactory {
    private NotificationFactory() {
    }

    public static Notification createNotification(String str) {
        if (str.equals("sms")) {
            return new SMSNotification();
        } else if (str.equals("email")) {
            return new EmailNotification();
        }
        return null;
    }
}


