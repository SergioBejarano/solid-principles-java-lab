package com.example.solid.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricCarTest {
    @Test
    void testDrive() {
        ElectricCar car = new ElectricCar();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void testRecharge() {
        ElectricCar car = new ElectricCar();
        assertDoesNotThrow(car::recharge);
    }
}
