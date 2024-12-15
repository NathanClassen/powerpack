package com.nhclassen.powerpack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    void canHoldQty() {
        Bag testBag = new Bag(27);
        Item testItem = new Item("Chips", 1);
        assertEquals(27, testBag.canHoldQty(testItem));
    }

    @Test
    void addOne_with_enough_capacity() {
        Bag testBag = new Bag(10);
        Item testItem = new Item("Chips", 1);
        assertEquals(9, testBag.addOne(testItem));
    }

    @Test
    void addOne_without_enough_capacity() {
        Bag testBag = new Bag(1);
        Item testItem = new Item("Burrito", 2);
        assertEquals(-1, testBag.addOne(testItem));
    }


}