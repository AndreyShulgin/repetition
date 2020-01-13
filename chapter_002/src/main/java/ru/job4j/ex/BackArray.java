package ru.job4j.ex;

import java.util.Arrays;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class BackArray {

    /**
     * Для для запуска программы
     * @param args - args
     */
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}