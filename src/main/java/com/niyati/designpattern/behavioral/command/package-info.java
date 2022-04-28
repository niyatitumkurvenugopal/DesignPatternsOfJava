package com.niyati.designpattern.behavioral.command;

/**
 * Command Pattern consists of command object it encapsulates everything required to take an action
 * and allows the execution of the action to occur completely independently of that context.
 * The Command Design Pattern is like a request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and passes the command to the
 * corresponding object which executes the command.
 * <p>
 * Advantages
 * Extension to add new command is easy and can be done without changing the existing code.
 * <p>
 * Disadvantages
 * Increase in the number of classes for each individual command.
 */