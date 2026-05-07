package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProbabilityTest {
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