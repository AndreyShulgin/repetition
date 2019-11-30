package ru.job4j.array;

/**
 * Check
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Check {
    /**
     * Метод проверяет, что Массив заполнен true или false
     * @param data - массив
     * @return - true если заполнин одинаковыми элементами
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[0] != data[index]) {
                result = false;
            }
        }
        return result;
    }
}