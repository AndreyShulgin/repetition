package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class FindEl {

    /**
     * Метод для поиска индекса в массиве по ключу
     * @param value - массив
     * @param key - ключ
     * @return - индекс ключа
     * @throws ElementNotFoundException - если в массиве нет элемнта key, то вызвать исключение
     */
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] names = {"Andrey", "Alex", "Mariya"};
        try {
            System.out.println(FindEl.indexOf(names, "Alex"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}