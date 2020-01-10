package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class School {

    /**
     * Метод считает вкакой класс определить студента
     * @param students - список студентов
     * @param predict - условие распределения
     * @return - список кто подходит по условию
     */
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
}
