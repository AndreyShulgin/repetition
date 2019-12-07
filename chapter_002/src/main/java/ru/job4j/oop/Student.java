package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Student {

    /**
     * Метод music
     */
    public void music() {
        System.out.println("Tra tra tra");
    }

    /**
     * Метод song
     */
    public void song() {
        System.out.println("I believe I can fly");
    }

    /**
     * Метод для запуска приложения
     * @param args - args
     */
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}