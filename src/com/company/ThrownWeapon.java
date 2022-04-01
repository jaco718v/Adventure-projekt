package com.company;

import java.util.ArrayList;

public class ThrownWeapon extends Item {
    int weaponDMG;

    public ThrownWeapon(String shortID, int weaponDMG, boolean occupant, boolean illegal, String effect, String name, String itemDescription) {
        super(shortID, occupant, illegal, effect, name, itemDescription);
        this.weaponDMG=weaponDMG;
    }

    public int yeet(ArrayList<Item> inventory, ThrownWeapon weaponisedItem) {
        Item yeeted = weaponisedItem;
        inventory.remove(yeeted);
        return weaponDMG;
    }
    public AttackCase weaponEffect(){
        return AttackCase.ThrownWeaponMiss;
    }
}