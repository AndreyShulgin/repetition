package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {

    @Test
    public void class10A() {
        Student student = new Student(20);
        Student student2 = new Student(90);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> result = school.collect(students, s -> s.getScore() > 70);
        assertThat(result.get(0), is(student2));
        assertThat(result.size(), is(1));
    }

    @Test
    public void class10B() {
        Student student = new Student(60);
        Student student2 = new Student(90);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> result = school.collect(students, s -> s.getScore() > 50 && s.getScore() < 70);
        assertThat(result.get(0), is(student));
        assertThat(result.size(), is(1));
    }

    @Test
    public void class10C() {
        Student student = new Student(20);
        Student student2 = new Student(90);
        List<Student> students = Arrays.asList(student, student2);
        School school = new School();
        List<Student> result = school.collect(students, s -> s.getScore() < 50);
        assertThat(result.get(0), is(student));
        assertThat(result.size(), is(1));
    }

}