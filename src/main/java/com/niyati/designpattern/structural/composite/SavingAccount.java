package com.niyati.designpattern.structural.composite;

public class SavingAccount implements Account {
    private final String accountNo;
    private final float accountBalance;

    public SavingAccount(String accountNo, float accountBalance) {
        super();
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public float getBalance() {
        return accountBalance;
    }
}
