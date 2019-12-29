package ru.job4j.tracker;

import java.util.ArrayList;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show all items";
    }

    /**
     * Метод отображает все заявки
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        ArrayList<Item> items =  tracker.findAll();
        for (Item item : items) {
            System.out.println("Item name : " + item.getName() + " Item ID: " + item.getId());
        }
        return true;
    }
}
