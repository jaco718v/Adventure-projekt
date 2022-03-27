package com.company;

public class RangedWeapon extends Weapon{
  private int ammo;

  public RangedWeapon(String shortID,int combatDMG,int ammo,boolean occupant, boolean illegal, String effect,String itemName,String itemDescription){
    super(shortID, combatDMG, occupant, illegal, effect, itemName, itemDescription);
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

  public AttackCase weaponEffect(){
    return AttackCase.RangedWeapon;
  }
}
