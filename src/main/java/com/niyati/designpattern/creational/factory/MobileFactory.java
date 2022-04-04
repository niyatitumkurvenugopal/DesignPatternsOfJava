package com.niyati.designpattern.creational.factory;

import com.niyati.designpattern.creational.factory.IPhone;
import com.niyati.designpattern.creational.factory.Mobile;
import com.niyati.designpattern.creational.factory.OnePlus;

public class MobileFactory {

    public static Mobile getInstance(String type, int ram, String processor) {
        if (type == "IPhone") {
            return new IPhone(ram, processor);
        } else if (type == "OnePlus") {
            return new OnePlus(ram, processor);
        }
        return null;
    }
}


