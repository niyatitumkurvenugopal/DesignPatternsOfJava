package com.niyati.designpattern.creational.singleton;

public class LazyInitializationSingleton {
    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance(){
        if(instance==null){
            instance=new LazyInitializationSingleton();
        }
        System.out.println(instance);
        return instance;
    }


}
