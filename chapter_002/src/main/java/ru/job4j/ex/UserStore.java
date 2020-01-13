package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UserStore {

    /**
     * Метод для поиска пользователя по Логину
     * @param users - список пользователей
     * @param login - Имя пользователя
     * @return - Пользователь
     * @throws UserNotFoundException - если пользователь не найден выкинуть исключение
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
            }
        }
        if (result == null) {
            throw new UserNotFoundException("Пользователь не найден");
        }
        return result;
    }

    /**
     * Метод проверяет данные пользователя
     * @param user - пользователь
     * @return - true если данные верны
     * @throws UserInvalidException - если не верны выкинуть ошибку
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("Данные не верны");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}