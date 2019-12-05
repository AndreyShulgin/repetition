package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Min {
    /**
     * Метод поиска наименьшего числа в массиве
     * @param array - массив
     * @return - наименьшее число в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }
}