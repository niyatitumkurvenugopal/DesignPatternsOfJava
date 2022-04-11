package com.niyati.designpattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryDesignPatternTest {
    @Test
    public void CanGetIphoneFeatures() {
        Mobile iphone = MobileFactory.getInstance("IPhone", 6, "A15");
        assertEquals( "A15",iphone.getProcessor());
        assertEquals(6,iphone.getRam());
    }

    @Test
    public void CanGetOnePlusFeatures() {
        Mobile onePlus = MobileFactory.getInstance("OnePlus", 8, "Octa Core");
        assertEquals( "Octa Core",onePlus.getProcessor());
        assertEquals(8,onePlus.getRam());
    }
}