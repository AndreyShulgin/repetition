package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Battery {

    private int load;

    /**
     * Метод передает значение load объекту another
     * @param another объект Battery
     */
    public void exchange(Battery another) {
        another.load = this.load;
        this.load = 0;
    }

}
