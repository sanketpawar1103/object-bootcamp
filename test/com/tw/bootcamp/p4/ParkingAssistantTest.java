package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ParkingAssistantTest {
    @Test
    void shouldMonitorTheParkingLot() {
        Map<Integer, ParkingLot> catalogue = new HashMap<>();
        catalogue.put(0, ParkingLot.createParkingLot(0, 5));
        catalogue.put(1, ParkingLot.createParkingLot(1, 5));
        ParkingAttendant parkingAttendant = ParkingAttendant.createParkingAttendant(catalogue);

        ParkingAssistant parkingAssistant = new ParkingAssistant(parkingAttendant);
        assertEquals(5, parkingAssistant.park(0));
    }
}