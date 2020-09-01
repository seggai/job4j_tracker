package ru.job4j.oop;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxOfNumberTest {
    @Test
    public void testMax() {
        int x = 1;
        int y = 2;
        MaxOfNumber max = new MaxOfNumber();
        int rsl = max.max(x, y);
        assertEquals(rsl, 2);
    }

    @Test
    public void testTestMax() {
        int x = 1;
        int y = 2;
        int z = 3;
        MaxOfNumber max = new MaxOfNumber();
        int rsl = max.max(x, y, z);
        assertEquals(rsl, 3);
    }

    @Test
    public void testTestMax1() {
        int x = 1;
        int y = 2;
        int z = 3;
        int w = 4;
        MaxOfNumber max = new MaxOfNumber();
        int rsl = max.max(x, y, z, w);
        assertEquals(rsl, 4);
    }
}