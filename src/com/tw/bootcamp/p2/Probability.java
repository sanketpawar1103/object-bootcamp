package com.tw.bootcamp.p2;

import java.util.Objects;

public class Probability {
    private final double probability;

    private Probability(double decimal) {
        this.probability = decimal;
    }

    public static Probability createProbability(double probability) throws InvalidProbabilityException {
        if (probability > 1.0) {
            throw new InvalidProbabilityException("Invalid Probability");
        }

        return new Probability(probability);
    }

    public Probability probabilityOfNotGetting() {
        return new Probability(1.0 - this.probability);
    }

    public Probability atLeastOnce() {
        double notOfProbability = probabilityOfNotGetting().probability;
        double orProbability = probability + notOfProbability;
        double andProbability = probability * notOfProbability;

        return new Probability(orProbability - andProbability);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Probability chance)) return false;
        return Double.compare(probability, chance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    @Override
    public String toString() {
        return "Chance is %f".formatted(probability);
    }
}
