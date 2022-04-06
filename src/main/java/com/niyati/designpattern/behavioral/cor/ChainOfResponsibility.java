package com.niyati.designpattern.behavioral.cor;

public class ChainOfResponsibility {
    public static void main(String[] args) {

        Chain calculation1 = new AddNumbers();
        Chain calculation2 = new SubtractNumbers();

        calculation1.setNextChain(calculation2);
        calculation2.setNextChain(calculation1);

        Numbers request = new Numbers(20, 20, "add");
        Numbers request1 = new Numbers(40, 10, "subtract");

        calculation1.calculate(request);
        calculation2.calculate(request1);
    }
}
