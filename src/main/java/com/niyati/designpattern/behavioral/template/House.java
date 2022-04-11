package com.niyati.designpattern.behavioral.template;

public abstract class House {
    public final String buildHouse() {
    return constructBase()
            +constructRoof()
            +constructWalls()
            +constructWindows()
            +constructDoors()
            +paintHouse()
            +decorateHouse();
    }

    public abstract String decorateHouse();

    public abstract String paintHouse();

    public abstract String constructDoors();

    public abstract String constructWindows();

    public abstract String constructWalls();

    private final String constructRoof() {
        return "Roof has been constructed. ";
    }

    private final String constructBase() {
        return "Base has been constructed. ";
    }

}
