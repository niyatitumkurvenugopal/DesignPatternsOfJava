package com.niyati.designpattern.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MementoDesignPatternTest {
    @Test
    void testMementoPattern() {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setArticle("State 1");
        careTaker.add(originator.saveToMemento());
        assertEquals("State 1", originator.getArticle());

        originator.setArticle("State 2");
        careTaker.add(originator.saveToMemento());
        assertEquals("State 2", originator.getArticle());

        originator.restoreFromMemento(careTaker.undo());
        assertEquals("State 1", originator.getArticle());

        originator.restoreFromMemento(careTaker.redo());
        assertEquals("State 2", originator.getArticle());

        originator.setArticle("State 3");
        careTaker.add(originator.saveToMemento());

        originator.setArticle("State 4");
        careTaker.add(originator.saveToMemento());

        originator.setArticle("State 5");
        careTaker.add(originator.saveToMemento());

        originator.restoreFromMemento(careTaker.undo());
        originator.restoreFromMemento(careTaker.undo());
        assertEquals("State 3", originator.getArticle());






    }

}