package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book bible = new Book("Bible", 777);
        Book kek = new Book("Kek", 322);
        Book lol = new Book("Lol", 123);
        Book cleanCode = new Book("Clean code", 999);
        Book[] books = new Book[4];
        books[0] = bible;
        books[1] = kek;
        books[2] = lol;
        books[3] = cleanCode;
        for(Book write: books) {
            System.out.println(write.getName() + " - " + write.getPages());
        }
        Book change = books[0];
        books[0] = books[3];
        books[3] = change;
        System.out.println("Change [0] with [3]:");
        for(Book write: books) {
            System.out.println(write.getName() + " - " + write.getPages());
        }
        for(Book write: books) {
            if(write.getName().equals("Clean code")) {
                System.out.println(write.getName() + " - " + write.getPages());
            }
        }
    }
}
