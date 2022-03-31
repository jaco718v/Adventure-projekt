package com.company;

public class MeleeWeapon extends Weapon {

  public MeleeWeapon(String shortID, int weaponDMG, boolean occupant, boolean illegal, String effect, String itemName, String itemDescription){
    super(shortID, weaponDMG, occupant, illegal, effect, itemName, itemDescription);
  }

  public int attack() {
    return weaponDMG;
  }

  public int ammoLeft() {
    return -1;
  }

  public AttackCase weaponEffect(){
    return AttackCase.MeleeSwingMiss;
  }
}
