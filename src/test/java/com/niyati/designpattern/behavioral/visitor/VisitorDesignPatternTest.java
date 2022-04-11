package com.niyati.designpattern.behavioral.visitor;

import org.junit.Test;

import static com.niyati.designpattern.behavioral.visitor.VehicleService.calculateTotal;
import static org.junit.jupiter.api.Assertions.*;

public class VisitorDesignPatternTest {
    @Test
    public void totalServiceCharge(){
        Vehicle[] vehicles=new Vehicle[]{
                new Car("White",2013),
                new Van(5000,6),
                new MotorBike(350,"Royal Enfield")
        };
        int totalCost=calculateTotal(vehicles);
        assertEquals(750,totalCost);
    }

}