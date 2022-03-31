package com.company;

public class RangedWeapon extends Weapon{
  private int ammo;

  public RangedWeapon(String shortID,int weaponDMG,int ammo,boolean occupant, boolean illegal, String effect,String itemName,String itemDescription){
    super(shortID, weaponDMG, occupant, illegal, effect, itemName, itemDescription);
    this.ammo=ammo;
  }

  public int attack() {
    if(ammo>0){
    ammo--;
    return weaponDMG;
    }
   return 0;
  }

  public int ammoLeft() {
    return ammo;
  }

  public AttackCase weaponEffect(){
    return AttackCase.RangedWeaponMiss;
  }
}
