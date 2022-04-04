package com.niyati.designpattern.structural.bridge;

public class BridgeDesignPattern {
    public static void main(String[] args) {
        Tv sonyNewRemote= new Sony(new NewRemote());
        sonyNewRemote.On();
        sonyNewRemote.Off();

        Tv onePlusOldRemote= new OnePlus(new OldRemote());
        onePlusOldRemote.On();
        onePlusOldRemote.Off();

    }
}
