package com.example.solid.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasolineCarTest {
    @Test
    void testDrive() {
        GasolineCar car = new GasolineCar();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void testRefuel() {
        GasolineCar car = new GasolineCar();
        assertDoesNotThrow(car::refuel);
    }
}
