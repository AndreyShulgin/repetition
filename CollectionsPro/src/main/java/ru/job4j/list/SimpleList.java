package ru.job4j.list;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleList<E> implements Iterable<E> {

    private Object[] container;
    private int index = 0;
    private int modCount = 0;

    public SimpleList(int sizeContainer) {
        this.container = new Object[sizeContainer];
    }

    /**
     * Метод добавляет элемент в список
     * @param value - элемент
     */
    public void add(E value) {
        if (index >= container.length) {
            container = Arrays.copyOf(container, container.length * 2);
        }
        container[index] = value;
        index++;
        modCount++;
    }

    /**
     * Метод возвращает элемент из списка по значению
     * @param position - значение
     * @return - элемент
     */
    public E get(int position) {
        return (E) container[position];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int indexIt = 0;
            int expectedModCount = modCount;
            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException("Список был изменен");
                }
                return indexIt < SimpleList.this.index;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Список закончен");
                }
                return (E) container[indexIt++];
            }
        };
    }
}
