package com.tw.bootcamp.p2;

import java.util.List;
import java.util.Objects;

public class Coin <T> {
    private final List<T> possiblilities;

    public Coin(List<T> possiblilities) {
        this.possiblilities = possiblilities;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Coin<?> coin)) return false;
        return Objects.equals(possiblilities, coin.possiblilities);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(possiblilities);
    }

    public double getChance() {
        return (double) 1 / possiblilities.size();
    }
}
