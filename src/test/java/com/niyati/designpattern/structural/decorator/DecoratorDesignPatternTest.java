package com.niyati.designpattern.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorDesignPatternTest {
    @Test
    public void decoratorForSportsCar() {
        Car sportsCar = new SportsCar(new BasicCar());
        assertEquals(sportsCar.assemble(), "Basic car features assembled with Sports car features ");
    }
    @Test
    public void decoratorForLuxuryCar() {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        assertEquals(luxuryCar.assemble(),"Basic car features assembled with Luxury car features ");
    }
    @Test
    public void decoratorForLuxuryCarAndSportsCar() {
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        assertEquals(sportsLuxuryCar.assemble(),"Basic car features assembled with Luxury car features with Sports car features ");
    }

}