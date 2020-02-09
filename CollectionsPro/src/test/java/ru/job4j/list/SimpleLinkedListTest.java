package ru.job4j.list;

import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SimpleLinkedListTest {

    @Test
    public void whenAddElementThenTrue() {
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();

        simpleLinkedList.add("Hi");
        simpleLinkedList.add("Hello");

        assertThat(simpleLinkedList.get(0), is("Hello"));
        assertThat(simpleLinkedList.get(1), is("Hi"));
    }

    @Test
    public void whenHasNextThenTrue() {
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();

        simpleLinkedList.add("Hi");
        simpleLinkedList.add("Hello");
        Iterator<String> it = simpleLinkedList.iterator();
        it.next();
        it.next();

        assertThat(it.hasNext(), is(false));
    }

    @Test (expected = ConcurrentModificationException.class)
    public void whenChangeListThen() {
        SimpleLinkedList<String> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add("Hi");
        Iterator<String> it = simpleLinkedList.iterator();
        simpleLinkedList.add("Hello");
        boolean rst = it.hasNext();
    }
}