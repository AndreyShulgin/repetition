package ru.job4j.profession;

import java.util.Date;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Profession {

    private String name;
    private String surname;
    private String education;
    private Date birthday;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public Date getBirthday() {
        return birthday;
    }
}
