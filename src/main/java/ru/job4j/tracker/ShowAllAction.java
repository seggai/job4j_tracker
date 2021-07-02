package ru.job4j.tracker;

public class ShowAllAction implements UserAction{
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Showing all items ===");
        Item[] inputArray = tracker.findAll();
        if (inputArray.length > 0) {
            for (Item example : inputArray) {
                out.println(example);
            }
        } else {
            out.println("Tracker is empty");
        }
        return true;
    }
}
