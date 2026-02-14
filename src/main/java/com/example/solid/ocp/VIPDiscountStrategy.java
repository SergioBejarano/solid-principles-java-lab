package com.example.solid.ocp;

public class VIPDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.20;
    }
}