package com.niyati.designpattern.behavioral.command;

public class Fan {
    public static final String FAN_STARTED = "Fan started...";
    public static final String FAN_STOPPED = "Fan stopped...";

    public String start() {
        return FAN_STARTED;
    }

    public String stop() {
        return FAN_STOPPED;
    }
}

