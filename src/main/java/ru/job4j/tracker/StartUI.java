package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = false;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Showing all items ====");
                Item[] inputArray = tracker.findAll();
                System.out.println(inputArray);
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                boolean one = true;
                int id = 0;
                while (one) {
                    System.out.println("Enter id of changed item:");
                    id = Integer.valueOf(scanner.nextLine());
                    if (id > 0) {
                        one = !one;
                    } else {
                        System.out.println("Invalid id");
                    }
                }
                System.out.println("Enter the name of the replaced item");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                tracker.replace(id, newItem);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
