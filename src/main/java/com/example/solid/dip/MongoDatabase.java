package com.example.solid.dip;

public class MongoDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB...");
    }

    @Override
    public void saveOrder(String order) {
        System.out.println("Saving order in MongoDB (NoSQL): " + order);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB...");
    }
}
