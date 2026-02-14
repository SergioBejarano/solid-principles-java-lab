package com.example.solid.isp;

public class OfficeWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Working in the office...");
    }

    @Override
    public void eat() {
        System.out.println("Lunch from 12:00 to 13:00");
    }
}
