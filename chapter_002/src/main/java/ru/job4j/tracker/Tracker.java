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
        if (indexOf(id) != -1) {
            result = items[indexOf(id)];
        }
        return result;
    }

    /**
     * Метод заменяет заявку, оставляя предыдущий ID
     * @param id - id заявки
     * @param item - заявка на которую нужно изменить
     */
    public void replace(String id, Item item) {
        int index = indexOf(id);
        if (index != -1) {
            item.setId(items[index].getId());
            items[index] = item;
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * Метод удаляет заявку из списка.
     * @param id - ID заявки.
     */
    public void delete(String id) {
        if (indexOf(id) != -1) {
            System.arraycopy(items, indexOf(id) + 1, items, indexOf(id), position - indexOf(id));
            items[position--] = null;
        } else {
            System.out.println("Item not found");
        }
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

    /**
     * Метод поиска индекса заявки в массиве по ID
     * @param id - ключ
     * @return - если есть заявка, то возращает ее номер в массиве, если нет, то -1.
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}