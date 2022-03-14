package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Room room1 = new Room("Room 1","A blue room" ,null ,null ,null ,null);
    Room room2 = new Room("Room 2","A green room" ,null,null,null,null);
    Room room3 = new Room("Room 3","A purple room" ,null ,null ,null, null);
    Room room4 = new Room("Room 4", "A red room", null, null, null, null);
    Room room5 = new Room("Room 5", "A brown room", null, null, null, null);
    Room room6 = new Room("Room 6", "An orange room", null, null ,null , null);
    Room room7 = new Room("Room 7", "A pink room", null, null, null, null);
    Room room8 = new Room("Room 8", "A yellow room", null, null, null , null);
    Room room9 = new Room("Room 9", "turqoise room", null, null , null , null);
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
    room8.setNorth(room5);
    room8.setEast(room9);
    room9.setNorth(room6);
    room9.setWest(room8);


    System.out.println("Intro");
    String choice = " ";
    Room currentRoom = room1;
    System.out.println(currentRoom.getBeskrivelse());
    while (!choice.equalsIgnoreCase("exit")) {
      System.out.println("Choose option");
      choice=sc.next().toLowerCase(Locale.ROOT);
      switch (choice){
          case "help" -> {
              System.out.println("Options");}
          case "look" -> {
              System.out.println(currentRoom.getBeskrivelse());}
          case "north" -> {
              if(currentRoom.getNorth()!=null){
                  currentRoom=currentRoom.getNorth();
                System.out.println(currentRoom.getBeskrivelse());
              }
              else System.out.println("Can't go that way");
          }
          case "east" -> {
              if (currentRoom.getEast() != null) {
                  currentRoom = currentRoom.getEast();
                System.out.println(currentRoom.getBeskrivelse());
              }
              else
                  System.out.println("Can't go that way");
          }
          case "south" ->{
              if(currentRoom.getSouth()!=null){
                  currentRoom=currentRoom.getSouth();
                System.out.println(currentRoom.getBeskrivelse());
              }
              else System.out.println("Can't go that way");
          }
          case "west" ->{
              if(currentRoom.getWest()!=null){
                  currentRoom=currentRoom.getWest();
                System.out.println(currentRoom.getBeskrivelse());
              }
              else System.out.println("Can't go that way");
          }
      }
    }
  }
}
