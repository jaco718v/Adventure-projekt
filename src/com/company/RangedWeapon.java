package com.company;

public class RangedWeapon extends Weapon{
  private int ammo;

  public RangedWeapon(String shortID, String itemName, String itemDescription, int combatDMG, int ammo){
    super(shortID,itemName,itemDescription,combatDMG);
    this.ammo=ammo;
  }

  public int attack() {
    if(ammo>0){
    ammo--;
    return combatDMG;
    }
    return 0;
  }

  public int ammoLeft() {
    return ammo;
  }
}
