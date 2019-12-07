package ru.job4j.array;

/**
 * Класс Square
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Square {

    /**
     * Метод возводит числа от 1 до bound и добавляет их в массив.
     * @param bound - bound.
     * @return - массив квадратов от 1 до bound.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 1; index <= bound; index++) {
            rst[index - 1] = index * index;
        }
        return rst;
    }
}