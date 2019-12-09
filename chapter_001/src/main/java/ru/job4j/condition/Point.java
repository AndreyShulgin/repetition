package ru.job4j.condition;

import static java.lang.Math.*;

public class Point {

    /**
     * Координата X
     */
    private int x;

    /**
     * Координата Y
     */
    private int y;

    /**
     * Конструктор
     * @param first значение кординаты X
     * @param second значение координаты Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * @param that объект Point
     * @return расстояние между точками
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}