package com.tw.bootcamp.p4;

public class ParkingLot {
    private int garage;

    private ParkingLot(int totalParkingSlots) {
        this.garage = totalParkingSlots;
    }

    public static ParkingLot createParkingLot(int totalParkingSlots) {
        return new ParkingLot(totalParkingSlots);
    }
    
    public int parkCar() {
        return garage--;
    }

    public boolean isFull() {
        return garage <= 0;
    }
}
