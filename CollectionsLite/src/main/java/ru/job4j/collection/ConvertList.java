package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ConvertList {

    /**
     * Метод конвертирует список массивов в список с числами
     * @param list - список массивов
     * @return - список чисел
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] out : list) {
            for (int in : out) {
                rsl.add(in);
            }
        }
        return rsl;
    }
}