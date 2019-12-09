package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        double expected = 5.83;
        Point pointFirst = new Point(0, 0);
        Point pointSecond = new Point(5, 3);
        double out = pointFirst.distance(pointSecond);
        Assert.assertEquals(expected, out, 0.01);
    }
}
