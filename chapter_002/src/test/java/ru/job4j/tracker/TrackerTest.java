package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindByNameItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test1");
        tracker.add(item3);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getName(), is(item.getName()));
        assertThat(result[1].getName(), is(item3.getName()));
        assertThat(result.length, is(2));
    }

    @Test
    public void whenFindByNameItemThenTrackerHasNotItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test1");
        tracker.add(item3);
        Item[] result = tracker.findByName("Not found");
        assertThat(result.length, is(0));
    }

    @Test
    public void whenFindByIdItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item item2 = new Item("test2");
        tracker.add(item2);
        Item item3 = new Item("test1");
        tracker.add(item3);
        Item result = tracker.findById(item.getId());
        Item notFound = tracker.findById("no element");
        assertThat(result.getId(), is(item.getId()));
        Assert.assertNull(notFound);
    }

    @Test
    public void whenFindAllItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findAll()[0], is(item));
        assertThat(tracker.findAll()[1], is(item2));
    }
}