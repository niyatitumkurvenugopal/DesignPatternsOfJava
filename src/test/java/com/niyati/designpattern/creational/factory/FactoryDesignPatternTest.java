package com.niyati.designpattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryDesignPatternTest {
    @Test
    void testFactoryPattern() {
        Mobile iphone = MobileFactory.getInstance("IPhone", 6, "A15");
        assertEquals("A15", iphone.getProcessor());
        assertEquals(6, iphone.getRam());

        Mobile onePlus = MobileFactory.getInstance("OnePlus", 8, "Octa Core");
        assertEquals("Octa Core", onePlus.getProcessor());
        assertEquals(8, onePlus.getRam());
    }
}