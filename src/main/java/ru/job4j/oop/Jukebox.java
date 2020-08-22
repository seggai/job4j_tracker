package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 06.06.2020
 */
public class Jukebox {
    public void music(int position) {
        if(position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if(position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox best = new Jukebox();
        int pos1 = 1;
        best.music(pos1);
        pos1 = 2;
        best.music(pos1);
        pos1 = 3;
        best.music(pos1);
    }
}
