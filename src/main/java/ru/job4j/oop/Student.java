package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 06.06.2020
 */
public class Student {
    public void music() {
        System.out.println("Tra ta ta");
    }
    public void song() {
        System.out.println("I believe i can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
