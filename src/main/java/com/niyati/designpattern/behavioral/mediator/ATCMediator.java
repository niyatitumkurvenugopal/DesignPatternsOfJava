package com.niyati.designpattern.behavioral.mediator;

public class ATCMediator implements IATCMediator {
    private Flight flight;
    private Runway runway;
    private boolean land;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(boolean status) {
        land = status;
    }
}
