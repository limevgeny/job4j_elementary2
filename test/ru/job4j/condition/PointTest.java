package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when02To00Then2() {
        int expected = 2;
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when26To36Then5() {
        int expected = 5;
        int x1 = 2;
        int x2 = 6;
        int y1 = 3;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To03Then3() {
        int expected = 3;
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when28To19Then10() {
        int expected = 10;
        int x1 = 2;
        int x2 = 8;
        int y1 = 1;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}