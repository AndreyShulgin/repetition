package ru.job4j.stream;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Profile {

    /**
     * Адрес в профиле
     */
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
