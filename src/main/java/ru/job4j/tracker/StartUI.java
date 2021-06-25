package ru.job4j.tracker;


public class StartUI {
    public static void main(String[] args) {
        Tracker voodoo = new Tracker();
        Item one = new Item("Vasya");
        voodoo.add(one);
        System.out.println(one);
    }
}
