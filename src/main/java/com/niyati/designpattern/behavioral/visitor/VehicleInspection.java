package com.niyati.designpattern.behavioral.visitor;

public class VehicleInspection implements VehicleInspector{

    @Override
    public int visit(Car car) {
        int serviceCharge=0;
        if(car.getColor()=="Black"){
            serviceCharge+=100;
        }
        else{
            serviceCharge+=50;
        }
        return serviceCharge;
    }

    @Override
    public int visit(Van van) {
        int serviceCharge=0;
        if(van.getNumberOfDoors()>4){
            serviceCharge+=500;
        }
        else{
            serviceCharge+=100;
        }
        return serviceCharge;
    }

    @Override
    public int visit(MotorBike motorBike) {
        int serviceCharge=0;
        if(motorBike.getEngineCapacity()>=200){
            serviceCharge+=200;
        }
        else{
            serviceCharge+=50;
        }
        return serviceCharge;
    }
}
