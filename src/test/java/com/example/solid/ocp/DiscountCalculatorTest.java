package com.example.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DiscountCalculatorTest {
    @Test
    void testRegularDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        DiscountStrategy strategy = new RegularDiscountStrategy();
        double discount = calculator.calculateDiscount(strategy, 100.0);
        assertEquals(10.0, discount, 0.001);
    }

    @Test
    void testVIPDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        DiscountStrategy strategy = new VIPDiscountStrategy();
        double discount = calculator.calculateDiscount(strategy, 100.0);
        assertEquals(20.0, discount, 0.001);
    }

    @Test
    void testCustomDiscount() {
        DiscountCalculator calculator = new DiscountCalculator();
        DiscountStrategy strategy = price -> price * 0.50; // 50% discount
        double discount = calculator.calculateDiscount(strategy, 100.0);
        assertEquals(50.0, discount, 0.001);
    }
}
