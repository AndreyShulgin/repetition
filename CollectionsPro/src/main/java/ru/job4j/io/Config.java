package ru.job4j.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Config {
    private final String path;
    private final Map<String, String> values = new HashMap<>();

    public Config(final String path) {
        this.path = path;
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.path))) {
            String line = reader.readLine();
            while (line != null) {
                if (!line.contains("##")) {
                    int number = line.indexOf("=");
                    if (number > 0) {
                        values.put(line.substring(0, number), line.substring(number + 1));
                    }
                }
                line = reader.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String value(String key) {
        String result = null;
        for (Map.Entry<String, String> x : values.entrySet()) {
            if (x.getKey().equals(key)) {
                result = x.getValue();
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringJoiner out = new StringJoiner(System.lineSeparator());
        try (BufferedReader read = new BufferedReader(new FileReader(this.path))) {
            read.lines().forEach(out::add);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out.toString();
    }

    public static void main(String[] args) {
        Config config = new Config("app.properties");
        config.load();
        System.out.println(config.value("hibernate.connection.driver_class"));
    }
}