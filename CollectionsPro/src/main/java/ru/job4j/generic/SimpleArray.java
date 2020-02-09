package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleArray<T> implements Iterable<T> {
    private final Object[] values;
    private int index;

    /**
     * Конструктор
     * @param size - размер массива
     */
    public SimpleArray(int size) {
        this.values = new Object[size];
    }

    /**
     * Метод добавляет в массив объект
     * @param model - объект
     */
    public void add(T model) {
        if (index == values.length) {
            throw new ArrayIndexOutOfBoundsException("Массив переполнен.");
        }
        values[index++] = model;
    }

    /**
     * Заменяет объект
     * @param index - индекс объекта для замены
     * @param model - новый объект
     */
    public void set(int index, T model) {
        if (index < this.index) {
            values[index] = model;
        }
    }

    /**
     * Удаляет объект их массива
     * @param index - индекс объекта
     */
    public void remove(int index) {
        if (values.length - 1 - index > 0) {
            System.arraycopy(values, index + 1, values, index, values.length - 1 - index);
            this.index--;
        }
    }

    /**
     * Метод возвращает объект массива по индексу
     * @param index - индекс
     * @return - искомый объект
     */
    public T get(int index) {
        return (T) this.values[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int indexIt = 0;

            @Override
            public boolean hasNext() {
                return index > indexIt;
            }

            @Override
            public T next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException("No elements");
                }
                return (T) values[indexIt++];
            }
        };
    }
}
