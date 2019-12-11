package ru.job4j.pojo;

import java.util.Date;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class College {

    /**
     * Метод показывает работу сеттеров и геттеров
     * @param args - args
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Andrey");
        student.setGroup(2);
        student.setEntrance(new Date());
        System.out.println(student.getName()
                + System.lineSeparator()
                + student.getGroup()
                + System.lineSeparator()
                + student.getEntrance());
    }
}
