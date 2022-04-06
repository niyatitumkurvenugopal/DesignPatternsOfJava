package com.niyati.designpattern.structural.bridge;

public class Sony extends Tv {

    public Sony(Remote r) {
        super(r);
    }


    @Override
    public String On() {
        return remote.remoteOn() +sonyTvOn();
    }
    private String sonyTvOn(){
        return " Sony Tv is On";
    }

    @Override
    public String Off() {
        return remote.remoteOff() +sonyTvOff();
    }
    private String sonyTvOff(){
        return " Sony Tv is Off";
    }
}
