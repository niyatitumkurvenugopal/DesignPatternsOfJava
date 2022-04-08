package com.niyati.designpattern.behavioral.state;

public class OrderedState implements PackageState {

    @Override
    public void next(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("The package is in root state");
    }

    @Override
    public String printStatus() {
        return "Package ordered, not delivered to the office yet.";
    }
}
