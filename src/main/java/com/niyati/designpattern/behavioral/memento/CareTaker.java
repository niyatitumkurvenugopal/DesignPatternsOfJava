package com.niyati.designpattern.behavioral.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CareTaker {
    private static final Logger logger = LoggerFactory.getLogger(CareTaker.class);

    private final ArrayList<Memento> history;
    private int currState = -1;

    public CareTaker() {
        this.history = new ArrayList<>();
    }

    public void add(Memento state) {
        this.history.add(state);
        currState = this.history.size() - 1;
    }

    public Memento get(int index) {
        return history.get(index);
    }

    public Memento undo() {
        logger.info("Undoing State...");
        if (currState <= 0) {
            currState = 0;
            return get(0);
        }
        currState--;
        return get(currState);
    }

    public Memento redo() {
        logger.info("Redoing State...");
        if (currState >= history.size() - 1) {
            currState = history.size() - 1;
            return get(currState);
        }
        currState++;
        return get(currState);
    }
}
