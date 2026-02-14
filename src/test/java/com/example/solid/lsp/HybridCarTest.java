package com.example.solid.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HybridCarTest {
    @Test
    void testDrive() {
        HybridCar car = new HybridCar();
        assertDoesNotThrow(car::drive);
    }

    @Test
    void testRefuel() {
        HybridCar car = new HybridCar();
        assertDoesNotThrow(car::refuel);
    }

    @Test
    void testRecharge() {
        HybridCar car = new HybridCar();
        assertDoesNotThrow(car::recharge);
    }
}
