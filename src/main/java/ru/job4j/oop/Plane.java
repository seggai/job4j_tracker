package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Plane is flies across the sky");
    }

    @Override
    public void fuel() {
        System.out.println("Plane fuel is very expansive");
    }
}
