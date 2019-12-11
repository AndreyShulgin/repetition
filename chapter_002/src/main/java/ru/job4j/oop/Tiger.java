package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Tiger extends Predator {

    /**
     * Конструктор, который показывает очередность загрузки конструкторов при наследовании.
     *
     * @param name - имя
     */
    public Tiger(String name) {
        super(name);
        System.out.println("load tiger");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger("Mouse");
    }
}
