package ru.job4j.io;

import java.io.*;
import java.util.*;

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
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String line = reader.readLine();
            List<String> start = new ArrayList<>(100);
            List<String> finish = new ArrayList<>(100);
            String[] first = null;
            String[] second;
            while (line != null) {
                if (first != null && (line.contains("200") || line.contains("300"))) {
                    second = line.split(" ");
                    start.add(first[1]);
                    finish.add(second[1]);
                    first = null;
                }
                if ((line.contains("400") || line.contains("500")) && first == null) {
                    first = line.split(" ");
                }
                line = reader.readLine();
            }
            writeTo(target, start, finish);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void writeTo(String target, List<String> start, List<String> finish) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(target))) {
            for (int index = 0; index < start.size(); index++) {
                out.println(start.get(index) + ";" + finish.get(index));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}