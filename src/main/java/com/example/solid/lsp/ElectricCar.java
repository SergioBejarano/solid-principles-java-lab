package com.example.solid.lsp;

class ElectricCar implements Vehicle, Rechargeable {
    @Override
    public void drive() {
        System.out.println("Driving electric car...");
    }

    @Override
    public void recharge() {
        System.out.println("Recharging battery...");
    }
}