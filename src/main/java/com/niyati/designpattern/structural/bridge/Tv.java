package com.niyati.designpattern.structural.bridge;

public abstract class Tv {
    public Remote remote;

    public Tv(Remote r){
        this.remote=r;
    }

    abstract public String On();
    abstract public String Off();



}

