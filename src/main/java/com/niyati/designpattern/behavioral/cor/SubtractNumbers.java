package com.niyati.designpattern.behavioral.cor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubtractNumbers implements Chain {
    private static final Logger logger = LoggerFactory.getLogger(Chain.class);
    private Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public int calculate(Numbers request) {
        if (request.getCalculationWanted() == "subtract") {
            logger.info("Subtraction of {} - {} = {}", request.getNumber1(), request.getNumber2(), (request.getNumber1() - request.getNumber2()));
            return (request.getNumber1() - request.getNumber2());
        }
        logger.error("Only works For add and subtract");
        return 0;
    }
}
