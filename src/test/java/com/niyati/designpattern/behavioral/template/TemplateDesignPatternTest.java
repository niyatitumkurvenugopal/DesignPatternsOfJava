package com.niyati.designpattern.behavioral.template;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemplateDesignPatternTest {
    @Test
    public void concreteHouseWithFixedFunctions_ShouldBeConstructed() {
        House house = new ConcreteWallHouse();
        assertEquals("Base has been constructed. Roof has been constructed." +
                " Constructing Walls for Concrete Wall House. Constructing Windows for Concrete Wall House." +
                " Constructing Doors for Concrete Wall House. Painting Concrete Wall House." +
                " Decorating Concrete Wall House. ", house.buildHouse());
    }

    @Test
    public void glassHouseWithFixedFunctions_ShouldBeConstructed() {
        House house = new GlassWallHouse();
        assertEquals("Base has been constructed. Roof has been constructed." +
                " Constructing Walls for Glass Wall House. Constructing Windows for Glass Wall House." +
                " Constructing Doors for Glass Wall House. Painting Glass Wall House." +
                " Decorating Glass Wall House. ", house.buildHouse());
    }

}