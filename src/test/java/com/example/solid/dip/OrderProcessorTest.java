package com.example.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderProcessorTest {
    @Test
    void testProcessOrderWithMySQL() {
        Database db = new MySQLDatabase();
        OrderProcessor processor = new OrderProcessor(db);
        assertDoesNotThrow(() -> processor.processOrder("order-789"));
    }

    @Test
    void testProcessOrderWithMongo() {
        Database db = new MongoDatabase();
        OrderProcessor processor = new OrderProcessor(db);
        assertDoesNotThrow(() -> processor.processOrder("order-101"));
    }
}
