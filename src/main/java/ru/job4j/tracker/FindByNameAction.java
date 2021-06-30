package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
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
        return true;
    }
}
