package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {
  Room room1 = new Room("Room 1","A blue room");
  Room room2 = new Room("Room 2","A green room");
  Room room3 = new Room("Room 3","A purple room");
  Room room4 = new Room("Room 4", "A red room");
  Room room5 = new Room("Room 5", "A brown room");
  Room room6 = new Room("Room 6", "An orange room");
  Room room7 = new Room("Room 7", "A pink room");
  Room room8 = new Room("Room 8", "A yellow room");
  Room room9 = new Room("Room 9", "turqoise room");

  public void setRoomConnections(){
    room1.setEast(room2);
    room1.setSouth(room4);

    room2.setWest(room1);
    room2.setEast(room3);

    room3.setWest(room2);
    room3.setSouth(room6);

    room4.setNorth(room1);
    room4.setSouth(room7);

    room5.setSouth(room8);
    room6.setNorth(room3);
    room6.setSouth(room9);

    room7.setNorth(room4);
    room7.setEast(room8);

    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);

    room9.setNorth(room6);
    room9.setWest(room8);
  }

  public void intro(){
    System.out.println("Intro");
  }

  public void help(){
    System.out.println("Your possible option are:\nlook: Get room description again\n" +
        "North: Go north\nEast: Go east\nSouth: go South \nWest: go west");
  }

  public Room goDirection(Room currentRoom,Room direction){
    if(!(direction==null)){
      currentRoom = direction;
      System.out.println(currentRoom.getBeskrivelse());}
    else{
      System.out.println("Can't go that way");
    }
    return currentRoom;
  }

  public void options(){
    System.out.println("Choose option");
  }

  public void menu(){
    Scanner sc = new Scanner(System.in);
    setRoomConnections();
    intro();
    String choice = " ";
    Room currentRoom = room1;
    System.out.println(currentRoom.getBeskrivelse());
    while (!choice.equalsIgnoreCase("exit")) {
      options();
      choice=sc.next().toLowerCase(Locale.ROOT);
      switch (choice){
        case "help" -> {
          help();
        }
        case "look" -> {
          System.out.println(currentRoom.getBeskrivelse());
        }
        case "north","n","go north" -> {
          currentRoom=goDirection(currentRoom,currentRoom.getNorth());
        }
        case "east","e","go east" -> {
          currentRoom=goDirection(currentRoom,currentRoom.getEast());
        }
        case "south","s","go south" ->{
          currentRoom=goDirection(currentRoom,currentRoom.getSouth());
        }
        case "west","w","go west" ->{
          currentRoom=goDirection(currentRoom,currentRoom.getWest());
        }
      }
    }
  }

  public static void main(String[] args) {
    Adventure obj = new Adventure();
    obj.menu();
  }
}
