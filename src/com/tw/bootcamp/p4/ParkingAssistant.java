package com.tw.bootcamp.p4;

import java.util.List;

public class ParkingAssistant {

    private final ParkingAttendant parkingAttendant;

    public ParkingAssistant(ParkingAttendant parkingAttendant) {
        this.parkingAttendant = parkingAttendant;
    }


    public int park(int parkingLotId) {
        return parkingAttendant.park(parkingLotId);
    }
}
