package com.tw.bootcamp.p2;

import java.util.Objects;

public class Probability {
    private final double probabilityValue;

    private Probability(double decimal) {
        this.probabilityValue = decimal;
    }

    public static Probability createProbability(double probability) throws InvalidProbabilityException {
        if (probability > 1.0) {
            throw new InvalidProbabilityException("Invalid Probability");
        }

        return new Probability(probability);
    }

    public Probability probabilityOfNotGetting() {
        return new Probability(1.0 - this.probabilityValue);
    }

    public Probability atLeastOnce() {
        double notOfProbability = probabilityOfNotGetting().probabilityValue;
        double orProbability = probabilityValue + notOfProbability;
        double andProbability = probabilityValue * notOfProbability;

        return new Probability(orProbability - andProbability);
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability chance)) return false;
        return Double.compare(probabilityValue, chance.probabilityValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probabilityValue);
    }

    @Override
    public String toString() {
        return "Chance is %f".formatted(probabilityValue);
    }

    public Probability deMorgansLaw() {
        return new Probability(probabilityOfNotGetting().probabilityValue * probabilityValue)
                .probabilityOfNotGetting();
    }
}
