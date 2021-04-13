package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private int id;
    private String name;

    public Item() {
    }
   public Item(int id){
        this.id = id;
   }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }
}