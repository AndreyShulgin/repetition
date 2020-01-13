package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Fact {

    /**
     * Метод считает факториал числа
     * @param n - число
     * @return - факториал
     */
    public int calc(int n) {
        if (n < 1) {
            throw  new IllegalArgumentException("Значение должно быть больше 1.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl = rsl * index;
        }
        return rsl;
    }
}