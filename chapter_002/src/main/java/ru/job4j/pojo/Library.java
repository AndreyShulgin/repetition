package ru.job4j.pojo;

/**
 * @author Andrey Shulgin (neonod404@gmail.com)
 */
public class Library {

    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book first = new Book("Clean code", 300);
        Book second = new Book("Harry Potter", 450);
        Book third = new Book("The lord of the rings", 600);
        Book four = new Book("Secret", 230);
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = four;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        Book five = books[0];
        books[0] = books[3];
        books[3] = five;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

        for (Book bk : books) {
            if (bk.getName().equals("Clean code")) {
                System.out.println(bk.getName() + " - " + bk.getCount());
            }
        }

    }
}
