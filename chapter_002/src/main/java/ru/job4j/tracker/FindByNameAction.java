package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find items by name";
    }

    /**
     * Метод ищет заявки по имени, если находит, то выводит их ID
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        Item[] items = tracker.findByName(input.askStr("Enter name: "));
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println("Item ID: " + item.getId());
            }
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
