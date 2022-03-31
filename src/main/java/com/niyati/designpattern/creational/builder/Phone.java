package com.niyati.designpattern.creational.builder;

public class Phone {
    private final String os;
    private final String processor;
    private final int ram;
    private final int battery;

    public Phone(String os, String processor, int ram, int battery) {
        super();
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
    }



    @Override
    public String toString() {
        return "Phone{" + "os='" + os + '\'' + ", processor='" + processor + '\'' + ", ram=" + ram + ", battery=" + battery + '}';
    }
}
