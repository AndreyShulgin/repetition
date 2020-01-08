package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = o2.length() - o1.length();
        int length = Math.min(o1.length(), o2.length());
        for (int index = 0; index < length; index++) {
            if (o2.charAt(index) != o1.charAt(index)) {
                result = o1.compareTo(o2);
                break;
            }
            result = o2.length() - o1.length();
        }
        return result;
    }
}