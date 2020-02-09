package ru.job4j.io;

import java.io.*;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Analizy {

    /**
     * Метод ищет в логах время ошибок, и записывает диапазон в указанный файл
     *
     * @param source - файл с логами
     * @param target - файл для записи
     */
    public void unavailable(String source, String target) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                PrintWriter out = new PrintWriter(new FileOutputStream(target))
        ) {
            String line = reader.readLine();
            String[] first = null;
            while (line != null) {
                first = writeTo(line, out, first);
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String[] writeTo(String line, PrintWriter out, String[] array) {
        String[] first = array;
        String[] second;
        if (first != null && (line.contains("200") || line.contains("300"))) {
            second = line.split(" ");
            out.println(first[1] + ";" + second[1]);
            first = null;
        }
        if ((line.contains("400") || line.contains("500")) && first == null) {
            first = line.split(" ");
        }
        return first;
    }
}