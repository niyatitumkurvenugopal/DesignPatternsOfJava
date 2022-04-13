package com.niyati.designpattern.creational.builder;

public class Phone {
    private String os;
    private String processor;
    private int ram;
    private int battery;

    public Phone(String os, String processor, int ram, int battery) {
        super();
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.battery = battery;
    }


    @Override
    public String toString() {
        StringBuilder phone=new StringBuilder();
        phone.append("Phone: os=").append(os)
                        .append(", processor= ").append(processor)
                        .append(", ram=").append(ram)
                        .append( ", battery=").append(battery);

        return phone.toString();
    }



}
