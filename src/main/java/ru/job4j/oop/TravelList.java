package ru.job4j.oop;

public class TravelList {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle[] park = new Vehicle[]{plane, bus, train};

        for (Vehicle a: park) {
            a.fuel();
            a.move();
        }

    }
}
