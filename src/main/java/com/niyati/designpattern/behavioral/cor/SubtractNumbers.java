package com.niyati.designpattern.behavioral.cor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubtractNumbers implements Chain {
    private static final Logger logger = LoggerFactory.getLogger(SubtractNumbers.class);

    public void setNextChain(Chain chain) {
        //This is the end of the chain.
    }

    @Override
    public int calculate(Numbers request) {
        if (request.getCalculationWanted().equals("subtract")) {
            int result = request.getNumber1() - request.getNumber2();
            logger.info("Subtraction of {} - {} = {}", request.getNumber1(), request.getNumber2(), result);
            return result;
        }
        logger.error("Only works For add and subtract");
        return 0;
    }
}
