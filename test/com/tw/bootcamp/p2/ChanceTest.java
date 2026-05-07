package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void createsTheChanceInstance() {
        Chance chance1 = new Chance(0.5);
        Chance chance2 = new Chance(0.5);

        assertEquals(chance1, chance2);
    }
}