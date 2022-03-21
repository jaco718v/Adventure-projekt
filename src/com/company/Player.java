package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private int Health = 100;
  private ArrayList<Item> inventory = new ArrayList<Item>();
  private int insight;                                      // insight increments when:
                                                            // +3, when a Slab is currently in the correct socket
                                                            // Inscription over the door is read (permanent + 2)
                                                            // Coded Scroll decrypted (permanent +1)
                                                            // 'search'  room1 (permanent +1)
                                                            // 'search' room11, 'take' SnekRod
  private int inblind;                                      // inblind is number of slabs in wrong place
                                                            // triggers spearTrap().



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

  public Item findItem(String soughtItem, ArrayList<Item> inventoryList) {
    Item foundItem = null;
    for (int i = 0; i <= inventoryList.size(); i++) {
      if (inventoryList.get(i).getItemName() == soughtItem) {
        foundItem = inventoryList.get(i);
        break;
      }
    } return foundItem;
  }
  public void takeItem(String soughtItem, ArrayList<Item> roomInventory, ArrayList<Item> playerInventory) {
    Item takenItem = findItem(soughtItem, getCurrentRoom().getRoomItems());
    inventory().add(takenItem);
    currentRoom().roomItems().remove(takenItem);
  }

  public void dropItem(String dropItem, ArrayList<Item> roomInventory, ArrayList<Item> playerInventory) {
    Item droppedItem = findItem(dropItem, inventory());
    currentRoom().roomItems().add(droppedItem);
    inventory().remove(droppedItem);
  }

  public String firstWordSplit(String word) {
    if (word.contains("take ")){
      return secondWordSplit(word);
    }
    if(word.contains(" ")) {
      return word.substring(0, word.indexOf(" "));
    }
    else return word;
  }

  public String secondWordSplit(String word) {
    if (word.contains(" ")) {
      return word.substring(word.indexOf(" ")+1);
    }
    else return word;
  }

}

/*
  public void pickUpItem(String itemName){
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
*/




