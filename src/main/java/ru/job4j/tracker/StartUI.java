package ru.job4j.tracker;


public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                String name = input.askStr("Enter name: ");
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
                id = input.askInt("Enter id of changed item: ");
                String name = input.askStr("Enter the name of the replaced item: ");
                Item newItem = new Item(name);
                if (tracker.replace(id, newItem)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                int id = 0;
                id = input.askInt("Enter id of deleting item: ");
                if (tracker.delete(id)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failure");
                }
            } else if (select == 4) {
                int id = 0;
                System.out.println("=== Find item by Id ===");
                id = input.askInt("Enter the id of the element you want to find: ");
                Item foundItem = tracker.findById(id);
                if (foundItem == null) {
                    System.out.println("Item with current id not found");
                } else {
                    System.out.println(foundItem);
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter a name of elements you want to find: ");
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
            } else {
                System.out.println("Unknown command");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
