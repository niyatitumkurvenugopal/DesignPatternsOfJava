package com.niyati.designpattern.behavioral.template;

public interface House {

    String ROOF_HAS_BEEN_CONSTRUCTED = "Roof has been constructed. ";
    String BASE_HAS_BEEN_CONSTRUCTED = "Base has been constructed. ";

    public default String buildHouse() {
        return constructBase()
                +constructRoof()
                +constructWalls()
                +constructWindows()
                +constructDoors()
                +paintHouse()
                +decorateHouse();
    }

    public String decorateHouse();

    public String paintHouse();

    public String constructDoors();

    public String constructWindows();

    public String constructWalls();

    private String constructRoof() {
        return ROOF_HAS_BEEN_CONSTRUCTED;
    }

    private String constructBase() {
        return BASE_HAS_BEEN_CONSTRUCTED;
    }
}
