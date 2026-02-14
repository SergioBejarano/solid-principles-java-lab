package com.example.solid.dip;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL...");
    }

    @Override
    public void saveOrder(String order) {
        System.out.println("Saving order in MySQL: " + order);
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL...");
    }
}