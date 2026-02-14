package com.example.solid.lsp;

public class HybridCar implements Vehicle, Refuelable, Rechargeable {
    @Override
    public void drive() {
        System.out.println("Driving hybrid car...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling gasoline...");
    }

    @Override
    public void recharge() {
        System.out.println("Recharging battery...");
    }
}
