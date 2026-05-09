package com.tw.bootcamp.p4;

import java.util.Map;

public class ParkingAttendant {
    protected final Map<Integer, ParkingLot> parkingCatalogue;

    public ParkingAttendant(Map<Integer, ParkingLot> parkingCatalogue) {
        this.parkingCatalogue = parkingCatalogue;
    }

    public static ParkingAttendant createParkingAttendant(Map<Integer, ParkingLot> parkingCatalogue) {
        return new ParkingAttendant(parkingCatalogue);
    }

    public int park(int parkingLotId) {
        ParkingLot parkingLot = parkingCatalogue.get(parkingLotId);
        return parkingLot.park();
    }
}
