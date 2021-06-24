package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findByName(String key) {
        int sizeNew = 0;
        Item[] searchArray = new Item[size];
        for (int i = 0; i < size; i++) {
            if(items[i].getName().equals(key)) {
                searchArray[sizeNew++] = items[i];
            }
        }
        return Arrays.copyOf(searchArray, sizeNew);

    }

    public Item[] findAll() {
          return Arrays.copyOf(items, size);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if(index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
            return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if(index != -1) {
            System.arraycopy(items, index + 1, items, index, size - index - 1);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}