package com.tw.bootcamp.p5;

import java.util.HashMap;

public class Bag {
    private final int capacity;
    private final HashMap<Color, Integer> ballsInventory;
    private int noOfBallsInTheBag;

    public Bag(int capacity) {
        this.ballsInventory = new HashMap<>();
        this.capacity = capacity;
        this.noOfBallsInTheBag = 0;
    }

    public boolean add(Color color) {
        Integer noOfBalls = ballsInventory.getOrDefault(color,0);
        Integer greenCount = ballsInventory.getOrDefault(Color.GREEN, 0);

        if ( isGreenOverFlow(color, greenCount) || (noOfBallsInTheBag >= capacity)) return false;

        if(isRedOverFlow(color, noOfBalls, greenCount)) return false;

        ballsInventory.put(color, noOfBalls + 1);
        noOfBallsInTheBag++;

        return true;
    }

    private static boolean isRedOverFlow(Color color, Integer noOfBalls, Integer greenCount) {
        return color == Color.RED && noOfBalls >= greenCount * 2;
    }

    private static boolean isGreenOverFlow(Color color, Integer greenCount) {
        return (color == Color.GREEN) && (greenCount >= 3);
    }
}
