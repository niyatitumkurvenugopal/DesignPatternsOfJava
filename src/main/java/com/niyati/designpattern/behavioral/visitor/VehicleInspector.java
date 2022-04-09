package com.niyati.designpattern.behavioral.visitor;

public interface VehicleInspector {
    public int visit(Car car);
    public int visit(Van van);
    public int visit(MotorBike motorBike);
}
