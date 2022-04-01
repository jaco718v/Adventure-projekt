package com.company;

import java.util.ArrayList;

public class Container extends Item {
    private boolean locked;
    private boolean envelope;
    private ArrayList<Item> content = new ArrayList<>();

    public Container(String shortID, boolean occupant, boolean illegal, boolean locked, String effect, String name, String itemDescription) {
        super(shortID, occupant, illegal, effect, name, itemDescription);
        this.locked=locked;
        this.envelope=envelope;
        this.content=content;
    }
    public boolean isEnvelope() { return envelope; }
    public boolean getLocked() { return locked; }
    public ArrayList<Item> getContent() { return content; }

    public void openContainer(ArrayList<Item> containerLocation, Container container) {
        for (Item item : container.getContent()) {
            containerLocation.add(item);
        }
        if (this.envelope) {
            containerLocation.remove(container);
        }
    }

    public void addContainedItem(Item itemName) {
        content.add(itemName);
    }
}
