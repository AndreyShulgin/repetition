package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class OrderConvert {

    /**
     * Метод конвертирует List в HashMap
     * @param orders - список List
     * @return возвращает HashMap
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}