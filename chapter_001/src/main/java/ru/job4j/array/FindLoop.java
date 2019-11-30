package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class FindLoop {
    /**
     * Метод проверяет есть ли элемент el в массиве date.
     * @param data - массив.
     * @param el - элемент для поиска в date.
     * @return - возвращает индекс элемента равного el или -1.
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * Метод проверяет есть ли элемент el в массиве date в диапозоне от start до finish
     * @param data - массив
     * @param el - элемент для поиска
     * @param start - начало диапозона
     * @param finish - конец диапозона
     * @return - возвращает индекс элемента равного el или -1.
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
            }
        }
        return rst;
    }
}