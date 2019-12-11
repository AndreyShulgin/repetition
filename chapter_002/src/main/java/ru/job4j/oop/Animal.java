package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Animal {

    /**
     * Конструктор, который показывает очередность загрузки конструкторов при наследовании.
     */
    public Animal() {
        super();
        System.out.println("load animal");
    }
}
