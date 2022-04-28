package com.niyati.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SingletonDesignPatternTest {
    @Test
    void testSingletonPattern() {
        EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
        EagerInitializationSingleton instance2 = EagerInitializationSingleton.getInstance();

        assertEquals(instance1.hashCode(), instance2.hashCode());

        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();

    }

}