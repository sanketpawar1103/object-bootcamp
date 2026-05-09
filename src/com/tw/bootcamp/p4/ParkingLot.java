package com.tw.bootcamp.p4;

public class ParkingLot {
    private final int parkingLotId;
    private int parkingSlots;

    private ParkingLot(int parkingLotId, int totalParkingSlots) {
        this.parkingLotId = parkingLotId;
        this.parkingSlots = totalParkingSlots;
    }

    public static ParkingLot createParkingLot(int parkingId, int totalParkingSlots) {
        return new ParkingLot(parkingId, totalParkingSlots);
    }

    public int park() {
        return parkingSlots--;
    }

    public boolean isFull() {
        return parkingSlots <= 0;
    }
}
