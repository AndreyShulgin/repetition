package ru.job4j.loop;

/**
 * Slash
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Slash {

    /**
     * Метод рисует крест из 0 в псевдографике.
     * @param size - размер поля.
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = false;
                if (row == cell) {
                    left = true;
                }
                boolean right = false;
                if (row + cell == size - 1) {
                    right = true;
                }
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод main для запуска.
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}