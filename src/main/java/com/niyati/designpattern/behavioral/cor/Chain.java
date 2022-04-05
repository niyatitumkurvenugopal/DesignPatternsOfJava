package com.niyati.designpattern.behavioral.cor;

public interface Chain {
    void setNextChain(Chain nextChain);

    void calculate(Numbers request);
}
