package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Item implements Comparable<Item> {
    /**
     * Уникальный ID заявки.
     */
    private String id;
    /**
     * Название заявки.
     */
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Item o) {
        return this.getName().compareTo(o.getName());
    }
}