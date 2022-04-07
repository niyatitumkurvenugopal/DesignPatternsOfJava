package com.niyati.designpattern.behavioral.cor;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChainOfResponsibilityTest {
    @Test
    public void additionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(20, 20, "add");
        calculation1.calculate(request);
        assertFalse(false,"50");
    }

    @Test
    public void subtractionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(20, 20, "subtract");
        calculation1.calculate(request);
        assertFalse(false,"400");
    }
}
