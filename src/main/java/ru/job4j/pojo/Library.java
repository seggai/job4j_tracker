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
        for(int index = 0; index < books.length; index++) {
            Book write = books[index];
            System.out.println(write.getName() + " - " + write.getPages());
        }
        Book change = books[0];
        books[0] = books[3];
        books[3] = change;
        System.out.println("Change [0] with [3]:");
        for(int index = 0; index < books.length; index++) {
            Book write = books[index];
            System.out.println(write.getName() + " - " + write.getPages());
        }
        for(int index = 0; index < books.length; index++) {
            Book write2 = books[index];
            if(write2.getName() == "Clean code") {
                System.out.println(write2.getName() + " - " + write2.getPages());
            }
        }
    }
}
