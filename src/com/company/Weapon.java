package com.company;

public abstract class Weapon extends Item {
  protected int weaponDMG;

  public Weapon(String shortID, int weaponDMG, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription) {
    super(shortID, occupant, illegal, effect, itemName, itemDescription);
    this.weaponDMG = weaponDMG;
  }

  public abstract int attack();

  public abstract int ammoLeft();

  public abstract AttackCase weaponEffect();

  public int getWeaponDMG() {
    return weaponDMG;
  }
}
