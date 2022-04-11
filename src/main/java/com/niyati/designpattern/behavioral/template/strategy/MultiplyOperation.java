package com.niyati.designpattern.behavioral.template.strategy;

public class MultiplyOperation implements ArithmeticOperations{
    @Override
    public int doOperation(int num1,int num2){
        return num1*num2;
    }
}
