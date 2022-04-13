package com.niyati.designpattern.structural.decorator;

public class LuxuryCar extends CarDecorator{

    public static final String WITH_LUXURY_CAR_FEATURES = "with Luxury car features ";

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public String assemble() {
        return super.assemble() +luxuryCarFeatures();
    }
    private String luxuryCarFeatures(){
        return WITH_LUXURY_CAR_FEATURES;
    }
}
