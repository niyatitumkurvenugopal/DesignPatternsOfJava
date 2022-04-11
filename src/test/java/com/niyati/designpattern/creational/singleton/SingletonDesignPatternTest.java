package com.niyati.designpattern.creational.singleton;

import org.junit.jupiter.api.Test;

class SingletonDesignPatternTest {
    @Test
    void testSingletonPattern() {
        LazyInitializationSingleton instance = LazyInitializationSingleton.getInstance();

        EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();
    }

}