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
        return "Chance is %f".formatted(probability) ;
    }
}
