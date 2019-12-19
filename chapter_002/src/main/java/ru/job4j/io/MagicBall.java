package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class MagicBall {

    /**
     * Метод для запуска
     * @param args - args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println("Да");
        } else if (answer == 1) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }

    }
}
