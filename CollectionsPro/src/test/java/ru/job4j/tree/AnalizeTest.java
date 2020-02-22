package ru.job4j.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnalizeTest {

    @Test
    public void analize() {
        Analize analize = new Analize();
        List<Analize.User> previous = new ArrayList<>();
        previous.add(new Analize.User(1, "Andrey"));
        previous.add(new Analize.User(2, "Alex"));
        previous.add(new Analize.User(3, "Sasha"));
        previous.add(new Analize.User(4, "Lolly"));
        List<Analize.User> current = new ArrayList<>();
        current.add(new Analize.User(1, "Mother"));
        current.add(new Analize.User(7, "Andrey"));
        Analize.Info info = analize.diff(previous, current);
        assertThat(info.added, is(1));
        assertThat(info.changed, is(1));
        assertThat(info.deleted, is(3));
    }

}