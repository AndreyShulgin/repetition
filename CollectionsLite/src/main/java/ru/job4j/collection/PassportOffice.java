package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод добавляет в список жителя
     * @param citizen - житель
     * @return - True если добавил, false если уже есть
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }


    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}