package ru.job4j.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class User {
    /**
     * Данные паспорта
     */
    private String passport;
    /**
     * ФИО
     */
    private String name;

    /**
     * Список аккаунтов.
     */
    private List<Account> accountList = new ArrayList<>();

    public List<Account> getAccountList() {
        return accountList;
    }

    public User(String passport, String name) {
        this.passport = passport;
        this.name = name;
    }

    public String getPassport() {
        return passport;
    }

    public String getName() {
        return name;
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
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
