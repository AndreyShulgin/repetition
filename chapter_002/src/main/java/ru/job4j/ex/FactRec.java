package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FactRec {

    /**
     * Вычисление Факториала с помощью рекурсии
     * @param n - число
     * @return - факториал числа
     */
    public static int calc(int n) {
        int result;
        if (n == 1) {
            result = 1;
        } else {
            result = calc(n - 1) * n;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = calc(5);
        System.out.println(rsl);
    }
}