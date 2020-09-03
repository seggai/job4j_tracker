package ru.job4j.oop;

/**
 * @author Yuri.Argunov
 * @version 1.0
 * @since 01.09.2020
 */
public class MaxOfNumber {
    public int max(int x, int y) {
        boolean dif = x < y;
        int result = dif ? y : x;
        return result;
    }

    public int max(int x, int y, int z) {
        return max(z, max(x, y));
    }

    public int max(int x, int y, int z, int w) {
        return max(max(x, y), max(z, w));
    }
}
