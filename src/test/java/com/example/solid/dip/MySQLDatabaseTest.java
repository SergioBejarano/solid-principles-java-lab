package com.example.solid.dip;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySQLDatabaseTest {
    @Test
    void testConnect() {
        MySQLDatabase db = new MySQLDatabase();
        assertDoesNotThrow(db::connect);
    }

    @Test
    void testSaveOrder() {
        MySQLDatabase db = new MySQLDatabase();
        assertDoesNotThrow(() -> db.saveOrder("order-123"));
    }

    @Test
    void testDisconnect() {
        MySQLDatabase db = new MySQLDatabase();
        assertDoesNotThrow(db::disconnect);
    }
}
