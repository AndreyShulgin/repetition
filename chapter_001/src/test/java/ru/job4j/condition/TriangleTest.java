package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Triangle triangle = new Triangle(new Point(1, 1), new Point(5, 9), new Point(9, 1));
        double result = triangle.area();
        assertThat(result, is(32.0));
    }

    @Test
    public void whenNotExist() {
        Triangle triangle = new Triangle(new Point(1, 2), new Point(1, 1), new Point(1, 3));
        double result = triangle.area();
        assertThat(result, is(-1.0));
    }
}