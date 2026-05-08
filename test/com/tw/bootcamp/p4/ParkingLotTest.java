package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    void shouldParkACar() {
        ParkingLot garage = ParkingLot.createParkingLot(4);
        int slotId = garage.parkCar();

        assertEquals(4, slotId);
    }

    @Test
    void shouldReturnParkingLotAvailability() {
        ParkingLot emptyGarage = ParkingLot.createParkingLot(0);
        assertTrue(emptyGarage.isFull());
    }

    @Test
    void shouldReturnThatLotsAreAvailable() {
        ParkingLot emptyGarage = ParkingLot.createParkingLot(1);
        assertFalse(emptyGarage.isFull());
        Car car = new Car(1);
    }
}