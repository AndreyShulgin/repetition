package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    /**
     * Метод поиска всех заявок
     * @return возвращает массив со всеми заявками
     */
    public ArrayList<Item> findAll() {
        return items;
    }

    /**
     * Метод поиска заявок по имени
     * @param key - искомое имя заявки
     * @return - массив заявок с искомым имененем
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Метод ищет завки по ключу
     * @param id  - искомый ключ
     * @return - Null если нет заявки, или объект Item с искомым ключом
     */
    public Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Метод заменяет заявку, оставляя предыдущий ID
     * @param id - id заявки
     * @param item - заявка на которую нужно изменить
     */
    public void replace(String id, Item item) {
        for (Item itm : items) {
            if (itm.getId().equals(id)) {
                itm.setName(item.getName());
                break;
            }
        }
    }

    /**
     * Метод удаляет заявку из списка.
     * @param id - ID заявки.
     */
    public void delete(String id) {
        items.removeIf(item -> item.getId().equals(id));
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