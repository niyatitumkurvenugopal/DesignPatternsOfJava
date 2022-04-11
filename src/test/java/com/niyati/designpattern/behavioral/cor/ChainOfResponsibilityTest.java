package com.niyati.designpattern.behavioral.cor;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChainOfResponsibilityTest {

    @Test
    public void additionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(30, 20, "add");
        assertEquals(50, calculation1.calculate(request));
    }

    @Test
    public void subtractionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(40, 20, "subtract");
        assertEquals(20, calculation2.calculate(request));
    }

    @Test
    public void ZeroShouldCome() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(40, 20, "multiply");
        Numbers request1 = new Numbers(40, 20, "divide");
        assertEquals(0, calculation1.calculate(request));
        assertEquals(0, calculation2.calculate(request));
    }
}
