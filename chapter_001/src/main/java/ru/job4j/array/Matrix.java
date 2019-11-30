package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Matrix {
    /**
     * Двумерный массив, таблицы умножения
     * @param size - размер таблицы
     * @return - двумерный массив
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < table.length; out++) {
            for (int in = 0; in < table.length; in++) {
                table [out][in] = (out +1) * (in + 1);
            }
        }
        return table;
    }
}