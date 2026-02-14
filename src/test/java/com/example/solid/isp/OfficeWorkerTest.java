package com.example.solid.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OfficeWorkerTest {
    @Test
    void testWork() {
        OfficeWorker worker = new OfficeWorker();
        assertDoesNotThrow(worker::work);
    }

    @Test
    void testEat() {
        OfficeWorker worker = new OfficeWorker();
        assertDoesNotThrow(worker::eat);
    }
}
