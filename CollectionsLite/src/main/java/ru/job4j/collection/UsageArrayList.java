package ru.job4j.collection;

import java.util.ArrayList;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UsageArrayList {

    /**
     * Запуск приложения
     * @param args - args
     */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
