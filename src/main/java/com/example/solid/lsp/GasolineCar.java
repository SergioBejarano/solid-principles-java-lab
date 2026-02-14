package com.example.solid.lsp;

public class GasolineCar implements Vehicle, Refuelable {
    @Override
    public void drive() {
        System.out.println("Driving gasoline car...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling gasoline...");
    }
}
