package com.niyati.designpattern.behavioral.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MediatorDesignPatternTest {
    @Test
    void testMediatorPattern() {
        ChatMediator mediator=new ChatMediatorImpl();
        User user1=new UserImpl(mediator,"Niyati");
        User user2=new UserImpl(mediator,"Savita");
        mediator.addUser(user1);
        mediator.addUser(user2);

        assertEquals("Sending Message",user1.send("Hi"));
        assertEquals("Received Message",user2.receive("Hi"));
    }

}