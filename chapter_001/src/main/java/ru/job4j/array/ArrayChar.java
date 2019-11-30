package ru.job4j.array;

/**
 * ArrayChar
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class ArrayChar {

    /**
     * Массив проверяет совпадают ли начало массива word с массивом pref
     * @param word - массив
     * @param pref - массив
     * @return - true если совпадают
     */
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}