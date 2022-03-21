package com.company;

import java.util.ArrayList;

public class Item {
  private String itemName;
  private String itemDescription;

  public Item(String itemName, String itemDescription){
    this.itemName=itemName;
    this.itemDescription=itemDescription;
  }

  public ArrayList<Item> buildItems() {
    ArrayList<Item> allItems = new ArrayList<>();
    Item item1 = new Item("Rock", "It's a palm-sized rock.");
    Item item2 = new Item("Club", "A Ceremonial Club. Doesn't seem sturdy enough to be used as a weapon.");
    Item item3 = new Item("Torch", "Empty torch. The wick still feels oily, though.");
    Item item4 = new Item("Rope", "It's the rope, that Gabriel brought with him, for some reason...");

    allItems.add(item1);
    allItems.add(item2);
    allItems.add(item3);
    allItems.add(item4);
    return allItems;
  }
  public String getItemName() {
    return itemName;
  }
}
