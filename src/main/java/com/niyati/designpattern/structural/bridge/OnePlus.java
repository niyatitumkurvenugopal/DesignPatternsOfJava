package com.niyati.designpattern.structural.bridge;

public class OnePlus extends Tv {

    public static final String ONE_PLUS_TV_IS_ON = " OnePlus Tv is On";
    public static final String ONE_PLUS_TV_IS_OFF = " OnePlus Tv is Off";

    public OnePlus(Remote r) {
        super(r);
    }

    @Override
    public String on() {
        return remote.remoteOn() + onePlusTvOn();
    }

    private String onePlusTvOn() {
        return ONE_PLUS_TV_IS_ON;
    }

    @Override
    public String off() {
        return remote.remoteOff() + onePlusTvOff();
    }

    private String onePlusTvOff() {
        return ONE_PLUS_TV_IS_OFF;
    }


}
