package com.niyati.designpattern.structural.bridge;

public abstract class Tv {
    protected Remote remote;

    protected Tv(Remote r){
        this.remote=r;
    }

    public abstract String on();
    public abstract String off();



}

