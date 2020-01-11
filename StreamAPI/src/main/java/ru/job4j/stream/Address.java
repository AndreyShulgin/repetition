package ru.job4j.stream;

import java.util.Objects;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Address {

    /**
     * Город
     */
    private String city;
    /**
     * Улица
     */
    private String street;
    /**
     * Номер дома
     */
    private int home;
    /**
     * Номер квартиры
     */
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home && apartment == address.apartment
                && Objects.equals(city, address.city)
                && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }
}