package com.niyati.designpattern.structural.bridge;

public class OnePlus extends Tv {

    public OnePlus(Remote r) {
        super(r);
    }


    @Override
    public void On() {
        System.out.println("OnePlus Tv is On");
        remote.remoteOn();
    }

    @Override
    public void Off() {
        System.out.println("OnePlusTv is Off");
        remote.remoteOff();
    }
}
