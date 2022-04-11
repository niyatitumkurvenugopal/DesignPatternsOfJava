package com.niyati.designpattern.behavioral.cor;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChainOfResponsibilityTest {

    @Test
    void additionShouldHappen() {
        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);

        Numbers request = new Numbers(30, 20, "add");
        assertEquals(50, calculation1.calculate(request));

        Numbers request1 = new Numbers(40, 20, "subtract");
        assertEquals(20, calculation2.calculate(request1));

        Numbers request2 = new Numbers(40, 20, "divide");
        assertEquals(0, calculation1.calculate(request2));
    }

}
