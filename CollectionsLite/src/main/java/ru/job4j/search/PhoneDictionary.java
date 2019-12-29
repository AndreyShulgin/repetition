package ru.job4j.search;

import java.util.ArrayList;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class PhoneDictionary {
    /**
     * Список объектов Person
     */
    private ArrayList<Person> persons = new ArrayList<>();

    /**
     * Добавляет объект Person в список
     * @param person - объект
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person.getSurname().contains(key)
                    || person.getPhone().contains(key)
                    || person.getName().contains(key)
                    || person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}