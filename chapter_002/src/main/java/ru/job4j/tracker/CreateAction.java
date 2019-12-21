package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "Add new Item";
    }

    /**
     * Создание заявки
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.add(item);
        return true;
    }
}