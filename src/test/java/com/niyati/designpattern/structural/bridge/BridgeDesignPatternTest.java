package com.niyati.designpattern.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BridgeDesignPatternTest {
    @Test
    void testBridgePattern() {
        Tv sonyNewRemote = new Sony(new NewRemote());
        assertEquals( "New Remote On. Sony Tv is On",sonyNewRemote.on());
        assertEquals("New Remote Off. Sony Tv is Off",sonyNewRemote.off() );

        Tv onePlusOldRemote = new OnePlus(new OldRemote());
        assertEquals("Old Remote  On. OnePlus Tv is On",onePlusOldRemote.on());
        assertEquals("Old Remote Off. OnePlus Tv is Off",onePlusOldRemote.off());
    }

}