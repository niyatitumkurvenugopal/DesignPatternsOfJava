package com.niyati.designpattern.creational.factory.model;

public abstract class Mobile {
    public abstract int getRam();

    public abstract String getProcessor();


    public String toString() {
        return "Ram: " + this.getRam() + " Processor: " + this.getProcessor();


    }


}
