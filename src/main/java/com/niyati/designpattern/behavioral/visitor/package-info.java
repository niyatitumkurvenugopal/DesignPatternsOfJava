package com.niyati.designpattern.behavioral.visitor;
/**
 * In Visitor design pattern we can add new behaviors to existing class without altering the code.
 * In this there is 2 methods accept() and visit().
 * In this accept() method will accept the visit if there is a visitor and visit() method will be called
 * whenever there is a visit.
 * <p>
 * For example,Uber taxi,that is in this an employee calls an uber taxi to his door step.
 * The Uber taxi visitor is in charge of transportation for that person after the person sits in.
 * <p>
 * Advantages
 * Adding an action to all elements is really easy as you only have to implement the visitor interface.
 * No need to modify every element object to add an action.
 * <p>
 * Disadvantages
 * Visitor can modify elements since an instance of the element is sent to the visitor.
 * This is not recommended as it leads to side effects.
 */