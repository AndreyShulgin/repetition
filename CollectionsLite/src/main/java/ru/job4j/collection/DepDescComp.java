package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result;
        if (o1.charAt(1) == (o2.charAt(1))) {
            result = o1.compareTo(o2);
        } else {
            result = o2.compareTo(o1);
        }
        return result;
    }
}