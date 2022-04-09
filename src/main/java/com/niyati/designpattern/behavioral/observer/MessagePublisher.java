package com.niyati.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject{
   private List<Observer> observers =new ArrayList<>();

    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public String notifyUpdate(Message message) {
        for(Observer o:observers){
            o.update(message);
        }
        return "Updated Message";
    }
}
