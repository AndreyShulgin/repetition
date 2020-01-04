package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UserDescByAge implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
