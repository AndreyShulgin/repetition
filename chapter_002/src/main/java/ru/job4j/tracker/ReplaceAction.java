package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class ReplaceAction implements UserAction {

    @Override
    public String name() {
        return "Edit item";
    }

    /**
     * Метод ищет заявку по ID и заменяет ей название
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter ID: ");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.replace(id, item);
        return true;
    }
}
