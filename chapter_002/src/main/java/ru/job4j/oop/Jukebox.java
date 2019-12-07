package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Jukebox {

    /**
     * Метод music
     * @param position в зависимости от цифры вывожит на консоль разные песни
     */
    public void music(int position) {
        String song = "Песня не найдена";
        if (position == 1) {
            song = "Пусть бегут неуклюже";
        }

        if (position == 2) {
            song = "Спокойной ночи";
        }

        System.out.println(song);
    }

    /**
     * Метод для демонстрации работы класса
     * @param args - args
     */
    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(3);
    }
}
