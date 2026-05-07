package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChanceCalculatorTest {
    @Test
    void shouldCreateThePossibilities() throws InvalidProbabilityException {
        List<String> possibilityList = new ArrayList<>();
        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        ChanceCalculator coin2 = new ChanceCalculator(possibilityList);

        assertEquals(coin2, coin1);
    }

    @Test
    void shouldReturnTheProbability() throws InvalidProbabilityException {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Tails");

        Probability chance = Probability.createProbability(possibility);
        assertEquals(chance, Probability.createProbability(0.5));

    }

    @Test
    void shouldReturnProbabilityOfNotGetting() throws InvalidProbabilityException {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Tails");

        Probability chance = Probability.createProbability(possibility).not();
        assertEquals(chance, Probability.createProbability(0.5));
    }

    @Test
    void shouldReturnProbability0() throws InvalidProbabilityException {
        List<String> possibilityList = new ArrayList<>();
        possibilityList.add("Heads");
        possibilityList.add("Tails");

        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Hello");

        Probability chance = Probability.createProbability(1.0);
        assertEquals(chance, Probability.createProbability(possibility).not());
    }

    @Test
    void shouldReturnProbabilityOfGettingTailForMultipleCoins() throws InvalidProbabilityException {
        List<String> possibilityList = new ArrayList<>(Arrays.asList("Heads", "Tails", "Heads", "Tails"));
        ChanceCalculator coin1 = new ChanceCalculator(possibilityList);
        double possibility = coin1.chanceOfGetting("Hello");

        assertEquals(Probability.createProbability(1.0), Probability.createProbability(possibility).not());
    }

    @Test
    void shouldGiveAChanceOfGetting3WhenADiceIsRolled() throws InvalidProbabilityException {
        List<Integer> possibilityList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        ChanceCalculator dice = new ChanceCalculator(possibilityList);
        double possibility = dice.chanceOfGetting(3);

        assertEquals(Probability.createProbability(0.166667), Probability.createProbability(possibility));
    }
}