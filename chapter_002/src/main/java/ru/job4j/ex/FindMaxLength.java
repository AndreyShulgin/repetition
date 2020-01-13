package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FindMaxLength {

    /**
     * Метод для запуска программы
     * @param args - args
     */
    public static void main(String[] args) {
        String[] shops = {"Ebay", null, "Amazon", null, "Ozon"};
        int max = 0;
        for (String el : shops) {
            if (el != null && el.length() > max) {
                max = el.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}