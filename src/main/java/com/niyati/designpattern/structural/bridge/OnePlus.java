package com.niyati.designpattern.structural.bridge;

public class OnePlus extends Tv {

    public OnePlus(Remote r) {
        super(r);
    }

    @Override
    public String On() {
        return remote.remoteOn() +onePlusTvOn();
    }
    private String onePlusTvOn(){
        return " OnePlus Tv is On";
    }

    @Override
    public String Off() {
        return remote.remoteOff() +onePlusTvOff();
    }
    private String onePlusTvOff(){
        return " OnePlus Tv is Off";
    }



}
