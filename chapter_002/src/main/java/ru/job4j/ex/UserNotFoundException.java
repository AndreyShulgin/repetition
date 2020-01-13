package ru.job4j.ex;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class UserNotFoundException extends Exception {

    public UserNotFoundException(String message) {
        super(message);
    }
}
