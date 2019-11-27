package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        double expected = 13.34;
        double out = Point.distance(0, 5, 13, 8);
        Assert.assertEquals(expected, out, 0.01);
    }
}
