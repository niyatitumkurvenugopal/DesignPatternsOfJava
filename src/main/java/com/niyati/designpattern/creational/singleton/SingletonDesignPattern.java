package com.niyati.designpattern.creational.singleton;

public class SingletonDesignPattern {
    public static void main(String[] args) {
        LazyInitializationSingleton instance= LazyInitializationSingleton.getInstance();
        System.out.println(instance);

        EagerInitializationSingleton instance1= EagerInitializationSingleton.getInstance();
        System.out.println(instance1);
    }
}
