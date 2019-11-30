package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MinDiapason {
    /**
     * Метод ищет минимальльный элемент массива в диапозоне от start до finish
     * @param array - массив
     * @param start - начало диапозона
     * @param finish - конец диапозона
     * @return - минимальный элемент
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}