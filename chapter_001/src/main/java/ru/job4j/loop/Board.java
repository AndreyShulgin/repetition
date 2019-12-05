package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int out = 0; out <= width; out++) {
            for (int in = 0; in <= height; in++) {
                if ((out + in) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}