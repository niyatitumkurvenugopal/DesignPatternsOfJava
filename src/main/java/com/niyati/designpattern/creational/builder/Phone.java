package com.niyati.designpattern.creational.builder;

public class Phone {
    private String os;
    private String processor;
    private int ram;
    private int battery;

    public void setOs(String os) {
        this.os = os;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


    @Override
    public String toString() {
        return "Phone{" + "os='" + os + '\'' + ", processor='" + processor + '\'' + ", ram=" + ram + ", battery=" + battery + '}';
    }
}
