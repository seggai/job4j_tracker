package ru.job4j.tracker;

public class FindByNameAction implements UserAction{
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Find items by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find items by name ===");
        String name = input.askStr("Enter a name of elements you want to find: ");
        Item[] array = tracker.findByName(name);
        if (array.length > 0) {
            for (Item example : array) {
                out.println(example);
            }
        } else {
            out.println("Items with current name not found");
        }
        return true;
    }
}
