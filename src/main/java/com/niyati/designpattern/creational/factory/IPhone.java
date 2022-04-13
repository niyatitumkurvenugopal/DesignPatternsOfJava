package com.niyati.designpattern.creational.factory;

public class IPhone extends Mobile {

    int ramSize;
    String processor;

    public IPhone(int ramSize, String processor) {
        this.ramSize = ramSize;
        this.processor = processor;
    }

    @Override
    public int getRam() {
        return this.ramSize;
    }

    @Override
    public String getProcessor() {
        return this.processor;
    }
}

