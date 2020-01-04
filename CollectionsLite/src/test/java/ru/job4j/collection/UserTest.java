package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareDescByName() {
        Comparator<User> comparator = new UserDescByName();
        int rsl = comparator.compare(new User("Andrey", 28), new User("Petr", 32));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareSortByName() {
        Comparator<User> comparator = new UserSortByName();
        int rsl = comparator.compare(new User("Andrey", 28), new User("Petr", 32));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareDescByAge() {
        Comparator<User> comparator = new UserDescByAge();
        int rsl = comparator.compare(new User("Andrey", 28), new User("Petr", 32));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareSortByAge() {
        Comparator<User> comparator = new UserSortByAge();
        int rsl = comparator.compare(new User("Andrey", 28), new User("Petr", 32));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompareDescByNameAndAge() {
        Comparator<User> comparator = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = comparator.compare(new User("Andrey", 28), new User("Andrey", 32));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompareDescByNameAndAge2() {
        Comparator<User> comparator = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = comparator.compare(new User("Andrey", 28), new User("Andrey", 28));
        assertThat(rsl, is(0));
    }
}