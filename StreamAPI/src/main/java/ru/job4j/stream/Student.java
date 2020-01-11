package ru.job4j.stream;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Student {

    /**
     * Поле успеваемости студента
     */
    private int score;

    /**
     * Имя студента
     */
    private String firstName;

    public Student(int score) {
        this.score = score;
    }

    public Student(int score, String firstName) {
        this.score = score;
        this.firstName = firstName;
    }

    public int getScore() {
        return score;
    }

    public String getFirstName() {
        return firstName;
    }
}
