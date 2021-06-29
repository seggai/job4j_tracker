package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus moves on the road");

    }

    @Override
    public void fuel() {
        System.out.println("Bus fuel price is average");
    }
}
