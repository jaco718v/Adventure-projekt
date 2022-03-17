package com.company;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);

  public String intro(){
    return "Intro";
  }

  public String FirstRoomdesc(){
    return map.room1.getBeskrivelse();
  }

  public String help(){
    return "Your possible option are:\nlook: Get room description again\n" +
        "North: Go north\nEast: Go east\nSouth: Go South \nWest: Go west\n" +
            "Inventory: Examine items you are carrying,\n" +
            "and Search: Further investigate the room";
  }


  public String goDirection(Room direction){
    if(!(direction==null)){
      player.setCurrentRoom(direction);}
    else{
      return "Can't go that way";
    }
    //if (player.getCurrentRoom()).isExplored();
    //{return player.getCurrentRoom()).getRecap();
    //else
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
      case "exit" ->{
        return "exiting game...";}
    }
    return "Invalid input";
  }
}




