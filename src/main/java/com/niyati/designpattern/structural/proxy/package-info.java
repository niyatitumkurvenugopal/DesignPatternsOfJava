package com.niyati.designpattern.structural.proxy;

/**
 * A Proxy Design Pattern is a structural design pattern.
 * <p>
 * Proxy design patterns can be used for control access.
 * It can be said that it will provide security between client and server.
 * <p>
 * For example if we want to give the delete option to only admin users.
 * So if non-admin try to delete something the proxy will check if the non-admin has the access to delete it.
 * If not then it will show an error and if admin tries to delete,
 * he will be able to delete as in proxy it will be having access.
 * <p>
 * Another example in Successfactors changing the designation of employee cannot be done by employee,
 * it can be done only by admin.
 * <p>
 * Advantages
 * It provides security.
 * <p>
 * Disadvantages
 * This pattern introduces another layer of abstraction
 * which sometimes maybe an issue if the real subject code is accessed by some clients directly
 * and some of them might access the proxy classes.
 */