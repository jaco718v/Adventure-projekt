package com.company;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Adventure {

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
    GameMap map = new GameMap();
    Scanner sc = new Scanner(System.in);
    map.setRoomConnections();
    intro();
    String choice = " ";
    Room currentRoom = map.room1;
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
