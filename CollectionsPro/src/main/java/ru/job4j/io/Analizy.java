package ru.job4j.io;

import java.io.*;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Analizy {
    public void unavailable(String source, String target) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(source));
                PrintWriter out = new PrintWriter(new FileOutputStream(target))
        ) {
            String line = reader.readLine();
            String[] first = null;
            String[] second;
            while (line != null) {
                if (first != null && (line.contains("200") || line.contains("300"))) {
                    second = line.split(" ");
                    out.println(first[1] + ";" + second[1]);
                    first = null;
                }
                if ((line.contains("400") || line.contains("500")) && first == null) {
                    first = line.split(" ");
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Analizy analizy = new Analizy();
        analizy.unavailable("server.log", "unavailable.csv");
    }
}