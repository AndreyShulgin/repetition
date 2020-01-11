package ru.job4j.stream;

import java.util.List;
import java.util.Map;
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

    /**
     * Метод делает из списка студентов карту
     * @param students - список студентов
     * @return - карта, ключ это Имя студента, а значение, сам Объект
     */
    public Map<String, Student> convert(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getFirstName, e -> e));
    }
}
