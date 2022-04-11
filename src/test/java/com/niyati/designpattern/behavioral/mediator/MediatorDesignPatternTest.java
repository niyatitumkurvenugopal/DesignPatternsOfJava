package com.niyati.designpattern.behavioral.mediator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediatorDesignPatternTest {
    @Test
    public void flightLandSuccessfully_ifRunwayIsClear(){
        IATCMediator atcMediator = new ATCMediator();
        Flight sparrow101 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);
        atcMediator.registerFlight(sparrow101);
        atcMediator.registerRunway(mainRunway);
        assertEquals("Ready for Landing.",sparrow101.getReady());
        assertEquals("Landing permission granted.",mainRunway.land());
        assertEquals("Successfully Landed.",sparrow101.land());
        System.out.println(mainRunway.land());
        System.out.println(sparrow101.land());;
    }

}