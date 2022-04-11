package com.niyati.designpattern.behavioral.strategy;

public class AddOperation implements ArithmeticOperations {
    @Override
    public int doOperation(int num1,int num2){
        return num1+num2;
    }
}
