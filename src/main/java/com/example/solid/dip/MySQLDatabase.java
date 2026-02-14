package com.example.solid.dip;

public class MySQLDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Conectando a MySQL...");
    }

    @Override
    public void saveOrder(String order) {
        System.out.println("Guardando pedido en MySQL: " + order);
    }

    @Override
    public void disconnect() {
        System.out.println("Desconectando de MySQL...");
    }
}