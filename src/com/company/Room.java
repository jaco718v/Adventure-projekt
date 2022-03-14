package com.company;

public class Room {
  private String name;
  private String beskrivelse;
  private Room north;
  private Room east;
  private Room south;
  private Room west;

  public Room(String name, String beskrivelse, Room north, Room east, Room south, Room  west){
    this.name=name;
    this.beskrivelse=beskrivelse;
    this.north=north;
    this.east=east;
    this.south=south;
    this.west=west;
  }

  public Room goNorth(){
    if (north.getNorth()==null){
      return null;}
      else
        return north.getNorth();
  }

  public Room goEast(){
    if (east.getEast()==null){
      return null;}
    else
      return east.getEast();
  }

  public Room goSouth(){
    if (south.getSouth()==null){
      return null;}
    else
      return south.getSouth();
  }

  public Room goWest(){
    if (west.getWest()==null){
      return null;}
    else
      return west.getWest();
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
}
