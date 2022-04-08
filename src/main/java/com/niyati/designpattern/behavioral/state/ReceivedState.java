package com.niyati.designpattern.behavioral.state;


public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by Client");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }
    @Override
    public String printStatus(){
        return "Package has been received";
    }
}


