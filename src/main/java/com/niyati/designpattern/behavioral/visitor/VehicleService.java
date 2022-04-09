package com.niyati.designpattern.behavioral.visitor;

public class VehicleService {
    public static int calculateTotal(Vehicle[] vehicles) {
        VehicleInspector inspector = new VehicleInspection();
        int total = 0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.accept(inspector);
        }
        return total;

    }
}
