package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest {

    @Test
    public void levelOf() {
        List<Student> students = List.of(new Student(10, "Andrey"), new Student(40, "Alex"));
        assertThat(Student.levelOf(students, 2).get(1).getFirstName(), is("Andrey"));
    }

    @Test
    public void levelOf2() {
        List<Student> students = List.of(new Student(10, "Andrey"), new Student(40, "Alex"));
        assertThat(Student.levelOf(students, 20).get(0).getFirstName(), is("Alex"));

    }

}