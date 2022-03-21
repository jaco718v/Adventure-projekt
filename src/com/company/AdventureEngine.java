package com.company;


import java.util.ArrayList;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);

  public void setRoomConnections() {
    map.setRoomConnections();
  }

  public void createItems() {
    map.createItems();
  }

  public String getNarrative() {
    if (player.getCurrentRoom().isExplored()) {
      return (player.getCurrentRoom()).getRecap();
    } else {
      (player.getCurrentRoom()).setExplored(true);
      return (player.getCurrentRoom()).getBeskrivelse();
    }
  }

  public String getSearch() {
    return (player.getCurrentRoom()).getSearch();
  }

  public String getLOOK() {
    return (player.getCurrentRoom()).getBeskrivelse();
  }

  public boolean goNorth() {
    return player.goDirection((player.getCurrentRoom()).getNorth(), player);
  }

  public boolean goEast() {
    return player.goDirection((player.getCurrentRoom()).getEast(), player);
  }

  public boolean goSouth() {
    return player.goDirection((player.getCurrentRoom()).getSouth(), player);
  }

  public boolean goWest() {
    return player.goDirection((player.getCurrentRoom()).getWest(), player);
  }

  public boolean takeItem(String item) {
    return player.pickUpItem(item);
  }

  public boolean dropItem(String item) {
    return player.dropItem(item);
  }

  public String firstWordSplit(String word) {
    if (word.contains("go ")){
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

  public ArrayList<Item> inventory(){
    return player.getInventory();
  }
}




