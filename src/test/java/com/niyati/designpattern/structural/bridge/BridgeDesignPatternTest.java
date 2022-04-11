package com.niyati.designpattern.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeDesignPatternTest {
    @Test
    void tsetBridgePattern() {
        Tv sonyNewRemote = new Sony(new NewRemote());
        assertEquals( "New Remote On. Sony Tv is On",sonyNewRemote.On());
        assertEquals("New Remote Off. Sony Tv is Off",sonyNewRemote.Off() );

        Tv onePlusOldRemote = new OnePlus(new OldRemote());
        assertEquals("Old Remote  On. OnePlus Tv is On",onePlusOldRemote.On());
        assertEquals("Old Remote Off. OnePlus Tv is Off",onePlusOldRemote.Off());
    }

}