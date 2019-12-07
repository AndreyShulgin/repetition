package ru.job4j.oop;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Cat {

    private String food;
    private String name;

    /**
     * Метедо вывод на консоль имя и что ел объект Cat
     */
    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    /**
     * @param meat - еда объекта Cat
     */
    public void eat(String meat) {
        this.food = meat;
    }

    /**
     * @param nick Имя объекта Cat
     */
    public void giveNick(String nick) {
        this.name = nick;
    }

    /**
     * Метод для демонстрации работы класса
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}