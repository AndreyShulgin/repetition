package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void add() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        int expect = 30;
        assertThat(result, is(expect));
    }
}