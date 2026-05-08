package com.tw.bootcamp.p2;

import java.util.Objects;

public class Probability {
    private final double probabilityValue;

    private Probability(double decimal) {
        this.probabilityValue = decimal;
    }

    public static Probability createProbability(double probability) throws InvalidProbabilityException {
        if (probability > 1.0 || probability < 0.0) {
            throw new InvalidProbabilityException("Invalid Probability");
        }

        return new Probability(probability);
    }

    public Probability not() {
        return new Probability(1.0 - this.probabilityValue);
    }

    private Probability or(Probability notOfProbability) {
        return new Probability(probabilityValue + notOfProbability.probabilityValue);
    }

    private Probability and(Probability notOfProbability) {
        return new Probability(probabilityValue * notOfProbability.probabilityValue);
    }

    public Probability atLeastOnce() {
        double orProbability = or(not()).probabilityValue;
        double andProbability = and(not()).probabilityValue;

        return new Probability(orProbability - andProbability);
    }

    public Probability deMorgansLaw() {
        return and(not()).not();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability chance)) return false;
        return probabilityValue - chance.probabilityValue <= 0.01;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probabilityValue);
    }

    @Override
    public String toString() {
        return "Chance is %f".formatted(probabilityValue);
    }
}
