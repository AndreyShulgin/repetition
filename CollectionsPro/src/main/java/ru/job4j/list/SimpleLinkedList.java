package ru.job4j.list;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleLinkedList<E> implements Iterable<E> {

    private Node<E> first;
    private int modCount;

    /**
     * Метод добавляет объект в начало связанного списка
     * @param value - объект
     */
    public void add(E value) {
        Node<E> newLink = new Node<>(value);
        newLink.next = this.first;
        this.first = newLink;
        this.modCount++;
    }

    /**
     * Метод возвращает объект по позиции
     * @param position - позиция
     * @return - объект
     */
    public E get(int position) {
        Node<E> result = this.first;
        for (int i = 0; i < position; i++) {
            result = result.next;
        }
        return result.data;
    }

    /**
     * Метод удаляет из списка последний добавленный объект.
     * @return - удаленный объект
     */
    public E removeFirst() {
        var result = first.data;
        first = first.next;
        modCount++;
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int expectedModCount = modCount;
            Node<E> iter = first;
            @Override
            public boolean hasNext() {
                if (expectedModCount != modCount) {
                    throw new ConcurrentModificationException("Список был изменен.");
                }
                return iter != null;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new  NoSuchElementException("Список закончен");
                }
                Node<E> result = iter;
                iter = iter.next;
                return  result.data;
            }
        };
    }

    private static class Node<E> {
        E data;
        Node<E> next;

        public Node(E date) {
            this.data = date;
        }
    }
}
