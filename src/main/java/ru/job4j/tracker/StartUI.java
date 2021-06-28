package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Created element is: " + item);
            } else if (select == 1) {
                System.out.println("=== Showing all items ===");
                Item[] inputArray = tracker.findAll();
                if (inputArray.length > 0) {
                    for (Item example : inputArray) {
                        System.out.println(example);
                    }
                } else {
                    System.out.println("Tracker is empty");
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                int id = 0;
                System.out.println("Enter id of changed item: ");
                id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter the name of the replaced item: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                int id = 0;
                System.out.println("Enter id of deleting item: ");
                id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }
            } else if (select == 4) {
                int id = 0;
                System.out.println("=== Find item by Id ===");
                System.out.println("Enter the id of the element you want to find: ");
                id = Integer.parseInt(scanner.nextLine());
                Item foundItem = tracker.findById(id);
                if (foundItem == null) {
                    System.out.println("Item with current id not found");
                } else {
                    System.out.println(foundItem);
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.println("Enter a name of elements you want to find: ");
                String name = scanner.nextLine();
                Item[] array = tracker.findByName(name);
                if (array.length > 0) {
                    for (Item example : array) {
                        System.out.println(example);
                    }
                } else {
                    System.out.println("Items with current name not found");
                }
            } else if (select == 6) {
                run = false;
            }
        }

    }

    private void showMenu() {
        System.out.println("Menu:");
        String[] menu = {"0. Add new Item", "1. Show all items", "2. Edit item",
                "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit Program"};
        for (String s : menu) {
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
