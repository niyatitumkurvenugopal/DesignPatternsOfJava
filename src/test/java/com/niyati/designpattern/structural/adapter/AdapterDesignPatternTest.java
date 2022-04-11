package com.niyati.designpattern.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterDesignPatternTest {

    @Test
    void testAdapterPattern() {
        ChromeDriver chromeDriver = new ChromeDriver();
        IEDriver ieDriver = new IEDriver();
        WebDriverAdapter wID = new WebDriverAdapter(ieDriver);
        assertEquals("Get element from chrome", chromeDriver.getElement());
        assertEquals("Select element from chrome", chromeDriver.selectElement());
        assertEquals("Find element from IEDriver", wID.getElement());
        assertEquals("click element from IEDriver", wID.selectElement());
        assertEquals("Find element from IEDriver", ieDriver.findElement());
        assertEquals("click element from IEDriver", ieDriver.clickElement());

    }


}