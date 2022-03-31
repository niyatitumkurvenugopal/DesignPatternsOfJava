package com.niyati.designpattern.structural.bridge;

public class Sony extends Tv {

    public Sony(Remote r) {
        super(r);
    }


    @Override
    public void On() {
        System.out.println("Sony Tv is On");
        remote.remoteOn();
    }

    @Override
    public void Off() {
        System.out.println("Sony Tv is Off");
        remote.remoteOff();
    }
}
