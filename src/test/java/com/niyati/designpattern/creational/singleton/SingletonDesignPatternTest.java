package com.niyati.designpattern.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonDesignPatternTest {
    @Test
    public void lazyInitializationSingleton() {
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();
        assertEquals("com.niyati.designpattern.creational.singleton.LazyInitializationSingleton@289d1c02", instance.toString());
    }
    @Test public void eagerInitializationSingleton () {
        EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
        assertEquals("com.niyati.designpattern.creational.singleton.EagerInitializationSingleton@51c8530f", instance1.toString());

    }
}