package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Predator extends Animal {

    /**
     * Конструктор, который показывает очередность загрузки конструкторов при наследовании.
     *
     * @param name - имя
     */
    public Predator(String name) {
        super(name);
        System.out.println("load predator");
    }
}
