package com.niyati.designpattern.structural.bridge;

public class NewRemote implements Remote {

    @Override
    public void remoteOn(){
        System.out.println("New Remote On");
    }

    @Override
    public void remoteOff(){
        System.out.println("New Remote Off");
    }

}
