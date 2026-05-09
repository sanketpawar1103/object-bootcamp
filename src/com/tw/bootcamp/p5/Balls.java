package com.tw.bootcamp.p5;

public enum Balls {
    BLUE(12),
    GREEN(3),
    RED(12),
    YELLOW(12);

    private final int limit;

    Balls(int limit) {
        this.limit = limit;
    }

    public boolean isOverflow(Integer noOfBalls) {
        return noOfBalls >= limit;
    }
}
