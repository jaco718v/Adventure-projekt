package com.company;

import java.util.ArrayList;

public class Food extends Item {
  private int effectHeal;

  public Food(String shortID, String itemName, String itemDescription,int effectHeal){
    super(shortID,itemName,itemDescription);
    this.effectHeal=effectHeal;
  }

  public int eatFood(ArrayList<Item> foodLocation,Food food) {
    foodLocation.remove(food);
    return effectHeal;

  }
}
