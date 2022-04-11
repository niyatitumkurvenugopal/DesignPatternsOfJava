package com.niyati.designpattern.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeDesignPatternTest {
    @Test
    public void totalBalanceOfDepositAndSavingsAccount() {
        CompositeAccount component = new CompositeAccount();

        component.addAccount(new DepositAccount("DA01", 300));
        component.addAccount(new DepositAccount("DA02", 800));
        component.addAccount(new SavingAccount("SA01", 500));
        float totalBalance = component.getBalance();
        assertEquals(1600.0, totalBalance);
    }

}