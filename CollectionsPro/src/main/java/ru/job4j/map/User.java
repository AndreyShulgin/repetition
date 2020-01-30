package ru.job4j.map;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class User {

    private String name;
    private int children;
    private Calendar birthday;

    public User(String name, int children, Calendar birthday) {
        this.name = name;
        this.children = children;
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Calendar calendar = new Calendar() {
            @Override
            protected void computeTime() {

            }

            @Override
            protected void computeFields() {

            }

            @Override
            public void add(int field, int amount) {

            }

            @Override
            public void roll(int field, boolean up) {

            }

            @Override
            public int getMinimum(int field) {
                return 0;
            }

            @Override
            public int getMaximum(int field) {
                return 0;
            }

            @Override
            public int getGreatestMinimum(int field) {
                return 0;
            }

            @Override
            public int getLeastMaximum(int field) {
                return 0;
            }
        };
        User first = new User("Andrey", 0, calendar);
        User second = new User("Sergey", 1, calendar);
        Map<User, String> users = new HashMap<>();
        users.put(first, "Andrey");
        users.put(second, "Sergey");
        System.out.println(users);

    }
}
