package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        Fact fact = new Fact();
        fact.calc(-3);
    }

    @Test
    public void calc2() {
        Fact fact = new Fact();
        int result = fact.calc(5);
        assertThat(result, is(120));
    }

}