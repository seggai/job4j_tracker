package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 06.06.2020
 */
public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово " + eng;
        return word;
    }
    public static void main(String[] args) {
        DummyDic x = new DummyDic();
        String eng = x.engToRus("house");
        System.out.println(eng);
    }
}
