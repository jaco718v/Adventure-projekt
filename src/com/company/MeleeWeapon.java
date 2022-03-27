package com.company;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String shortID, int combatDMG, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription){
    super(shortID, combatDMG, occupant, illegal, effect, itemName, itemDescription);
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
