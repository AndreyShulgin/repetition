package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 1;
        while ((amount + amount * percent / 100) > salary) {
            year++;
            amount = (int) (amount + amount * percent / 100 - salary);
        }
        return year;
    }
}