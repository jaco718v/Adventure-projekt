package com.company;

import java.util.ArrayList;

public class Container extends Item {
    ArrayList<Item> content = new ArrayList<>();

    public Container(String shortID, boolean occupant, boolean illegal, String effect, String name, String itemDescription) {
        super(shortID, occupant, illegal, effect, name, itemDescription);
        this.content = content;
    }

    public ArrayList<Item> getContent() {
        return content;
    }

    public void addContainedItem(Item itemName) {
        content.add(itemName);
    }
}
