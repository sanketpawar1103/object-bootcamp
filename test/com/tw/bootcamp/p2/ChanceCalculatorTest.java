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

        try {
            Probability chance = Probability.createProbability(possibility);
            assertEquals(chance, Probability.createProbability(0.5));
        } catch (InvalidProbabilityException e) {
            assertEquals("Invalid Probability", e.getMessage());
        }
    }

    @Test
    void shouldReturnProbabilityOfNotGetting() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Tails");
        try {
            Probability chance = Probability.createProbability(possibility).probabilityOfNotGetting();
            assertEquals(chance, Probability.createProbability(0.5));
        } catch (InvalidProbabilityException e) {
            assertEquals("Invalid Probability", e.getMessage());
        }
    }

    @Test
    void shouldReturnProbability0() {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Hello");
        try {
            Probability chance = Probability.createProbability(1.0);
            assertEquals(chance, Probability.createProbability(possibility).probabilityOfNotGetting());
        } catch (InvalidProbabilityException e) {
            assertEquals("Invalid Probability", e.getMessage());
        }
    }

    @Test
    void shouldReturnProbabilityOfGettingTailForMultipleCoins() {
        List<String> possibilityList = new ArrayList<>(Arrays.asList("Heads", "Tails", "Heads", "Tails"));

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Hello");
        try {
            assertEquals(Probability.createProbability(1.0), Probability.createProbability(possibility).probabilityOfNotGetting());
        } catch (InvalidProbabilityException e) {
            assertEquals("Invalid Probability", e.getMessage());

        }
    }

    @Test
    void shouldGiveAChanceOfGetting3WhenADiceIsRolled() {
        List<Integer> possibilityList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ChanceCalculator dice = new ChanceCalculator(possibilityList);
        double possibility = dice.chanceOfGetting(3);
        try {
            assertEquals(Probability.createProbability(0.166667), Probability.createProbability(possibility));
        } catch (InvalidProbabilityException e) {
            assertEquals("Invalid Probability", e.getMessage());

        }
    }
}