package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private int Health = 100;
  private ArrayList<Item> inventory = new ArrayList<Item>();
  private int insight;                                      // insight increments when:
                                                            // a Slab is currently in the correct socket
                                                            // Inscription over the door is read (permanent + 1)

  public Player(Room currentRoom){
    this.currentRoom=currentRoom;
  }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }
  public boolean goDirection(Room direction, Player player) {
    if (!(direction == null)) {
      player.setCurrentRoom(direction);
    } else {
      return false;
    }
    return true;
  }

  public boolean pickUpItem(String itemName){
    for(int i = 0;i<getCurrentRoom().getRoomItems().size(); i++) {
      if (itemName.equalsIgnoreCase(getCurrentRoom().getRoomItems().get(i).getItemName())) {
        inventory.add(getCurrentRoom().getRoomItems().get(i));
        getCurrentRoom().getRoomItems().remove(i);
        return true;
      }
    }
      return false;
  }

  public boolean dropItem(String itemName){
    for(int i = 0;i< getInventory().size(); i++) {
      if (itemName.equalsIgnoreCase(getInventory().get(i).getItemName())) {
        getCurrentRoom().addRoomItem(getInventory().get(i));
        getInventory().remove(i);
        return true;
      }
    }
    return false;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

}



