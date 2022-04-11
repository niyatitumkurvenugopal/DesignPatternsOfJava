package com.niyati.designpattern.behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemplateDesignPatternTest {
    @Test
    void concreteHouseWithFixedFunctions_ShouldBeConstructed() {
        House concreteHouse = new ConcreteWallHouse();
        assertEquals("Base has been constructed. Roof has been constructed." +
                " Constructing Walls for Concrete Wall House. Constructing Windows for Concrete Wall House." +
                " Constructing Doors for Concrete Wall House. Painting Concrete Wall House." +
                " Decorating Concrete Wall House. ", concreteHouse.buildHouse());

        House glassHouse = new GlassWallHouse();
        assertEquals("Base has been constructed. Roof has been constructed." +
                " Constructing Walls for Glass Wall House. Constructing Windows for Glass Wall House." +
                " Constructing Doors for Glass Wall House. Painting Glass Wall House." +
                " Decorating Glass Wall House. ", glassHouse.buildHouse());
    }

}