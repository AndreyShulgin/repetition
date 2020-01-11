package ru.job4j.stream;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MatrixToListTest {

    @Test
    public void convert() {
        MatrixToList mtl = new MatrixToList();
        Integer[][] matrix = {{1, 2}, {3, 4, 5, 6}, {7, 8}};
        List<Integer> result = mtl.convert(matrix);
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertThat(result, is(expect));
    }

}