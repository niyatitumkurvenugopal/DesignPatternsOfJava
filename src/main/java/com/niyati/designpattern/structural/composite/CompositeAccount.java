package com.niyati.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeAccount {
    private List<Account> accountList=new ArrayList<>();

    public float getBalance(){
        float totalBalance=0;
        for(Account f:accountList){
            totalBalance=totalBalance+f.getBalance();
        }
        return totalBalance;
    }
    public void addAccount(Account acc){
        accountList.add(acc);
    }
}
