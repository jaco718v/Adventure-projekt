/*package com.company;

public class ThrownWeapon extends Weapon {
    public ThrownWeapon(String shortID, int combatDMG, boolean occupant, boolean illegal, String effect, String name, String itemDescription) {
        super(shortID, combatDMG, occupant, illegal, effect, name, itemDescription);
    }

    public int throw(String secondWord) {
        Item thrown = engine.player.findInventoryItem(secondWord);
        engine.player.getInventory().remove(thrown);
        return combatDMG;
    }
    public AttackCase weaponEffect(){
        return AttackCase.ThrownWeapon;
    }
}*/