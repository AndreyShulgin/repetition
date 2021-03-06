package ru.job4j.bank;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Account {
    /**
     * Количество денег
     */
    private double value;
    /**
     * Банковский счет
     */
    private String requisites;

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }
}
