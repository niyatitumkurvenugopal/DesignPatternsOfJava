package com.niyati.designpattern.creational.factory.factory;

import com.niyati.designpattern.creational.factory.model.OnePlus;
import com.niyati.designpattern.creational.factory.model.IPhone;
import com.niyati.designpattern.creational.factory.model.Mobile;

public class MobileFactory {
    public static Mobile getInstance(String type, int ram,String processor) {
        if (type == "IPhone") {
            return new IPhone(ram,processor);
        } else if (type == "OnePlus") {
            return new OnePlus(ram,processor);
        }
        return null;
    }
}
