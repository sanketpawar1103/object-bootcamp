package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldParkACar() {
        ParkingLot garage = ParkingLot.createParkingLot(0, 5);
        int slotId = garage.park();

        assertEquals(5, slotId);
    }

    @Test
    void shouldReturnParkingLotAvailability() {
        ParkingLot emptyGarage = ParkingLot.createParkingLot(0, 0);
        assertTrue(emptyGarage.isFull());
    }

    @Test
    void shouldReturnThatLotsAreAvailable() {
        ParkingLot emptyGarage = ParkingLot.createParkingLot(1, 5);
        assertFalse(emptyGarage.isFull());
    }
}