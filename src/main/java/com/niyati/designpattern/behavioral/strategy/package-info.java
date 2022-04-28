package com.niyati.designpattern.behavioral.strategy;
/**
 * Strategy pattern defines a family of algorithms ,put each of them into a separate class and make them interchangeable.
 * Use this pattern when we have a lot of similar classes that only differ in the way they execute some behavior.
 * For good coding we need to abstract out which is different.
 * That is make a different class and put just those things that are different inside the subclasses.
 * For example Animal Superclass should not consist of fly() method.
 * It should be in subclass which has this feature.
 * <p>
 * Advantages
 * It lets us extract the varying behavior into a separate class hierarchy
 * and combine the original classes into one,thereby reducing duplicate code.
 * <p>
 * Disadvantages
 * The application must be aware of all the strategies to select the right one for the right situation.
 */