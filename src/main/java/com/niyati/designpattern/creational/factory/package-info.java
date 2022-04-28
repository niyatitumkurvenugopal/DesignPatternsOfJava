package com.niyati.designpattern.creational.factory;
/**
 * It can be said as ,it defines an interface for creating an object
 * but let the subclasses decide which classes to instantiate.
 * When you have 1 super class and many subclasses and when we add extra subclass .
 * When we add extra subclass, we can change only in factory rather than in main class.
 * <p>
 * Advantages
 * It removes the instantiation of actual implementation classes from client code.
 * Easy to extend.
 * <p>
 * Disadvantages
 * High number of required classes.
 */