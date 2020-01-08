package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String o1part = o1.substring(0, 1);
        String o2part = o2.substring(0, 1);
        int result;
        if (o1part.compareTo(o2part) == 0) {
            result = o1.compareTo(o2);
        } else {
            result = o2.compareTo(o1);
        }
        return result;
    }
}