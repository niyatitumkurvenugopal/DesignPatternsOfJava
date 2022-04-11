package com.niyati.designpattern.behavioral.mediator;

public interface IATCMediator {
    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    void setLandingStatus(boolean status);
}
