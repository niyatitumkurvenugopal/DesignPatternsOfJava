package com.niyati.designpattern.behavioral.cor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddNumbers implements Chain {
    private static final Logger logger = LoggerFactory.getLogger(AddNumbers.class);
    private Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public int calculate(Numbers request) {
        if (request.getCalculationWanted().equals("add") ){
            int result = request.getNumber1() + request.getNumber2();
            logger.info("Addition of {} + {} = {}", request.getNumber1(), request.getNumber2(), result);
            return result;
        }
        nextChain.calculate(request);
        return 0;
    }
}
