package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = true;
        for (int index = 2; index < finish; index++) {
            if (finish % index == 0) {
                prime = false;
            }
        }
        return prime;
    }
}