package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Метод поиска всех заявок
     * @return возвращает массив со всеми заявками
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Метод поиска заявок по имени
     * @param key - искомое имя заявки
     * @return - массив заявок с искомым имененем
     */
    public Item[] findByName(String key) {
        Item[] result = new Item[position + 1];
        int size = 0;
        for (int index = 0; index < result.length; index++) {
            if (items[index] != null && items[index].getName().equals(key)) {
                result[size++] = items[index];
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    /**
     * Метод ищет завки по ключу
     * @param id  - искомый ключ
     * @return - Null если нет заявки, или объект Item с искомым ключом
     */
    public Item findById(String id) {
        Item result = null;
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null && items[index].getId().equals(id)) {
                result = items[index];
                break;
            }
        }
        return result;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}