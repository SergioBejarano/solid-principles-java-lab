package com.example.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MongoDatabaseTest {
    @Test
    void testConnect() {
        MongoDatabase db = new MongoDatabase();
        assertDoesNotThrow(db::connect);
    }

    @Test
    void testSaveOrder() {
        MongoDatabase db = new MongoDatabase();
        assertDoesNotThrow(() -> db.saveOrder("order-456"));
    }

    @Test
    void testDisconnect() {
        MongoDatabase db = new MongoDatabase();
        assertDoesNotThrow(db::disconnect);
    }
}
