package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UniqueText {

    /**
     * Метод проверяет одинаковый текст или нет
     * @param originText - первый текст
     * @param duplicateText - второй текст
     * @return - если ожинаковый, вернуть True
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String txt : text) {
            if (!check.contains(txt)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}