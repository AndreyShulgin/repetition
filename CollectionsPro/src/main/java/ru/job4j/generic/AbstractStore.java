package ru.job4j.generic;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public abstract class AbstractStore<T extends Base> implements Store<T> {
    private SimpleArray<T> simpleArray = new SimpleArray<>(100);

    /**
     * Метод добавляет в список объект
     * @param model - объект
     */
    public void add(T model) {
        simpleArray.add(model);
    }

    /**
     * Метод в списке меняет объект по его ключу
     * @param id - ключ
     * @param model - новый объект
     * @return - true если объект изменен
     */
    public boolean replace(String id, T model) {
        boolean result = false;
        var index = 0;
        for (T usr : simpleArray) {
            if (usr.getId().equals(id)) {
                simpleArray.set(index, model);
                result = true;
                break;
            }
            index++;
        }
        return result;
    }

    /**
     * Метод удаляет объект из списка по ключу
     * @param id - ключ
     * @return - true если объект был удален
     */
    public boolean delete(String id) {
        boolean result = false;
        var index = 0;
        for (T usr : simpleArray) {
            if (usr.getId().equals(id)) {
                simpleArray.remove(index);
                result = true;
                break;
            }
            index++;
        }
        return result;
    }

    /**
     * Метод поиска Объекта по ключу
     * @param id - ключ
     * @return - Возвращает объект, если его в списке нет возвращает null
     */
    public T findById(String id) {
        T result = null;
        for (T usr : simpleArray) {
            if (usr.getId().equals(id)) {
                result = usr;
                break;
            }
        }
        return result;
    }
}
