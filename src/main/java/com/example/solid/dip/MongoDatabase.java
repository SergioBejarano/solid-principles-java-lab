package com.example.solid.dip;

public class MongoDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Conectando a MongoDB...");
    }

    @Override
    public void saveOrder(String order) {
        System.out.println("Guardando pedido en MongoDB (NoSQL): " + order);
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de MongoDB...");
    }
}
