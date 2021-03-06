package ru.job4j.calculator;

/**
 * Calculator
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class Calculator {

    /**
     * Сложение first и second.
     * @param first - первое число.
     * @param second - второе число.
     * @return сумма
     */
    public double add(double first, double second) {
        return first + second;
    }

    /**
     * Сложение first и second.
     * @param first - первое число.
     * @param second - второе число.
     * @param third - третье число.
     */
    public double add(double first, double second, double third) {
        return add(first, add(second, third));
    }

    /** Деление first на second.
     * @param first - первое число.
     * @param second - второе число.
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    /** Умножение first и second.
     * @param first - первое число.
     * @param second - второе число.
     */
    public static void multiply(double first, double second) {
        double result =  first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /** Вычитание из first second.
     * @param first - первое число.
     * @param second - второе число.
     */
    public static void subtract(double first, double second) {
        double result =  first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /** Метод main для запуска.
     * @param args - args.
     */
    public static void main(String[] args) {
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}