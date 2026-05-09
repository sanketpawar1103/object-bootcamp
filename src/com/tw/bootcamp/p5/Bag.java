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
        Integer noOfBalls = ballsInventory.getOrDefault(ball, 0);

        if (ball.isOverflow(noOfBalls) || noOfBallsInTheBag >= capacity) {
            return false;
        }

        ballsInventory.put(ball, noOfBalls + 1);
        noOfBallsInTheBag++;

        return true;
    }
}
