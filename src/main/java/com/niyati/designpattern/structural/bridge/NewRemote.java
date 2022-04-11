package com.niyati.designpattern.structural.bridge;

public class NewRemote implements Remote {

    @Override
    public String remoteOn(){
       return "New Remote On.";
    }

    @Override
    public String remoteOff(){
        return  "New Remote Off.";
    }

}
