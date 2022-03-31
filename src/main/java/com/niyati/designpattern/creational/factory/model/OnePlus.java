package com.niyati.designpattern.creational.factory.model;

public class OnePlus extends Mobile {
    int ramSize;
    String processor;
    public OnePlus(int ramSize, String processor){
        this.ramSize=ramSize;
        this.processor=processor;
    }

    @Override
    public int getRam() {
        return this.ramSize;
    }
    @Override
    public String getProcessor(){
        return this.processor;
    }
}
