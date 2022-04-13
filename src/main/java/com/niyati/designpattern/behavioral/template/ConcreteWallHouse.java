package com.niyati.designpattern.behavioral.template;

public class ConcreteWallHouse implements House {
    @Override
    public String decorateHouse() {
        return "Decorating Concrete Wall House. ";
    }

    @Override
    public String paintHouse() {
        return "Painting Concrete Wall House. ";
    }

    @Override
    public String constructDoors() {
        return "Constructing Doors for Concrete Wall House. ";
    }

    @Override
    public String constructWindows() {
        return "Constructing Windows for Concrete Wall House. ";
    }

    @Override
    public String constructWalls() {
        return "Constructing Walls for Concrete Wall House. ";
    }
}
