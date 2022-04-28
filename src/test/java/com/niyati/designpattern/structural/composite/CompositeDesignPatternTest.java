package com.niyati.designpattern.structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeDesignPatternTest {
    @Test
    void testCompositePattern() {
        CompositeAccount component = new CompositeAccount();

        DepositAccount depositAccount1 = new DepositAccount("DA01", 300);
        DepositAccount depositAccount2 = new DepositAccount("DA02", 800);

        SavingAccount savingAccount1 = new SavingAccount("SA01", 500);
        SavingAccount savingAccount2 = new SavingAccount("SA02", 1000);

        component.addAccount(depositAccount1);
        component.addAccount(depositAccount2);
        component.addAccount(savingAccount1);
        component.addAccount(savingAccount2);

        component.removeAccount(savingAccount1);

        float totalBalance = component.getBalance();
        assertEquals(2100.0, totalBalance);
    }

}