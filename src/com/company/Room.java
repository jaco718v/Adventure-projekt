package com.company;

import java.util.ArrayList;

public class Room {
  private String name;
  private String beskrivelse;
  private String recap;
  private String searchString;
  private boolean searched = false;
  private Room north;
  private Room east;
  private Room south;
  private Room west;
  private ArrayList<Item> roomItems = new ArrayList<>();
  private boolean explored;

  public Room(String name, String beskrivelse, String searchString, String recap, ArrayList<Item> roomItems){
    this.name=name;
    this.beskrivelse=beskrivelse;
    this.recap=recap;
    this.roomItems=roomItems;
  }
  public void setRoomItems(){ this.roomItems = roomItems; }

  public void printRoomInventory(ArrayList<Item> roomItems) {
    for (int i = 0; i < roomItems.size(); i++) {
      if (i %6 == 0) {
        System.out.printf("\n");
      }
      System.out.printf(roomItems.get(i).getItemName() + "\t");
    }
  }
  public Room getWest() {
    return west;
  }

  public Room getNorth() {
    return north;
  }

  public Room getSouth() {
    return south;
  }

  public Room getEast() {
    return east;
  }

  public String getBeskrivelse() {
    return beskrivelse;
  }

  public void setEast(Room east) {
    this.east = east;
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setWest(Room west) {
    this.west = west;
  }

  public boolean isExplored() {
    return explored;
  }

  public String getRecap() {
    return recap;
  }

  public String getSearchString() { return searchString; }

  public void setExplored(boolean explored) {
    this.explored = explored;
  }

  public ArrayList<Item> getRoomItems() {
    return roomItems;
  }
}
