package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Student implements Comparable<Student> {

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

    /**
     * Метод преобразует список всех учеников, в учеников, у которых Score > bound
     * @param students - список учеников
     * @param bound - минимально необходимый score
     * @return - новый список
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .sorted()
                .flatMap(Stream::ofNullable)
                .takeWhile(v -> v.getScore() > bound)
                .collect(Collectors.toList());
    }

    @Override
    public int compareTo(Student o) {
        return o.getScore() - this.getScore();
    }
}
