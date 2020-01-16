package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор четных чисел
 *
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class EvenIterator implements Iterator {
    /**
     * Массив
     */
    private final int[] values;
    /**
     * Индекс массива
     */
    private int index = 0;

    public EvenIterator(final int[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        while (values.length > index && values[index] % 2 != 0) {
            index++;
        }
        return values.length > index;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("Четных элементов больше нет");
        }
        return values[index++];
    }
}
