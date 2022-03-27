package com.company;

import java.util.ArrayList;

public class Item {
  protected String shortID;
  private boolean occupant;
  private boolean illegal;
  private String effect;      //expand this with object variable, ignition, healing, power boost, etc.
  //private itemVar objectVariable;
  protected String itemName;
  protected String itemDescription;

  public Item(String shortID, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription){
    this.shortID=shortID;
    this.occupant=occupant;
    this.illegal=illegal;
    this.itemName=itemName;
    this.itemDescription=itemDescription;
  }
  public String getItemName() { return itemName; }
  public String getItemDescription() { return itemDescription; }
}
