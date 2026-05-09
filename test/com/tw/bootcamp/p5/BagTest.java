package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {
    @Test
    void shouldAddTheBallInTheBag() {
        Bag bag = new Bag(12);
        assertTrue(bag.add(Color.YELLOW));
    }

    @Test
    void shouldRejectTheBallAdditionInToTheBagOnTheCapacityOverflow() {
        Bag bag = new Bag(0);
        assertFalse(bag.add(Color.RED));
    }

    @Test
    void setLimitToTheGreenColoredBall() {
        Bag bag = new Bag(12);
        bag.add(Color.GREEN);
        bag.add(Color.GREEN);
        assertTrue(bag.add(Color.GREEN));
        assertFalse(bag.add(Color.GREEN));
    }

    @Test
    void shouldSetTheMaxLimitForRedAsPerTheGreenCount() {
        Bag bag = new Bag(12);
        assertFalse(bag.add(Color.RED));
    }
}