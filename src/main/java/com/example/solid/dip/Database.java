package com.example.solid.dip;

public interface Database {
    void saveOrder(String order);

    void connect();

    void disconnect();
}
