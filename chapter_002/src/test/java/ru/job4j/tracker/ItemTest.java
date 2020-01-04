package ru.job4j.tracker;

import org.junit.Test;

import java.util.Collections;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareToReverse() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("Masha");
        Item item1 = new Item("Sasha");
        Item item2 = new Item("Andrey");
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        tracker.findAll().sort(Collections.reverseOrder());
        assertThat(tracker.findAll().get(0), is(item1));
        assertThat(tracker.findAll().get(1), is(item0));
        assertThat(tracker.findAll().get(2), is(item2));
    }

    @Test
    public void compareTo() {
        Tracker tracker = new Tracker();
        Item item0 = new Item("Masha");
        Item item1 = new Item("Sasha");
        Item item2 = new Item("Andrey");
        tracker.add(item0);
        tracker.add(item1);
        tracker.add(item2);
        Collections.sort(tracker.findAll());
        assertThat(tracker.findAll().get(0), is(item2));
        assertThat(tracker.findAll().get(1), is(item0));
        assertThat(tracker.findAll().get(2), is(item1));
    }
}