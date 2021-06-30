package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Showing all items ===");
        Item[] inputArray = tracker.findAll();
        if (inputArray.length > 0) {
            for (Item example : inputArray) {
                System.out.println(example);
            }
        } else {
            System.out.println("Tracker is empty");
        }
        return true;
    }
}
