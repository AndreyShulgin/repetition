package ru.job4j.pojo;

import java.util.Date;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Student {

    /**
     * ФИО
     */
    private String name;
    /**
     * Группа
     */
    private int group;
    /**
     * Дата поступления
     */
    private Date entrance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }
}
