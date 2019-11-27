package ru.job4j.calculator;


import org.junit.Test;
import org.junit.Assert;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 185;
        double expected = 97.75;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        double in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
