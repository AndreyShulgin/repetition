package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Animal {

    /**
     * Имя объекта.
     */
    private String name;

    /**
     * Конструктор, который показывает очередность загрузки конструкторов при наследовании.
     *
     * @param name - имя
     */
    public Animal(String name) {
        this.name = name;
        System.out.println("load animal");
    }

}
