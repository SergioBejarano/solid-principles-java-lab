package com.example.solid.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
    @Test
    void testWork() {
        Developer dev = new Developer();
        assertDoesNotThrow(dev::work);
    }
}
