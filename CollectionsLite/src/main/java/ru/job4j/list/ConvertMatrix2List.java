package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ConvertMatrix2List {

    /**
     * Метод конвертирует двумерный массив в список
     * @param array - двумерный массив
     * @return - список
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}