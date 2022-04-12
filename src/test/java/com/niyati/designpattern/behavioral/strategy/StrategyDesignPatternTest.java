package com.niyati.designpattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyDesignPatternTest {
    @Test
    void testStrategyPattern() {
        Operations operations1 = new Operations(new AddOperation());
        assertEquals(15, operations1.executeOperation(10, 5));

        Operations operations2 = new Operations(new SubtractOperation());
        assertEquals(5, operations2.executeOperation(10, 5));

        Operations operations3 = new Operations(new MultiplyOperation());
        assertEquals(50, operations3.executeOperation(10, 5));

        Operations operations4 = new Operations(new DivisionOperation());
        assertEquals(2, operations4.executeOperation(10, 5));
    }

}