package com.company;

public class Food extends Item {
  private int effectHeal;
  public Food(String shortID, String name, String itemDescription,int effectHeal){
    super(shortID,name,itemDescription);
    this.effectHeal=effectHeal;
  }

  public int getEffectHeal() {
    return effectHeal;
  }
}
