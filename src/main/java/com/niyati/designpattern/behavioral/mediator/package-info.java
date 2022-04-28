package com.niyati.designpattern.behavioral.mediator;
/**
 * This design pattern helps in reducing the direct references to each other.
 * One object will depend on mediator rather than many objects.
 * This pattern provides a mediator class which normally handles all the communications between different classes and
 * supports easy maintenance of the code
 * All the communication goes through the mediator.Mediator object takes care of the interaction between dependent objects.
 * <p>
 * Advantages
 * Simplicity
 * Can replace one object in the structure with a different one without affecting the classes and the interfaces.
 * <p>
 * Disadvantages
 * Mediator often needs to be very intimate with all the different classes, and it makes it really complex.
 * Can make it difficult to maintain.
 */