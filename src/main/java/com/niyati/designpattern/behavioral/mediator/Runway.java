package com.niyati.designpattern.behavioral.mediator;

public class Runway implements Command {
    private final IATCMediator atcMediator;

    public Runway(IATCMediator iatcMediator) {
        this.atcMediator = iatcMediator;
        iatcMediator.setLandingStatus(true);
    }

    public String land() {
        atcMediator.setLandingStatus(true);
        return "Landing permission granted.";
    }
}

