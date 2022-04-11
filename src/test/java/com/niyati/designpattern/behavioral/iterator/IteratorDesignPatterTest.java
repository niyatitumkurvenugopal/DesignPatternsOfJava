package com.niyati.designpattern.behavioral.iterator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IteratorDesignPatterTest {

    @Test
    public void shouldIterateAllSongs() {
        Songs songs = new Songs();
        String allSongs = " ";

        for (Iterator iterator = songs.getIterator(); iterator.hasNext(); ) {
            String song = (String) iterator.next();
            allSongs = allSongs + song;
        }
        assertEquals(allSongs, "  You Belong With Me  We Don't Talk Anymore  Me  Blank Space ");
    }
}

