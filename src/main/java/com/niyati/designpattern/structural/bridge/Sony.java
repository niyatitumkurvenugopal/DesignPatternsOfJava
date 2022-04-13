package com.niyati.designpattern.structural.bridge;

public class Sony extends Tv {

    public static final String SONY_TV_IS_ON = " Sony Tv is On";
    public static final String SONY_TV_IS_OFF = " Sony Tv is Off";

    public Sony(Remote r) {
        super(r);
    }


    @Override
    public String on() {
        return remote.remoteOn() + sonyTvOn();
    }

    private String sonyTvOn() {
        return SONY_TV_IS_ON;
    }

    @Override
    public String off() {
        return remote.remoteOff() + sonyTvOff();
    }

    private String sonyTvOff() {
        return SONY_TV_IS_OFF;
    }
}
