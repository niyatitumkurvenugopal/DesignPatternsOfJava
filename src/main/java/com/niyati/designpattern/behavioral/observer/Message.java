package com.niyati.designpattern.behavioral.observer;

public class Message {
    public String messageContent;

    public Message(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
