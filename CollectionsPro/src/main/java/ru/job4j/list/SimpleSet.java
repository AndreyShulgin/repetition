package ru.job4j.list;

import java.util.Iterator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleSet<E> implements Iterable<E> {

    private SimpleList<E> simpleList;

    public SimpleSet(int size) {
        this.simpleList = new SimpleList<>(size);
    }

    public void add(E e) {
        boolean append = true;
        for (E list : simpleList) {
            if (e.equals(list)) {
                append = false;
                break;
            }
        }
        if (append) {
            simpleList.add(e);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return simpleList.iterator();
    }
}
