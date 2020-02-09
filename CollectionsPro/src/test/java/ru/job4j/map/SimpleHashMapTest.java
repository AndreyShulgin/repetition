package ru.job4j.map;

import org.junit.Before;
import org.junit.Test;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SimpleHashMapTest {
    SimpleHashMap<String, Integer> simpleHashMap = new SimpleHashMap<>(10);

    @Before
    public void createHashMap() {
        simpleHashMap.insert("Andrey", 28);
        simpleHashMap.insert("Petr", 30);
        simpleHashMap.insert("Anna", 18);
    }

    @Test
    public void delete() {
        simpleHashMap.delete("Petr");
        simpleHashMap.get("Petr");
        assertNull(simpleHashMap.get("Petr"));
    }

    @Test (expected = ConcurrentModificationException.class)
    public void iteratorException() {
        Iterator<String> it = simpleHashMap.iterator();
        simpleHashMap.delete("Petr");
        it.next();
    }

    @Test
    public void iterator() {
        Iterator<String> it = simpleHashMap.iterator();
        assertThat(it.next(), is("Petr"));
        assertThat(it.next(), is("Andrey"));
        assertThat(it.next(), is("Anna"));
        assertThat(it.hasNext(), is(false));

    }
}