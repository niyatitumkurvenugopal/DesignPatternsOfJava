package com.niyati.designpattern.structural.bridge;

public class OldRemote implements Remote {

    @Override
    public void remoteOn(){
        System.out.println("Old Remote  On");
    }

    @Override
    public void remoteOff(){
        System.out.println("Old Remote Off");
    }

}
