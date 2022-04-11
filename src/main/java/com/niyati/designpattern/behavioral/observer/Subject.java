package com.niyati.designpattern.behavioral.observer;

public interface Subject {
    public void attach(Observer o);
    public void detach(Observer o);
    public String notifyUpdate(Message message);
}
