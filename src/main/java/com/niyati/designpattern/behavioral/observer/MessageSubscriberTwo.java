package com.niyati.designpattern.behavioral.observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageSubscriberTwo implements Observer{
    private static Logger logger = LoggerFactory.getLogger(MessageSubscriberOne.class);
    @Override
    public void update(Message message) {
        logger.info("MessageSubscriberTwo:" + message.getMessageContent());
    }
}