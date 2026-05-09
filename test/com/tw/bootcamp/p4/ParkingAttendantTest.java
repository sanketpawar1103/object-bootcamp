package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ParkingAttendantTest {
    @Test
    void shouldBeAbleToCreateMultipleParkingLots() {
        Map<Integer, ParkingLot> catalogue = new HashMap<>();
        catalogue.put(0, ParkingLot.createParkingLot(0, 5));
        catalogue.put(1, ParkingLot.createParkingLot(1, 5));

        ParkingAttendant parkingAttendantOne = ParkingAttendant.createParkingAttendant(catalogue);
        assertEquals(5, parkingAttendantOne.park(1));
    }
}