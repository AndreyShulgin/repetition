package ru.job4j.collection;

import java.util.*;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            StringBuilder start = new StringBuilder();
            for (String el : value.split("/")) {

                if (!start.toString().equals("")) {
                    tmp.add(start + "/" + el);
                    start.append("/").append(el);
                } else {
                    tmp.add(el);
                    start = new StringBuilder(el);
                }
            }
        }
        List<String> rst = new ArrayList<>(tmp);
        sortAsc(rst);
        return rst;
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        orgs.sort(new DepDescComp());
    }
}
