package com.company;

public abstract class Weapon extends Item {
  protected int combatDMG;

  public Weapon(String shortID, String itemName, String itemDescription, int combatDMG){
    super(shortID,itemName,itemDescription);
    this.combatDMG=combatDMG;
  }

  public abstract int attack();

  public abstract int ammoLeft();

  public abstract attacking weaponEffect();
}
