package com.example.solid.dip;

public class OrderProcessor {

    private Database database;

    public OrderProcessor(Database database) {
        this.database = database;
    }

    public void processOrder(String orderId) {
        System.out.println("Processing order: " + orderId);
        database.connect();
        database.saveOrder(orderId);
        database.disconnect();
        System.out.println("Order processed successfully\n");
    }
}
