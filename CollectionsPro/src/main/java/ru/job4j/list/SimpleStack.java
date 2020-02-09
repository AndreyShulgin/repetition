package ru.job4j.list;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleStack<T> {

    private SimpleLinkedList<T> simpleLinkedList = new SimpleLinkedList<>();
    private int size;


    /**
     *Метод удаляет из стека последний добавленный объект
     * @return - удаленный объект
     */
    public T poll() {
        T result = null;
        if (!isEmpty()) {
            result = simpleLinkedList.removeFirst();
            size--;
        }
        return result;
    }

    /**
     * Метод добавляет в стек объект
     * @param value - объект
     */
    public void push(T value) {
        simpleLinkedList.add(value);
        size++;
    }

    /**
     * Метод проверят, что стек не пустой
     * @return - true если стек пустой
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
