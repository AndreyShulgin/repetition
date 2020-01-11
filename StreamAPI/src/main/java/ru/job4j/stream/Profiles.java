package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Profiles {

    /**
     * Метод из списка профилей делает список адресов
     * @param profiles - список профилей
     * @return - список адресов
     */
    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }
}
