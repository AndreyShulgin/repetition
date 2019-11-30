package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class SortSelected {

    /**
     * Метод сортирует массив по возростанию
     * @param data - массив
     * @return отсортированный массив
     */
    public static int[] sort(int[] data) {
        int min;
        int index;
        int num;
        for (int i = 0; i < data.length; i++) {
            min = MinDiapason.findMin(data, i, data.length);
            index = FindLoop.indexOf(data, min, i, data.length - 1);
            num = data[i];
            data[i] = data[index];
            data[index] = num;
        }
        return data;
    }
}