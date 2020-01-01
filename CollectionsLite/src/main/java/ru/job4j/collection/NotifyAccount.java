package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class NotifyAccount {

    /**
     * Метод преобразует список в уникальный список
     * @param accounts - список
     * @return - список без повторений
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account account : accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}