package ru.job4j.collection;

import java.util.HashMap;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UsageMap {

    /**
     * Демонстрация работы HashMap
     * @param args - args
     */
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("neono404@gmail.com", "Andrey Shulgin");
        for (String key : map.keySet()) {
            var value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
