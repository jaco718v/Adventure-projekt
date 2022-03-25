package com.company;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String shortID, String itemName, String itemDescription, int combatDMG, int ammo){
    super(shortID,itemName,itemDescription,combatDMG);
  }

  public int attack() {
    return combatDMG;
  }

  public int ammoLeft() {
    return -1;
  }

  public attacking weaponEffect(){
    return attacking.MeleeSwing;
  }
}
