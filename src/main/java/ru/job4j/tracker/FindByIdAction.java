package ru.job4j.tracker;

public class FindByIdAction implements UserAction{
    @Override
    public String name() {
        return "Find item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        int id = input.askInt("Enter the id of the element you want to find: ");
        Item foundItem = tracker.findById(id);
        if (foundItem == null) {
            System.out.println("Item with current id not found");
        } else {
            System.out.println(foundItem);
        }
        return true;
    }
}
