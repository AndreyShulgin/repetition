package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by Id";
    }

    /**
     * Метод ищет заявку по ID и вывод на консоль имя этой заявки
     * @param input - входные данные
     * @param tracker - объект трекера
     * @return - продолжение работы цикла
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        Item item = tracker.findById(input.askStr("Enter ID: "));
        if (item != null) {
            System.out.println("Item name: " + item.getName());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
