package com.niyati.designpattern.creational.factory;

public class SMSNotification implements Notification {

    @Override
    public String notifyUser() {
        return "Sending SMS Notification";
    }
}

