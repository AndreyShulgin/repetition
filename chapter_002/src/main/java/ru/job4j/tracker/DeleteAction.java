package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    /**
     * Метод ищет по ID и удаляет заявку
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        tracker.delete(input.askStr("Enter ID: "));
        return true;
    }
}
