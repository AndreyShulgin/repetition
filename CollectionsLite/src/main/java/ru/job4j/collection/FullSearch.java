package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FullSearch {

    /**
     * Метод записывает уникальные номера заявок в список.
     * @param list - список всех заявок
     * @return - уникальные номера заявок
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task lst  : list) {
            numbers.add(lst.getNumber());
        }
        return numbers;
    }
}