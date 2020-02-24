package ru.job4j.tree;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        Info result = new Info();
        HashMap<Integer, User> before = listToMap(previous);
        for (User user : current) {
            if (before.get(user.id) == null) {
                result.added++;
            } else if (!before.get(user.id).name.equals(user.name)) {
                result.changed++;
                before.remove(user.id);
            }
        }
        result.deleted = before.size();
        return result;
    }

    private HashMap<Integer, User> listToMap(List<User> users) {
        HashMap<Integer, User> result = new HashMap<>();
        for (User user : users) {
            result.put(user.id, user);
        }
        return result;
    }

    public static class User {
        int id;
        String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public static class Info {
        int added;
        int changed;
        int deleted;
    }
}