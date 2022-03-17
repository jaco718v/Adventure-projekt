package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private int Health = 100;
  //private ArrayList<String> inventory = new ArrayList<>;
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
}
