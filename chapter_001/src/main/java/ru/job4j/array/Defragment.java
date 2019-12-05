package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Defragment {
    /**
     * Метод все null элементы переносит в конец массива
     * @param array - массив
     * @return - отсортированный массив
     */
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int num = index;
                while (num < array.length - 1 && cell == null) {
                    cell = array[++num];
                    if (cell != null) {
                        array[index] = array[num];
                        array[num] = null;
                    }
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    /**
     * Метод для старта программы
     * @param args - args
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String s : compressed) {
            System.out.print(s + " ");
        }
    }
}