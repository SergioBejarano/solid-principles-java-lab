package com.example.solid.lsp;

public class GasolineCar implements Vehicle, Refuelable {
    @Override
    public void drive() {
        System.out.println("Conduciendo coche de gasolina...");
    }

    @Override
    public void refuel() {
        System.out.println("Repostando gasolina...");
    }
}
