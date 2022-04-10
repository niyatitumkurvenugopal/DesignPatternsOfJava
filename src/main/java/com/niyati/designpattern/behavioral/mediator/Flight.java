package com.niyati.designpattern.behavioral.mediator;

public class Flight implements Command {
    private final IATCMediator atcMediator;

    public Flight(IATCMediator iatcMediator) {
        this.atcMediator = iatcMediator;
    }

    public String land() {
        if (atcMediator.isLandingOk()) {
            atcMediator.setLandingStatus(true);
            return "Successfully Landed.";
        }
            return "Waiting for landing.";

    }

    public String  getReady() {
        return "Ready for Landing.";
    }
}

