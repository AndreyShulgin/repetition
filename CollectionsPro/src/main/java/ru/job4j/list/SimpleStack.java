package ru.job4j.list;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleStack<T> {

    private SimpleLinkedList<T> simpleLinkedList = new SimpleLinkedList<>();


    /**
     *Метод удаляет из стека последний добавленный объект
     * @return - удаленный объект
     */
    public T poll() {
        return simpleLinkedList.removeFirst();
    }

    /**
     * Метод добавляет в стек объект
     * @param value - объект
     */
    public void push(T value) {
        simpleLinkedList.add(value);
    }
}
