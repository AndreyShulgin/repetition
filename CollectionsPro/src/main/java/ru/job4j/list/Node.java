package ru.job4j.list;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public boolean hasCycle(Node<T> first) {
        boolean result = false;
        Node<T> turtle = first;
        Node<T> hare = first;

        while (turtle != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            if (turtle == hare) {
                result = true;
                break;
            }
        }

        return result;
    }
}


