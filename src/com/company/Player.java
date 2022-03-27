package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private int health = 100;
  private ArrayList<Item> inventory = new ArrayList<Item>();
  private Weapon equippedWeapon;
  private int insight;                                      // insight increments when:
  // a Slab is currently in the correct socket (+3)
  // Inscription over the door is read (permanent + 2)
  // Coded Scroll decrypted (permanent +1)
  // room1 is searched (permanent +1)

  public Player(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public HpCase hpStatus(){
      if( health>30){
        return HpCase.Unhurt;}
      else if (health>26){
        return HpCase.Bruised;}
      else if (health>21){
        return HpCase.Wounded;}
      else if (health>15){
        return HpCase.Injured;}
      else if (health>10){
        return HpCase.Crippled;}
      else if (health>4){
        return HpCase.Bleeding;}
      else return HpCase.Critical;
    }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public void setInventory(ArrayList<Item> inventory) { this.inventory = inventory; }

  public boolean goDirection(Room direction, Player player) {
    if (!(direction == null)) {
      player.setCurrentRoom(direction);
    } else {
      return false;
    }
    return true;
  }

  public boolean takeItem(String itemName) {
    Item itemFound = currentRoom.findRoomItem(itemName);
    if (itemFound != null) {
      currentRoom.getRoomItems().remove(itemFound);
      inventory.add(itemFound);
      return true;
    }
    return false;
  }

  public Item findInventoryItem(String itemName) {
    for (int i = 0; i < getInventory().size(); i++) {
      if (itemName.equalsIgnoreCase(getInventory().get(i).getItemName())) {
        return inventory.get(i);
      }
    }
    return null;
  }

  public boolean dropItem(String itemName) {
    Item itemFound = findInventoryItem(itemName);
    if (itemFound != null) {
      getCurrentRoom().addRoomItem(itemFound);
      getInventory().remove(itemFound);
      return true;
    }
    return false;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public void eatFood(ArrayList<Item> foodLocation,Food food) {
    int foodEffekt = food.eatFood(foodLocation,food);
    health =+ foodEffekt;
    if (health < 100) {
      health = 100;
    }
  }

  public EquipCase equipWeapon(String itemName){
    Item itemFound = findInventoryItem(itemName);
    if(itemFound instanceof Weapon weapon){
      if(equippedWeapon!=null){
        inventory.add(equippedWeapon);
      }
      equippedWeapon=weapon;
      inventory.remove(itemFound);
      return EquipCase.EQUIPPED;
    }
    if(itemFound==null){
      return EquipCase.NOTFOUND;
    }
    return EquipCase.NOTEQUIPPED;
  }

  public AttackCase attack(){
    if(equippedWeapon!=null){
      if(equippedWeapon.ammoLeft()==0){
        return AttackCase.NoAmmo;
      }
      int damageDealt = equippedWeapon.attack();
      return equippedWeapon.weaponEffect();
    }
    return AttackCase.Empty;
  }

  public int getHealth() {
    return health;
  }

  public Weapon getEquippedWeapon() {
    return equippedWeapon;
  }
}



