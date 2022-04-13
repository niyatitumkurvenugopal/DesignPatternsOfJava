package com.niyati.designpattern.creational.factory;

public class MobileFactory {
    private MobileFactory() {
    }

    public static Mobile getInstance(String str, int ram, String processor) {
        if (str.equals("IPhone")) {
            return new IPhone(ram, processor);
        } else if (str.equals("OnePlus")) {
            return new OnePlus(ram, processor);
        }
        return null;
    }
}


