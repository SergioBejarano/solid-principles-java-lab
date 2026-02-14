package com.example.solid.lsp;

public class HybridCar implements Vehicle, Refuelable, Rechargeable {
    @Override
    public void drive() {
        System.out.println("Conduciendo coche híbrido...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }

    @Override
    public void recharge() {
        System.out.println("Recargando batería...");
    }
}
