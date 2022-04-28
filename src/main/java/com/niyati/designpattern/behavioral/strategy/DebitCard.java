package com.niyati.designpattern.behavioral.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebitCard implements PaymentStrategy {
    private static final Logger logger = LoggerFactory.getLogger(DebitCard.class);

    @Override
    public double pay(double amount) {
        amount -= amount * 1.5 / 100;//1.5% discount
        logger.info("Payable amount using Debit Card: Rs.{}", amount);
        return amount;

    }
}
