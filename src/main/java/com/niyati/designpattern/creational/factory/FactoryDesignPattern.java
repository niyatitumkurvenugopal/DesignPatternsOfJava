package com.niyati.designpattern.creational.factory;

import com.niyati.designpattern.creational.factory.factory.MobileFactory;
import com.niyati.designpattern.creational.factory.model.Mobile;

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Mobile iphone= MobileFactory.getInstance("IPhone",6,"A15");
        System.out.println(iphone);
        Mobile oneplus= MobileFactory.getInstance("OnePlus",8,"Octa Core");
        System.out.println(oneplus);
    }
}
