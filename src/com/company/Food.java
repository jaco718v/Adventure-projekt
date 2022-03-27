package com.company;

import java.util.ArrayList;

public class Food extends Item {
  private int effectHeal;
  private int effectPoison;

  public Food(String shortID, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription,int effectHeal, int effectPoison){
    super(shortID,occupant,illegal,effect,itemName,itemDescription);
    this.effectHeal=effectHeal;
    this.effectPoison=effectPoison;
  }

  public int eatFood(ArrayList<Item> foodLocation,Food food) {
    foodLocation.remove(food);
    //engine.player.setPoison(effectPoison);
    return effectHeal;

  }
}
