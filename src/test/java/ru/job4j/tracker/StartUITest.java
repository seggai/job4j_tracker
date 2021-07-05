package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[] {"0", "Item name", "1"}
        );
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new EditAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction()
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu:" + System.lineSeparator() +
                        "0. Exit" + System.lineSeparator()
        ));
    }
    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item x = new Item("azaza");
        Item y = new Item("qwerty");
        tracker.add(x);
        tracker.add(y);
        Input in = new StubInput(
                new String[] {"0", "1"}
        );
        UserAction[] actions = {
                new ShowAllAction(out), new ExitAction()
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() +"0. Show all items" + System.lineSeparator() + "1. Exit" +
                System.lineSeparator() + "=== Showing all items ===" + System.lineSeparator() +
                x + System.lineSeparator() +
                y + System.lineSeparator() +
                "Menu:" + System.lineSeparator() +"0. Show all items" + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }
    @Test
    public void whenFindById() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item x = new Item("azaza");
        Item y = new Item("qwerty");
        tracker.add(x);
        tracker.add(y);
        Input in = new StubInput( new String[] {"0", String.valueOf(y.getId()), "1"});
        UserAction[] actions = { new FindByIdAction(out), new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(is("Menu:" + System.lineSeparator() +"0. Find item by Id" + System.lineSeparator() + "1. Exit" +
                System.lineSeparator() + "=== Find item by Id ===" +
                System.lineSeparator() + y + System.lineSeparator() +
                "Menu:" + System.lineSeparator() +"0. Find item by Id" + System.lineSeparator() + "1. Exit" + System.lineSeparator())));
    }
    @Test
    public void whenFindByName() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item x = new Item("qwerty");
        Item y = new Item("azaza");
        tracker.add(x);
        tracker.add(y);
        Input in = new StubInput( new String[] {"0", "azaza", "1"});
        UserAction[] actions = { new FindByNameAction(out), new ExitAction()};
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() +"0. Find items by name" + System.lineSeparator() + "1. Exit" +
                System.lineSeparator() + "=== Find items by name ===" +
                System.lineSeparator() + "Item{id=2, name='azaza'}" + System.lineSeparator() +
                "Menu:" + System.lineSeparator() +"0. Find items by name" + System.lineSeparator() + "1. Exit" + System.lineSeparator()));
    }
}
