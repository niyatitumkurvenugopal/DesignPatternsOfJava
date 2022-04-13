package com.niyati.designpattern.structural.decorator;

public class SportsCar extends CarDecorator{

    public static final String WITH_SPORTS_CAR_FEATURES = "with Sports car features ";

    public SportsCar(Car car) {
        super(car);
    }
    @Override
    public String assemble() {
        return super.assemble() +sportsCarFeatures();
    }
    private String sportsCarFeatures(){
        return WITH_SPORTS_CAR_FEATURES;
    }

}
