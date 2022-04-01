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
  private ArrayList<PseudoItems> roomPseudos = new ArrayList<PseudoItems>();
  private ArrayList<Item> roomItems = new ArrayList<Item>();
  private boolean explored;
  private ArrayList<Enemy>  roomEnemies= new ArrayList<Enemy>();
  private String filePath;

  public Room(String name, String beskrivelse,String search, String recap, String filePath){
    this.name=name;
    this.description =beskrivelse;
    this.search=search;
    this.recap=recap;
    this.filePath=filePath;
  }
 /*
  public Room(String name, Room north, Room east, Room south, Room west) {    // This one is mainly for the baby, right now
    this.name=name;
    this.north=north;
    this.east=east;
    this.south=south;
    this.west=west;
  }*/

  public Item findRoomItem(String itemName){
    for(int i = 0;i<getRoomItems().size(); i++) {
      if (itemName.equalsIgnoreCase(getRoomItems().get(i).getItemName())) {
        return getRoomItems().get(i);
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

  public String getFilePath() {
    return filePath;
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

  public void addRoomEnemy(Enemy roomEnemy){
    this.roomEnemies.add(roomEnemy);
  }

  public void addRoomItem(PseudoItems roomItem){ this.roomPseudos.add(roomItem); }

  public ArrayList<Item> getRoomItems() {
    return roomItems;
  }
  public ArrayList<PseudoItems> getRoomPseudos() {
    return roomPseudos;
  }

  public ArrayList<Enemy> getRoomEnemies() {
    return roomEnemies;
  }

  public String getSearch() {
    return search;
  }
}
