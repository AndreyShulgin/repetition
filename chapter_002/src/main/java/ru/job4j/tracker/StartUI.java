package ru.job4j.tracker;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class StartUI {

    /**
     * Метод обеспечивает работу в меню трекера
     * @param input - работа с входными данными
     * @param tracker - объект трекера
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAllItems(tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
               StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Создание заявки
     * @param input - входные данные
     * @param tracker - объект трекера
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.add(item);
    }

    /**
     * Метод отображает все заявки
     * @param tracker - объект трекера
     */
    public static void showAllItems(Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items =  tracker.findAll();
        for (Item itm : items) {
            System.out.println("Item name : " + itm.getName() + " Item ID: " + itm.getId());
        }
    }

    /**
     * Метод ищет заявку по ID и заменяет ей название
     * @param input - входные данные
     * @param tracker - объект трекера
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter ID: ");
        Item item = new Item(input.askStr("Enter name: "));
        tracker.replace(id, item);
    }

    /**
     * Метод ищет по ID и удаляет заявку
     * @param input - входные данные
     * @param tracker - объект трекера
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        tracker.delete(input.askStr("Enter ID: "));
    }

    /**
     * Метод ищет заявку по ID и вывод на консоль имя этой заявки
     * @param input - входные данные
     * @param tracker - объект трекера
     */
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        Item item = tracker.findById(input.askStr("Enter ID: "));
        if (item != null) {
            System.out.println("Item name: " + item.getName());
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * Метод ищет заявки по имени, если находит, то выводит их ID
     * @param input - входные данные
     * @param tracker - объект трекера
     */
    public static void findItemByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        Item[] items = tracker.findByName(input.askStr("Enter name: "));
        if (items != null) {
            for (Item item : items) {
                System.out.println(item.getId());
            }
        } else {
            System.out.println("Item not found");
        }
    }

    /**
     * Метод отображения меню
     */
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    /**
     * Метод запуска программы
     * @param args - args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}