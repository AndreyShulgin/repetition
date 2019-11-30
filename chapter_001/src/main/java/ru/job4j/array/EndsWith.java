package ru.job4j.array;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 * @version 1.0
 */
public class EndsWith {
    /**
     * Метод проверяет совпадает ли окончание массивов
     * @param word - массив
     * @param post - массив
     * @return true если совпадают
     */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = word.length - post.length; index < word.length; index++) {
            if (word[index] != post[index - post.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}