package com.niyati.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCard implements PaymentStrategy {
    private static final Logger logger = LoggerFactory.getLogger(CreditCard.class);

    @Override
    public double pay(double amount) {
        amount -= amount * 3 / 100;//3% discount
        logger.info("Payable amount using Credit Card: Rs. {}", amount);
        return amount;

    }
}
