package ru.job4j.list;

import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleListTest {

    @Test
    public void whenCreateArrayStringType() {
        SimpleList<String> simpleList = new SimpleList<>(2);

        simpleList.add("Hello");

        assertThat(simpleList.get(0), is("Hello"));
    }

    @Test (expected = ConcurrentModificationException.class)
    public void whenChangeArrayLengthThenCME() {
        SimpleList<String> simpleList = new SimpleList<>(2);

        simpleList.add("Hello");
        simpleList.add("Hi");

        Iterator<String> it = simpleList.iterator();
        assertThat(it.hasNext(), is(true));

        simpleList.add("new Size");
        it.next();
    }

    @Test
    public void whenAddNewObjectThenArraysLengthChange() {
        SimpleList<String> simpleList = new SimpleList<>(2);

        simpleList.add("Hello");
        simpleList.add("Hi");
        simpleList.add("new Size");
        Iterator<String> it = simpleList.iterator();
        it.next();
        it.next();

        assertThat(it.next(), is("new Size"));
    }

}