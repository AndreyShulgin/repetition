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
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}