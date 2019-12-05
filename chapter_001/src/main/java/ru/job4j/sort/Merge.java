package ru.job4j.sort;

import java.util.Arrays;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Merge {

    /**
     * Метод объеденяет два массива по возрастанию.
     *
     * @param left  - первый массив
     * @param right - второй массив
     * @return - объедененный массив
     */
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexRsl = 0;
        int indexLeft = 0;
        int indexRight = 0;
        while (indexRsl < rsl.length) {
            if (indexLeft == left.length) {
                System.arraycopy(right, indexRight, rsl, indexRsl, right.length - indexRight);
                break;
            }
            if (indexRight == right.length) {
                System.arraycopy(left, indexLeft, rsl, indexRsl, left.length - indexLeft);
                break;
            }
            rsl[indexRsl] = left[indexLeft] > right[indexRight] ? right[indexRight++] : left[indexLeft++];
            indexRsl++;
        }
        return rsl;
    }

    /**
     * Метод main для запуска
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}