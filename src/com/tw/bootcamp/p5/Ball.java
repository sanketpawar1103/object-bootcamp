package com.tw.bootcamp.p5;

import java.util.Objects;

public class Ball {
    private final Color color;
    private int noOfBalls;
    private int limit;

    public Ball(Color color, int limit) {
        this.color = color;
        this.noOfBalls = 0;
        this.limit = limit;
    }

    public boolean isOverflow() {
        return noOfBalls >= limit;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Ball ball1)) return false;
        return color == ball1.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    public void increaseBallCount() {
        noOfBalls++;
    }

    public void setLimit(Ball greenBall) {
        this.limit = greenBall.noOfBalls * 2;
    }
}
