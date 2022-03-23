package com.company;

import java.util.ArrayList;

public class Item {
  private String shortID;
  //private int combatDMG;
  //private boolean consumable;
  //private boolean occupant;
  //private boolean illegal;
  //private String effect;      //expand this with object variable, ignition, healing, power boost, etc.
  //private itemVar objectVariable;
  private String itemName;
  private String itemDescription;

  public Item(String shortID, String itemName, String itemDescription){
    this.shortID=shortID;
    this.itemName=itemName;
    this.itemDescription=itemDescription;
  }
  public String getItemName() { return itemName; }
}
