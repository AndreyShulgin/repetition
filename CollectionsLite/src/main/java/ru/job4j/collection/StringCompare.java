package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = left.length() - right.length();
        int length = Math.min(left.length(), right.length());
        for (int index = 0; index < length; index++) {
            if (left.charAt(index) != right.charAt(index)) {
                result = left.charAt(index) - right.charAt(index);
                break;
            }
        }
        return result;
    }
}