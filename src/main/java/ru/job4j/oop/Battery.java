package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 26.08.2020
 */
public class Battery {
    private int load;

    public Battery(int energy) {
        this.load = energy;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchange(second);
        System.out.println("first : " + first.load + ". second : " + second.load);

    }
}
