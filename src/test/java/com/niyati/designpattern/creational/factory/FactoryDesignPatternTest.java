package com.niyati.designpattern.creational.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryDesignPatternTest {
    @Test
    public void iphone() {
        Mobile iphone = MobileFactory.getInstance("IPhone", 6, "A15");
        assertEquals("Ram: 6 Processor: A15",iphone.toString());
    }
    @Test
    public void onePlus() {
        Mobile onePlus = MobileFactory.getInstance("OnePlus", 8, "Octa Core");
        assertEquals("Ram: 8 Processor: Octa Core",onePlus.toString());
    }

}