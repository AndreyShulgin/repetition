package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String message) {
        super(message);
    }
}
