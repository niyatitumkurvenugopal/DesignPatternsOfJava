package com.niyati.designpattern.behavioral.chainOfResponsibility;

public class SubtractNumbers implements Chain{
    private Chain nextChain;

    public void setNextChain(Chain nextChain){
        this.nextChain=nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted()=="subtract"){
            System.out.println(request.getNumber1() + " - " + request.getNumber2() + "=" + (request.getNumber1()-request.getNumber2()));
        }
        else {
            nextChain.calculate(request);
        }
    }
}
