package com.niyati.designpattern.behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyDesignPatternTest {
    @Test
    void testStrategyPattern() {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 100);
        Item item2 = new Item("5678", 50);

        cart.addItem(item1);
        cart.addItem(item2);

        assertEquals(147.75, cart.pay(new DebitCard()));
        assertEquals(145.5, cart.pay(new CreditCard()));
        assertEquals(150, cart.calculateTotal());

    }

}