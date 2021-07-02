package ru.job4j.tracker;

public class EditAction implements UserAction{
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ===");
        int id = input.askInt("Enter id of changed item: ");
        String name = input.askStr("Enter the name of the replaced item: ");
        Item newItem = new Item(name);
        if (tracker.replace(id, newItem)) {
            out.println("Success");
        } else {
            out.println("Failure");
        }
        return true;
    }
}
