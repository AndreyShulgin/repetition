package ru.job4j.bank;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BankTest {

    @Test
    public void addUser() {
        Bank bank = new Bank();
        User user = new User("1234", "Andrey");
        bank.addUser(user);
        assertThat(bank.userAccounts.values().contains(user.getAccountList()), is(true));
    }

    @Test
    public void deleteUser() {
        Bank bank = new Bank();
        User user = new User("1234", "Andrey");
        bank.addUser(user);
        bank.deleteUser(user);
        assertThat(bank.userAccounts.keySet().contains(user), is(false));
    }

    @Test
    public void addAccountToUser() {
        Bank bank = new Bank();
        User user = new User("1234", "Andrey");
        Account account = new Account(5, "req");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        assertThat(user.getAccountList().get(0).getRequisites(), is("req"));
    }

    @Test
    public void deleteAccountFromUser() {
        Bank bank = new Bank();
        User user = new User("1234", "Andrey");
        Account account = new Account(5, "req");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        bank.deleteAccountFromUser(user.getPassport(), account);
        assertThat(user.getAccountList().contains(account), is(false));
    }

    @Test
    public void getUserAccounts() {
        Bank bank = new Bank();
        User user = new User("1234", "Andrey");
        Account account = new Account(5, "req");
        bank.addUser(user);
        bank.addAccountToUser(user.getPassport(), account);
        List<Account> result = bank.getUserAccounts(user.getPassport());
        assertThat(result.get(0).getRequisites(), is("req"));
    }

    @Test
    public void transferMoneyTrue() {
        Bank bank = new Bank();
        User user1 = new User("1111", "Andrey");
        Account account1 = new Account(10, "req1");
        User user2 = new User("2222", "Alex");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        boolean result = bank.transferMoney("1111", "req1", "2222", "req2", 3);
        assertThat(result, is(true));

    }

    @Test
    public void transferMoneyFalse() {
        Bank bank = new Bank();
        User user1 = new User("1111", "Andrey");
        Account account1 = new Account(10, "req1");
        User user2 = new User("2222", "Alex");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        boolean result = bank.transferMoney("1111", "req1", "2222", "req2", 12);
        assertThat(result, is(false));
    }

    @Test
    public void whenTransferMoneyThenAccountNotFound() {
        Bank bank = new Bank();
        User user1 = new User("Andrey", "1111");
        Account account1 = new Account(10, "req1");
        User user2 = new User("Alex", "2222");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        boolean result = bank.transferMoney("1111", "req3", "2222", "req2", 3);
        assertThat(result, is(false));
    }

    @Test
    public void whenTransferMoneyThenUserNotFound() {
        Bank bank = new Bank();
        User user1 = new User("Andrey", "1111");
        Account account1 = new Account(10, "req1");
        User user2 = new User("Alex", "2222");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        boolean result = bank.transferMoney("3333", "req1", "2222", "req2", 3);
        assertThat(result, is(false));
    }

    @Test
    public void whenTransferMoneyValue10ThenValue7() {
        Bank bank = new Bank();
        User user1 = new User("Andrey", "1111");
        Account account1 = new Account(10, "req1");
        User user2 = new User("Alex", "2222");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        bank.transferMoney("1111", "req1", "2222", "req2", 3);
        assertThat(user1.getAccountList().get(0).getValue(), is(7.0));
    }

    @Test
    public void whenTransferMoneyValue5ThenValue8() {
        Bank bank = new Bank();
        User user1 = new User("Andrey", "1111");
        Account account1 = new Account(10, "req1");
        User user2 = new User("Alex", "2222");
        Account account2 = new Account(5, "req2");
        bank.addUser(user1);
        bank.addUser(user2);
        bank.addAccountToUser("1111", account1);
        bank.addAccountToUser("2222", account2);
        bank.transferMoney("1111", "req1", "2222", "req2", 3);
        assertThat(user2.getAccountList().get(0).getValue(), is(8.0));
    }
}