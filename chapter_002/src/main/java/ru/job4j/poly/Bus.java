package ru.job4j.poly;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Bus implements Transport {
    @Override
    public void drive() {

    }

    @Override
    public void passengers(int amount) {

    }

    @Override
    public int fill(int fuel) {
        return fuel * 48;
    }
}
