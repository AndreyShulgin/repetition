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
        userAccounts.putIfAbsent(user, user.getAccountList());
    }

    /**
     * Удаление пользователя
     * @param user - пользователь
     */
    public void deleteUser(User user) {
        userAccounts.remove(user);
    }

    /**
     * Добавить счет пользователю
     * @param passport - паспорт пользовотеля
     * @param account - новый счет
     */
    public void addAccountToUser(String passport, Account account) {
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                user.getAccountList().add(account);
            }
        }
    }

    /**
     * Удаление одного счета пользовотеля
     * @param passport - паспорт пользовотеля
     * @param account - счет который нужно удалить
     */
    public void deleteAccountFromUser(String passport, Account account) {
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                user.getAccountList().remove(account);
            }
        }
    }

    /**
     * Получить список счетов для пользовотеля
     * @param passport - паспорт пользовотеля
     * @return - список счетов
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> result = null;
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user.getAccountList();
            }
        }
        return result;
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
        boolean result = false;
        Account srcAccount = getAcc(srcPassport, srcRequisite);
        Account destAccount = getAcc(destPassport, dstRequisite);
        if (srcAccount != null && destAccount != null & srcAccount.getValue() >= amount) {
            srcAccount.setValue(srcAccount.getValue() - amount);
            destAccount.setValue(destAccount.getValue() + amount);
            result = true;
        }
        return result;
    }

    /**
     * Поиск аккаунта по паспорту и реквизитам
     * @param passport - паспорт
     * @param requisite - реквизиты
     * @return - если нет аккаунта вернуть null
     */
    private Account getAcc(String passport, String requisite) {
        Account account = null;
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                for (Account acc : user.getAccountList()) {
                    if (acc.getRequisites().equals(requisite)) {
                        account = acc;
                    }
                }
            }
        }
        return account;
    }
}
