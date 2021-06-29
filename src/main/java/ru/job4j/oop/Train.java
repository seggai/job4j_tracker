package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Train move on the railroad");
    }

    @Override
    public void fuel() {
        System.out.println("Train fuel price is cheap");
    }
}
