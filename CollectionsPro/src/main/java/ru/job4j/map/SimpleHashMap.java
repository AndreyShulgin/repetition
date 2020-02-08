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
     * Определение хеша ключа
     * @param key - ключ
     * @return - хеш
     */
    private static int hash(Object key) {
        int h;
        if (key == null) {
            h = 0;
        } else {
            h = key.hashCode();
            h = h ^ (h >>> 16);
        }
        return h;
    }

    /**
     * Метод определяет индекс в массиве по хешу
     * @param hash - хеш ключа
     * @return - индекс
     */
    private int indexFor(int hash) {
            return hash & (simpleHashMap.length - 1);

    }

    /**
     * Метод удаляет из карты по ключу
     *
     * @param key - ключ
     * @return - если объект был удален возврашает true
     */
    public boolean delete(K key) {
        boolean result = false;
        int hash = hash(key);
        int index = indexFor(hash);
        if (simpleHashMap[index] != null && simpleHashMap[index].key.equals(key)) {
            simpleHashMap[index] = null;
            result = true;
            modCount++;
            size--;
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
        int hash = hash(key);
        int index = indexFor(hash);
        Node<K, V> node = simpleHashMap[index];
        if (node != null) {
            if ((node.key == null && key == null) || (node.key != null && node.key.equals(key))) {
                result = node.value;
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
    public boolean insert(K key, V value) {
        var result = true;
        var first = new Node<>(key, value);
        int hash = hash(first.key);
        int index = indexFor(hash);
        if (size >= simpleHashMap.length) {
            size = 0;
            simpleHashMap = increaseArray(simpleHashMap);
        }
        if (simpleHashMap[index] != null && simpleHashMap[index].key.equals(key)) {
            result = false;
        }
        if (result) {
            simpleHashMap[index] = first;
            modCount++;
            size++;
        }
        return result;
    }

    private Node<K, V>[] increaseArray(Node<K, V>[] before) {
        Node<K, V>[] result = (Node<K, V>[]) new Node[before.length * 2];
        for (Node<K, V> kvNode : before) {
            if (kvNode != null) {
                var hash = hash(kvNode);
                var index = indexFor(hash);
                result[index] = kvNode;
                size++;
            }
        }
        return result;
    }

    @Override
    public Iterator<K> iterator() {
        return new Iterator<K>() {
            int index;
            final int expectedModCount = modCount;

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
