package com.niyati.designpattern.structural.bridge;

public abstract class Tv {
    protected Remote remote;

    public Tv(Remote r){
        this.remote=r;
    }

    abstract public void On();
    abstract public void Off();



}

