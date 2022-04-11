package com.niyati.designpattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyDesignPatternTest {
    @Test
    public void additionOperationShouldHappen() {
        Operations operations = new Operations(new AddOperation());
        assertEquals(15, operations.executeOperation(10, 5));
    }

    @Test
    public void subtractionOperationShouldHappen() {
        Operations operations = new Operations(new SubtractOperation());
        assertEquals(5, operations.executeOperation(10, 5));
    }

    @Test
    public void multiplicationOperationShouldHappen() {
        Operations operations = new Operations(new MultiplyOperation());
        assertEquals(50, operations.executeOperation(10, 5));
    }

    @Test
    public void divisionOperationShouldHappen() {
        Operations operations = new Operations(new DivisionOperation());
        assertEquals(2, operations.executeOperation(10, 5));
    }
}