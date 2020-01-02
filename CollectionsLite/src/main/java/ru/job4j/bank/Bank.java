package ru.job4j.bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Bank {

    public Map<User, List<Account>> userAccounts = new HashMap<>();

    /**
     * Добавлекние пользователя
     * @param user - пользователь
     */
    public void addUser(User user) {

    }

    /**
     * Удаление пользователя
     * @param user - пользователь
     */
    public void deleteUser(User user) {

    }

    /**
     * Добавить счет пользователю
     * @param passport - паспорт пользовотеля
     * @param account - новый счет
     */
    public void addAccountToUser(String passport, Account account) {

    }

    /**
     * Удаление одного счета пользовотеля
     * @param passport - паспорт пользовотеля
     * @param account - счет который нужно удалить
     */
    public void deleteAccountFromUser(String passport, Account account) {

    }

    /**
     * Получить список счетов для пользовотеля
     * @param passport - паспорт пользовотеля
     * @return - список счетов
     */
    public List<Account> getUserAccounts(String passport) {
        return null;
    }

    /**
     * Метод для перечисления денег с одного счёта на другой счёт.
     * @param srcPassport - паспорт пользовотеля со счета которого будет перевод
     * @param srcRequisite - Реквизиты счета с которого будет перевод
     * @param destPassport - паспорт пользовотеля которому будет осуществлен перевод
     * @param dstRequisite - реквизиты счета на который будет происходить перевод
     * @param amount - количество денег для перевода
     * @return если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String dstRequisite, double amount) {
        return false;
    }

}
