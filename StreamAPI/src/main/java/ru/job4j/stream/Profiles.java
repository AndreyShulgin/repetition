package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Profiles {

    /**
     * Метод из списка профилей делает список адресов отсортированный по полю Город и без повторений
     * @param profiles - список профилей
     * @return - список адресов
     */
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .distinct()
                .sorted(Comparator.comparing(Address::getCity))
                .collect(Collectors.toList());
    }
}
