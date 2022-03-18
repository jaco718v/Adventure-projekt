package com.company;

import java.util.ArrayList;

public class Room {
  private String name;
  private String beskrivelse;
  private String recap;
  private Room north;
  private Room east;
  private Room south;
  private Room west;
  private ArrayList<Item> roomItems = new ArrayList<Item>();
  private boolean explored;

  public Room(String name, String beskrivelse,String recap){
    this.name=name;
    this.beskrivelse=beskrivelse;
    this.recap=recap;
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

  public void setExplored(boolean explored) {
    this.explored = explored;
  }

  public void addRoomItem(Item roomItem){
    this.roomItems.add(roomItem);
  }

  public ArrayList<Item> getRoomItems() {
    return roomItems;
  }
}
