package ru.job4j.generic;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public abstract class Base {
    private final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}