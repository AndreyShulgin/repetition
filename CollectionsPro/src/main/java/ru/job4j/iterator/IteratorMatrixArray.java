package ru.job4j.iterator;

import java.util.Iterator;

/**
 * Итератор для двухмерного массива
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class IteratorMatrixArray implements Iterator {

    /**
     * Двухмерный массив
     */
    private final int[][] values;
    /**
     * Индекс массива
     */
    private int indexOut = 0;
    /**
     * Индекс массива
     */
    private int indexIn = 0;

    public IteratorMatrixArray(final int[][] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        boolean result;
        if (values.length > indexOut && values[indexOut].length > indexIn) {
            result = true;
        } else {
            indexOut++;
            indexIn = 0;
            result = values.length > indexOut;
        }

        return result;
    }

    @Override
    public Object next() {
        if (values[indexOut].length == indexIn) {
            indexOut++;
            indexIn = 0;
        }
        return values[indexOut][indexIn++];
    }
}
