package com.example.solid.isp;

public class OfficeWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Trabajando en la oficina...");
    }

    @Override
    public void eat() {
        System.out.println("Almorzando de 12:00 a 13:00");
    }
}
