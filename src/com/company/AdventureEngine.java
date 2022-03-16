package com.company;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);

  public void intro(){
    System.out.println("Intro");
  }

  public String help(){
    return "Your possible option are:\nlook: Get room description again\n" +
        "North: Go north\nEast: Go east\nSouth: go South \nWest: go west";
  }

  public String goDirection(Room direction){
    if(!(direction==null)){
      player.setCurrentRoom(direction);}
    else{
      return "Can't go that way";
    }
    return (player.getCurrentRoom()).getBeskrivelse();
  }

  public void mapSet(){
    map.setRoomConnections();
  }

  public String options(String choice){
    Room currentRoom = player.getCurrentRoom();
    switch (choice){
      case "help" -> {
        return help();
      }
      case "look" -> {
        return currentRoom.getBeskrivelse();
      }
      case "north","n","go north" -> {
        return goDirection((player.getCurrentRoom()).getNorth());
      }
      case "east","e","go east" -> {
        return goDirection((player.getCurrentRoom()).getEast());
      }
      case "south","s","go south" ->{
        return goDirection((player.getCurrentRoom()).getSouth());
      }
      case "west","w","go west" ->{
        return goDirection((player.getCurrentRoom()).getWest());
      }
    }
    return "Invalid input";
  }
}




