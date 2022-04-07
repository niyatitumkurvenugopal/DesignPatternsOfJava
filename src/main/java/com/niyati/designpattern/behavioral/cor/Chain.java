package com.niyati.designpattern.behavioral.cor;

public interface Chain {
    void setNextChain(Chain nextChain);

    int calculate(Numbers request);
}
