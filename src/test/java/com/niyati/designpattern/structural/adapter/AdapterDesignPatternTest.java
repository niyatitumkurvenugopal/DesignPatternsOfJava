package com.niyati.designpattern.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterDesignPatternTest {

    @Test
    public void chromeDriver() {
        ChromeDriver chromeDriver = new ChromeDriver();
        assertEquals("Get element from chrome",chromeDriver.getElement());
        assertEquals("Select element from chrome",chromeDriver.selectElement());

    }
    @Test
    public void webDriver() {
        IEDriver ieDriver = new IEDriver();
        WebDriverAdapter wID = new WebDriverAdapter(ieDriver);
        assertEquals("Find element from IEDriver",wID.getElement());
        assertEquals("click element from IEDriver",wID.selectElement());
    }
    @Test
    public void ieDriver() {
        IEDriver ieDriver = new IEDriver();
        assertEquals("Find element from IEDriver",ieDriver.findElement());
        assertEquals("click element from IEDriver",ieDriver.clickElement());

    }

}