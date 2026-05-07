package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
        double possibility = coin1.chanceOfGetting("Tails");
        Chance chance = new Chance(possibility);

        assertEquals(chance, new Chance(0.5));
    }

    @Test
    void shouldReturnProbabilityOfNotGetting() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfNotGetting("Tails");
        Chance chance = new Chance(possibility);

        assertEquals(chance, new Chance(0.5));
    }

    @Test
    void shouldReturnProbability0() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfNotGetting("Hello");
        Chance chance = new Chance(1.0);
        assertEquals(chance, new Chance(possibility));
    }
    
    @Test
    void shouldReturnProbabilityOfGettingTailForMultipleCoins() {
        List<String> possibilityList = new ArrayList<>(Arrays.asList("Heads", "Tails"));

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfNotGetting("Hello");
        assertEquals(new Chance(1.0), new Chance(possibility));
    }

    @Disabled
    void shouldGiveAChanceOfGetting3WhenADiceIsRolled() {
        List<Integer> possibilityList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ChanceCalculator dice = new ChanceCalculator(possibilityList);
        double possibility = dice.chanceOfGetting(3);

        assertEquals(new Chance(0.166667), new Chance(possibility));
    }
}