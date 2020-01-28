package ru.job4j.list;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleQueue<T> {

    private SimpleStack<T> in = new SimpleStack<>();
    private SimpleStack<T> out = new SimpleStack<>();

    /**
     * Метод удаляет из стека первый добавленный элемент
     *
     * @return - удаоленный объект
     */
    public T poll() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.poll());
            }
        }
        return out.poll();
    }

    /**
     * Метод добавляет объект в стек
     *
     * @param value - объект
     */
    public void push(T value) {
        in.push(value);
    }
}
