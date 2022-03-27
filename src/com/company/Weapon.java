package com.company;

public abstract class Weapon extends Item {
  protected int combatDMG;

  public Weapon(String shortID, int combatDMG, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription) {
    super(shortID, occupant, illegal, effect, itemName, itemDescription);
    this.combatDMG=combatDMG;
  }

  public abstract int attack();

  public abstract int ammoLeft();

  public abstract AttackCase weaponEffect();
}
