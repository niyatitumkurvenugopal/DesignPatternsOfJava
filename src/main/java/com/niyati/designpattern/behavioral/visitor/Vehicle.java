package com.niyati.designpattern.behavioral.visitor;

public interface Vehicle {
    public int accept(VehicleInspector vehicleInspector);
}
