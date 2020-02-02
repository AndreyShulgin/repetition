package ru.job4j.map;

import java.util.*;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SimpleHashMap<K, V> implements Iterable<K> {

    private Node<K, V>[] simpleHashMap;
    private int size;
    private int modCount;

    public SimpleHashMap(int size) {
        if (size < 2) {
            this.simpleHashMap = new Node[2];
        } else {
            this.simpleHashMap = new Node[size];
        }
    }

    /**
     * Метод удаляет из карты по ключу
     *
     * @param key - ключ
     * @return - если объект был удален возврашает true
     */
    public boolean delete(K key) {
        boolean result = false;
        for (int index = 0; index < simpleHashMap.length; index++) {
            if (simpleHashMap[index] != null && simpleHashMap[index].key.equals(key)) {
                simpleHashMap[index] = null;
                result = true;
                modCount++;
                size--;
            }
        }
        return result;
    }

    /**
     * Метод возвращает значение по ключу
     *
     * @param key - ключ
     * @return - возвращает значение, если не найдено, то null
     */
    public V get(K key) {
        V result = null;
        for (Node<K, V> kvNode : simpleHashMap) {
            if (kvNode != null && kvNode.key.equals(key)) {
                result = kvNode.value;
            }
        }
        return result;
    }

    /**
     * Метод добавляет значение в карту
     *
     * @param key   - ключ
     * @param value - значение
     * @return - возвращает false, если в карте же есть данный ключ.
     */
    boolean insert(K key, V value) {
        var result = true;
        var first = new Node<>(key, value);
        if (size >= simpleHashMap.length) {
            simpleHashMap = Arrays.copyOf(simpleHashMap, simpleHashMap.length * 2);
        }
        for (Node<K, V> kvNode : simpleHashMap) {
            if (kvNode != null && kvNode.key.equals(key)) {
                result = false;
                break;
            }
        }
        if (result) {
            var index = first.hashCode() & (simpleHashMap.length - 1);
            simpleHashMap[index] = first;
            modCount++;
            size++;
        }
        return result;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            int index;
            int expectedModCount = modCount;

            @Override
            public boolean hasNext() {
                if (modCount != expectedModCount) {
                    throw new ConcurrentModificationException("Список был изменен");
                }
                var result = false;
                while (index < simpleHashMap.length) {
                    if (simpleHashMap[index] != null) {
                        result = true;
                        break;
                    }
                    index++;
                }
                return result;
            }

            @Override
            public K next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Список пуст");
                }
                return simpleHashMap[index++].key;
            }
        };
    }

    private static class Node<K, V> {
        final K key;
        final V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }


        public final boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (o instanceof Map.Entry) {
                Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
                return Objects.equals(key, e.getKey()) && Objects.equals(value, e.getValue());
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hashCode(key) ^ Objects.hashCode(value);
        }
    }
}
