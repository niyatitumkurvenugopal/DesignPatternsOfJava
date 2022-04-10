package com.niyati.designpattern.behavioral.template;

public class GlassWalHouse extends House {
    @Override
    public String decorateHouse() {
        return "Decorating Glass Wall House. ";
    }

    @Override
    public String paintHouse() {
        return "Painting Glass Wall House. ";
    }

    @Override
    public String constructDoors() {
        return "Constructing Doors for Glass Wall House. ";
    }

    @Override
    public String constructWindows() {
        return "Constructing Windows for Glass Wall House. ";
    }

    @Override
    public String constructWalls() {
        return "Constructing Walls for Glass Wall House. ";
    }
}
