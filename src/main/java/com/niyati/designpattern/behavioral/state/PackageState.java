package com.niyati.designpattern.behavioral.state;

public interface PackageState {
    public void next(Package pkg);
    public void prev(Package pkg);
    public String printStatus();
}
