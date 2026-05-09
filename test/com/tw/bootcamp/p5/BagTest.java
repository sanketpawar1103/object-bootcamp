package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddTheBallInTheBag() {
        Bag bag = new Bag(12);
        assertTrue(bag.add(Balls.RED));
    }

    @Test
    void shouldRejectTheBallAdditionInToTheBagOnTheCapacityOverflow() {
        Bag bag = new Bag(0);
        assertFalse(bag.add(Balls.RED));
    }

    @Test
    void setLimitToTheGreenColoredBall() {
        Bag bag = new Bag(12);
        bag.add(Balls.GREEN);
        bag.add(Balls.GREEN);
        assertTrue(bag.add(Balls.GREEN));
        assertFalse(bag.add(Balls.GREEN));
    }
}