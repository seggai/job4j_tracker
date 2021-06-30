package ru.job4j.tracker;

public class EditAction implements UserAction{
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        int id = input.askInt("Enter id of changed item: ");
        String name = input.askStr("Enter the name of the replaced item: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
        return true;
    }
}
