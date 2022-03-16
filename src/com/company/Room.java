package com.company;

public class Room {
  private String name;
  private String beskrivelse;
  private Room north;
  private Room east;
  private Room south;
  private Room west;

  public Room(String name, String beskrivelse){
    this.name=name;
    this.beskrivelse=beskrivelse;
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
}
