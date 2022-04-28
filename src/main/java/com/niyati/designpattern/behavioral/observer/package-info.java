package com.niyati.designpattern.behavioral.observer;
/**
 * This pattern defines one to many dependency in object.
 * That is if one pattern changes its state all the dependent objects will be notified and updated.
 * <p>
 * For example Package delivery,in this whenever location of the package changes i.e from shop to warehouse.
 * Then it should be updated and notified to all observer that is sellers,warehouse and User.
 * And if warehouse not required to update ,then we can detach them, and they will not be updated.
 * In this way this observer pattern works.
 * <p>
 * Advantages
 * It allows sending the data to other objects effectively without any change in the subject.
 * Observers can be added or removed at any point in time.
 * <p>
 * Disadvantages
 * Subscribers are notified in a random manner.
 */