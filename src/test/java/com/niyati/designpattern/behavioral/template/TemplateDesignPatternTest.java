package com.niyati.designpattern.behavioral.template;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemplateDesignPatternTest {
    @Test
    public void a(){
        House house =new ConcreteWallHouse();
        assertEquals("Base has been constructed. Roof has been constructed." +
                " Constructing Walls for Concrete Wall House. Constructing Windows for Concrete Wall House." +
                " Constructing Doors for Concrete Wall House. Painting Concrete Wall House." +
                " Decorating Concrete Wall House. ",house.buildHouse());
    }

}