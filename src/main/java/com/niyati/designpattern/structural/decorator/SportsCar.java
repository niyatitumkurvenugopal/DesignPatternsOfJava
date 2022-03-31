package com.niyati.designpattern.structural.decorator;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Sports car features Assembled.");
    }
}
