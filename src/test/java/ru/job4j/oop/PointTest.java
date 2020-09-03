package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {
    @Test
    public void testDistance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 1, 3);
        double result = a.distance3d(b);
        assertThat(result, closeTo(3,74));
    }
}