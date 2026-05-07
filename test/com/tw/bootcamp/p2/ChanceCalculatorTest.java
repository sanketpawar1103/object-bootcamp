package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceCalculatorTest {
    @Test
    void shouldCreateThePossibilities() {
        List<String> possibilityList = new ArrayList<>();
        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        ChanceCalculator coin2 = new ChanceCalculator(possibilityList);

        assertEquals(coin2, coin1);
    }

    @Test
    void shouldReturnTheProbability() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        assertEquals(0.5, coin1.chanceOfGetting("Tails"));
    }

    @Test
    void shouldReturnProbabilityOfNotGetting() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        assertEquals(0.5, coin1.chanceOfNotGetting("Tails"));
    }

    @Test
    void shouldReturnProbability0() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        assertEquals(1.0, coin1.chanceOfNotGetting("Hello"));
    }
}