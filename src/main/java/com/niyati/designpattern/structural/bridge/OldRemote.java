package com.niyati.designpattern.structural.bridge;

public class OldRemote implements Remote {

    @Override
    public String remoteOn(){
        return "Old Remote  On.";
    }

    @Override
    public String remoteOff(){
        return "Old Remote Off.";
    }

}
