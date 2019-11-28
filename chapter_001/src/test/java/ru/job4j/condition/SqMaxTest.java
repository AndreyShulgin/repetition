package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenFirstMax() {
        assertThat(
                SqMax.max(10, 5, 4, 3),
                is(10)
        );
    }

    @Test
    public void whenSecondMax() {
        assertThat(
                SqMax.max(1, 5, 4, 3),
                is(5)
        );
    }

    @Test
    public void whenThirdMax() {
        assertThat(
                SqMax.max(10, 5, 14, 3),
                is(14)
        );
    }

    @Test
    public void whenForthMax() {
        assertThat(
                SqMax.max(10, 5, 4, 30),
                is(30)
        );
    }

    @Test
    public void whenAllMax() {
        assertThat(
                SqMax.max(10, 10, 10, 10),
                is(10)
        );
    }
}