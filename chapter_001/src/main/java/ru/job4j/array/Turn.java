package ru.job4j.array;

/**
 * Класс Turn
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Turn {
    /**
     * Метод переворачивает массив.
     * @param array - массив.
     * @return - перевернутый массив array
     */
    public int[] back(int[] array) {

        for (int index = 0; index < array.length / 2; index++) {
            int num = array[array.length - 1 - index];
            array[array.length - 1 - index] = array[index];
            array[index] = num;
        }
        return array;
    }
}