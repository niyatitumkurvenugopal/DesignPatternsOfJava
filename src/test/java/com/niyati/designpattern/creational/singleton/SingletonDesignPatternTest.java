package com.niyati.designpattern.creational.singleton;

import org.junit.Test;

public class SingletonDesignPatternTest {
    @Test
    public void lazyInitializationSingleton() {
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
    }

    @Test
    public void eagerInitializationSingleton() {
        EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
    }
}