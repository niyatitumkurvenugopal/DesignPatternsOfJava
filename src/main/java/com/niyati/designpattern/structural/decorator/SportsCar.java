package com.niyati.designpattern.structural.decorator;

public class SportsCar extends CarDecorator{
    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public String assemble() {
        return super.assemble() +sportsCarFeatures();
    }
    private String sportsCarFeatures(){
        return "with Sports car features ";
    }

}
