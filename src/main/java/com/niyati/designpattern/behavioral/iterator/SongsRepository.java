package com.niyati.designpattern.behavioral.iterator;

public class SongsRepository implements Container {

    String [] songs = {" You Belong With Me ", " We Don't Talk Anymore ", " Me ", " Blank Space "};

    @Override
    public Iterator getIterator() {
        return new SongIterator();

    }

    private class SongIterator implements Iterator {

        int index;

        @Override
        public boolean hasNext() {

            return index < songs.length;
        }

        @Override
        public Object next() {

            if (this.hasNext()) {
                return songs[index++];
            }
            return null;
        }
    }

}
