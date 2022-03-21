package com.company;

import java.util.ArrayList;

public class Room {
  private String name;
  private String description;
  private String recap;
  private String search;
  private Room north;
  private Room east;
  private Room south;
  private Room west;
  private ArrayList<Item> roomItems = new ArrayList<Item>();
  private boolean explored;

  public Room(String name, String beskrivelse,String search, String recap){
    this.name=name;
    this.description =beskrivelse;
    this.search=search;
    this.recap=recap;
  }

  public Item findItem(String itemName){
    for(int i = 0;i<getRoomItems().size(); i++) {
      if (itemName.equalsIgnoreCase(getRoomItems().get(i).getItemName())) {
        Item itemFound = getRoomItems().get(i);
        getRoomItems().remove(i);
        return itemFound;
      }
    }
    return null;
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

  public String getDescription() {
    return description;
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

  public void setExplored(boolean explored) {
    this.explored = explored;
  }

  public void addRoomItem(Item roomItem){
    this.roomItems.add(roomItem);
  }

  public ArrayList<Item> getRoomItems() {
    return roomItems;
  }

  public String getSearch() {
    return search;
  }
}
