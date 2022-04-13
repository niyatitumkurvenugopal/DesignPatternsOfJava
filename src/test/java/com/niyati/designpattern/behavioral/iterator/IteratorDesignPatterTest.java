package com.niyati.designpattern.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IteratorDesignPatterTest {

    @Test
    void testIteratorPattern() {
        SongsRepository songs = new SongsRepository();
        String allSongs = " ";

        for (Iterator iterator = songs.getIterator(); iterator.hasNext(); ) {
            String song = (String) iterator.next();
            allSongs = allSongs + song;
        }
        assertEquals("  You Belong With Me  We Don't Talk Anymore  Me  Blank Space ",allSongs);
    }
}

