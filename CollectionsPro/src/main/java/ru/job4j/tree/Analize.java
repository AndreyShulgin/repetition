package ru.job4j.tree;

import java.util.List;
import java.util.Objects;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Analize {

    public Info diff(List<User> previous, List<User> current) {
        Info result = new Info();
        for (User user : previous) {
            for (int in = 0; in < current.size(); in++) {
                if (user.equals(current.get(in))) {
                    if (!user.name.equals(current.get(in).name)) {
                        result.changed++;
                    }
                    current.remove(in);
                    break;
                }
                if (in == current.size() - 1) {
                    result.deleted++;
                }
            }
        }
        result.added = current.size();
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