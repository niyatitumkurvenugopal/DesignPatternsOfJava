package com.niyati.designpattern.creational.singleton;

public class EagerInitializationSingleton {
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton(){}

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }
}
