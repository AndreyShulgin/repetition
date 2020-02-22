package ru.job4j.io;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AnalizyTest {

    @Test
    public void unavailable() {
        Analizy analizy = new Analizy();
        analizy.unavailable("./../server.log", "./../unavailable.csv");
        String result = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("./../unavailable.csv"))) {
            result = reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertThat(result, is("10:58:01;10:59:01"));
    }

}