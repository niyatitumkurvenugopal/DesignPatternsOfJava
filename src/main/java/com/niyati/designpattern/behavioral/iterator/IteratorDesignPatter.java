package com.niyati.designpattern.behavioral.iterator;

public class IteratorDesignPatter {
    public static void main(String[] args) {
        Songs songs = new Songs();

        for (Iterator iterator = songs.getIterator(); iterator.hasNext(); ) {
            String song = (String) iterator.next();
            System.out.println("Song : " + song);
        }
    }
}
