package ru.job4j.collection;

import java.util.HashSet;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UsageHashSet {

    public static void main(String[] args) {
        HashSet<String> autos = new HashSet<>();
        autos.add("Lada");
        autos.add("BMV");
        autos.add("Volvo");
        autos.add("Toyouta");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
