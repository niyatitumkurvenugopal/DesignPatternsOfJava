package com.niyati.designpattern.behavioral.cor;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChainOfResponsibilityTest {
    @Test
    public void additionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(20, 20, "add");
        calculation1.calculate(request);
    }

    @Test
    public void subtractionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(20, 20, "subtract");
        calculation1.calculate(request);
    }

    @Test
    public void errorShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(20, 20, "multiply");
        calculation1.calculate(request);
    }
}
