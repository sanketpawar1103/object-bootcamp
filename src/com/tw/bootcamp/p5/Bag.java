package com.tw.bootcamp.p5;

import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final HashMap<Balls, Integer> ballsInventory;
    private int noOfBallsInTheBag;

    public Bag(int capacity) {
        this.ballsInventory = new HashMap<>();
        this.capacity = capacity;
        this.noOfBallsInTheBag = 0;
    }

    public boolean add(Balls ball) {
        if (noOfBallsInTheBag >= capacity) {
            return false;
        }

        ballsInventory.put(ball, ballsInventory.getOrDefault(ball, 0) + 1);
        noOfBallsInTheBag++;
        return true;
    }
}
