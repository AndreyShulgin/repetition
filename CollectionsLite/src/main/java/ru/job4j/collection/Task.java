package ru.job4j.collection;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    public String getNumber() {
        return number;
    }
}