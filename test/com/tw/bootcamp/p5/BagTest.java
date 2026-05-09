package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddTheBallInTheBag() {
        Bag bag = new Bag(12);
        assertTrue(bag.add());
    }
}