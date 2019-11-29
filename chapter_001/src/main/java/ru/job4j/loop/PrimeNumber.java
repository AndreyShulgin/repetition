package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = finish - 1;
        for (int out = 2; out <= finish; out++) {
            for (int in = 2; in < out; in++) {
                if (out % in == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}