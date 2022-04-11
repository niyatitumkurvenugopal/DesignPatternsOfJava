package com.niyati.designpattern.structural.decorator;

public class LuxuryCar extends CarDecorator{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() +luxuryCarFeatures();
    }
    private String luxuryCarFeatures(){
        return "with Luxury car features ";
    }
}
