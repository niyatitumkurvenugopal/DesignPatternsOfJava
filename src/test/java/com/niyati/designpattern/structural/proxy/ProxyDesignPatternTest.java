package com.niyati.designpattern.structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProxyDesignPatternTest {
    @Test
    void testProxyPattern() {

        Internet internet = new ProxyInternet();
        assertEquals("Access granted.", internet.connectTo("website.com"));

        assertEquals("Access Denied", internet.connectTo("abc.com"));


    }

}