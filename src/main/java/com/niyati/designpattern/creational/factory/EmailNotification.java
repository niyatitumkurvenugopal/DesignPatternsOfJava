package com.niyati.designpattern.creational.factory;

public class EmailNotification implements Notification {

    @Override
    public String notifyUser() {
        return "Sending email Notification";
    }
}


