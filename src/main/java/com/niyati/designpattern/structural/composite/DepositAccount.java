package com.niyati.designpattern.structural.composite;

public class DepositAccount extends Account {
    private final String accountNo;
    private final float accountBalance;

    public DepositAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public float getBalance() {
        return accountBalance;
    }
}
