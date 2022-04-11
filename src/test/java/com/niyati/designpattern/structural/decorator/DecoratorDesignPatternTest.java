package com.niyati.designpattern.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorDesignPatternTest {
    @Test
    void testDecoratorPattern() {
        Car sportsCar = new SportsCar(new BasicCar());
        assertEquals("Basic car features assembled with Sports car features ",sportsCar.assemble());

        Car luxuryCar = new LuxuryCar(new BasicCar());
        assertEquals("Basic car features assembled with Luxury car features ",luxuryCar.assemble());

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        assertEquals("Basic car features assembled with Luxury car features with Sports car features ",sportsLuxuryCar.assemble());
    }
}