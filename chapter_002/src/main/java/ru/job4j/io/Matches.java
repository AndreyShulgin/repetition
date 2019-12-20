package ru.job4j.io;

import java.util.Scanner;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 11;
        int bullshit;
        boolean run = true;
        while (run) {
            System.out.println("На столе лежит " + number + " спичек.");
            System.out.println("Возьмите от 1 до 3 спичек");
            bullshit = Integer.parseInt(input.nextLine());
            if (bullshit <= number && bullshit == 1) {
                number -= bullshit;
                System.out.println("На столе осталось " + number + " спичек.");
            } else if (bullshit <= number && bullshit == 2) {
                number -= bullshit;
                System.out.println("На столе осталось " + number + " спичек.");
            } else if (bullshit <= number && bullshit == 3) {
                number -= bullshit;
                System.out.println("На столе осталось " + number + " спичек.");
            } else {
                System.out.println("Вы взяли не правильное количество спичек");
            }
            if (number == 0) {
                System.out.println("Вы победили!");
                run = false;
            }
        }
    }
}
