package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void shouldCreateThePossibilities() {
        List <String> possibilityList = new ArrayList<>();
        Coin coin1 = new Coin(possibilityList);
        Coin coin2 = new Coin(possibilityList);

        assertEquals(coin2, coin1);
    }

    @Test
    void shouldReturnTheProbability() {
        List <String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        Coin coin1 = new Coin(possibilityList);
        assertEquals(0.5,coin1.getChance());
    }
}