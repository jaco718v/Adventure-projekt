package com.company;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String shortID, String itemName, String itemDescription, int combatDMG){
    super(shortID,itemName,itemDescription,combatDMG);
  }

  public int attack() {
    return combatDMG;
  }

  public int ammoLeft() {
    return -1;
  }

  public AttackCase weaponEffect(){
    return AttackCase.MeleeSwing;
  }
}
