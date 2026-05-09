package com.tw.bootcamp.p5;

public class Bag {
    private final int capacity;
    private int noOfBallsInTheBag;

    public Bag(int capacity) {
        this.capacity = capacity;
        this.noOfBallsInTheBag = 0;
    }

    public boolean add() {
        if (noOfBallsInTheBag >= capacity) {
            return false;
        }

        noOfBallsInTheBag++;
        return true;
    }
}
