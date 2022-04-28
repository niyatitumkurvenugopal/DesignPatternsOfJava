package com.niyati.designpattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryDesignPatternTest {
    @Test
    void testFactoryPattern() {
        Notification smsNotification = NotificationFactory.createNotification("sms");
        assertEquals("Sending SMS Notification",smsNotification.notifyUser());

        Notification emailNotification = NotificationFactory.createNotification("email");
        assertEquals("Sending email Notification",emailNotification.notifyUser());
    }
}