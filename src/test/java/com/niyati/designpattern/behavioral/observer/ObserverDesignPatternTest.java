package com.niyati.designpattern.behavioral.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverDesignPatternTest {
    @Test
    public void message() {
        MessageSubscriberOne messageSubscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo messageSubscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree messageSubscriberThree = new MessageSubscriberThree();

        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberTwo);

        assertEquals("Updated Message", messagePublisher.notifyUpdate(new Message("First Message")));

        messagePublisher.detach(messageSubscriberOne);
        messagePublisher.attach(messageSubscriberThree);

        assertEquals("Updated Message", messagePublisher.notifyUpdate(new Message("Second Message")));

    }
}