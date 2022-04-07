package com.niyati.designpattern.creational.singleton;

public class EagerInitializationSingleton {
    private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

    private EagerInitializationSingleton() {
    }

    public static EagerInitializationSingleton getInstance() {
        System.out.println(instance);
        return instance;
    }
}
