package com.niyati.designpattern.creational.factory;

public abstract class Mobile {

    public abstract int getRam();
    public abstract String getProcessor();

    public String toString() {
        StringBuilder mobile=new StringBuilder();
        mobile.append("Ram: ").append(getRam())
                .append(" Processor: ").append(getProcessor());
        String result=mobile.toString();
        return result;

    }
}
