package com.niyati.designpattern.structural.adapter;

/**
 * Adapter Design Pattern is a structural design pattern.
 * Adapter design pattern is used to join 2 interfaces.
 * That is it can be said that the object will have the same features but different interfaces.
 * It allows existing classes to be used with others without modifying the source code.
 * <p>
 * For example a charging adapter ( this charging adapter will join 2 interfaces) or a WebDriver adapter.
 * In this example the chromeDriver is implemented by WebDriver.In this WebDriverAdapter is the adapter
 * and the ieDriver is the adaptee.
 * <p>
 * Advantages
 * It allows 2 or more previously incompatible objects to interact.
 * It allows re-usability of existing functionality.
 * <p>
 * Disadvantages
 * Adapter cannot be used with subclasses of adaptee.
 */
