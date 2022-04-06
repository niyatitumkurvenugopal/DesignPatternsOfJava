package com.niyati.designpattern.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeDesignPatternTest {
    @Test
    public void sonyNewRemote() {
        Tv sonyNewRemote = new Sony(new NewRemote());
        assertEquals(sonyNewRemote.On(), "New Remote On. Sony Tv is On");
        assertEquals(sonyNewRemote.Off(), "New Remote Off. Sony Tv is Off");
    }

    @Test
    public void onePlusOldRemote() {
        Tv onePlusOldRemote = new OnePlus(new OldRemote());
        assertEquals(onePlusOldRemote.On(), "Old Remote  On. OnePlus Tv is On");
        assertEquals(onePlusOldRemote.Off(), "Old Remote Off. OnePlus Tv is Off");

    }

}