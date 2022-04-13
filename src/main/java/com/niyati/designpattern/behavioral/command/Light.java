package com.niyati.designpattern.behavioral.command;

public class Light {

    public static final String LIGHT_IS_ON = "Light is On";
    public static final String LIGHT_IS_OFF = "Light is Off";

    public String turnOn() {
        return LIGHT_IS_ON;
    }

    public String turnOff() {
        return LIGHT_IS_OFF;
    }
}
