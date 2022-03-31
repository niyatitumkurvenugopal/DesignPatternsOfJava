package com.niyati.designpattern.structural.composite;

public class CompositeDesignPattern {
    public static void main(String[] args) {
        CompositeAccount component= new CompositeAccount();

        component.addAccount(new DepositAccount("DA01",300));
        component.addAccount(new DepositAccount("DA02",800));
        component.addAccount(new SavingAccount("SA01",500));
        float totalBalance=component.getBalance();
        System.out.println("Total Balance:" + totalBalance);

    }
}
