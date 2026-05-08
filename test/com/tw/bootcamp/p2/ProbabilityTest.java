package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
    @Test
    void shouldReturnProbabilityOfNotGetting() throws InvalidProbabilityException {
        Probability chanceOfNotGetting = Probability.createProbability(0.5).not();
        assertEquals(chanceOfNotGetting, Probability.createProbability(0.5));
    }

    @Test
    void shouldReturnProbability0() throws InvalidProbabilityException {

        Probability chanceOfGettingNonExistingValue = Probability.createProbability(1.0);
        assertEquals(chanceOfGettingNonExistingValue, Probability.createProbability(0.0).not());
    }

    @Test
    void shouldReturnProbabilityOfGettingTailForMultipleCoins() throws InvalidProbabilityException {
        assertEquals(Probability.createProbability(0.5), Probability.createProbability(0.5).not());
    }

    @Test
    void should() throws InvalidProbabilityException {
        assertEquals(Probability.createProbability(0.166667), Probability.createProbability(0.166667));
    }

    @Test
    void shouldThrowExceptionWhenTriesToCreateInvalidProbability() {
        assertThrows(InvalidProbabilityException.class, () -> Probability.createProbability(1.9));
    }

    @Test
    void shouldReturnTheDeMorgansLow() throws InvalidProbabilityException {
        Probability probability = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.75), probability.deMorgansLaw());
    }

    @Test
    void shouldReturnTheProbabilityOfGettingAtLeastOne() throws InvalidProbabilityException {
        Probability probability = Probability.createProbability(0.5);
        assertEquals(Probability.createProbability(0.75), probability.atLeastOnce());
    }
}