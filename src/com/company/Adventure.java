package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Adventure {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Room room1 = new Room("Room 1","A blue room");
    Room room2 = new Room("Room 2");
    Room room3 = new Room("Room 3");
    Room room4 = new Room("Room 4");
    Room room5 = new Room("Room 5");
    Room room6 = new Room("Room 6");
    Room room7 = new Room("Room 7");
    Room room8 = new Room("Room 8");
    Room room9 = new Room("Room 9");
    System.out.println("Intro");
    String choice = null;
    Room currentRoom = room1;
    while (choice.equalsIgnoreCase("exit")) {
      System.out.println(currentRoom.getBeskrivelse());
      System.out.println("Choose option");
      choice=sc.next().toLowerCase(Locale.ROOT);
      switch (choice){
          case "help" -> {
              System.out.println("Options");}
          case "look" -> {
              System.out.println(currentRoom.getBeskrivelse());}
          case "north" -> {
              if(currentRoom.getNorth()!=null){
                  currentRoom=currentRoom.goNorth();
              }
              else System.out.println("Can't go that way");
          }
          case "east" -> {
              if (currentRoom.getEast() != null) {
                  currentRoom = currentRoom.goEast();
              }
              else
                  System.out.println("Can't go that way");
          }
          case "south" ->{
              if(currentRoom.getSouth()!=null){
                  currentRoom=currentRoom.goSouth();
              }
              else System.out.println("Can't go that way");
          }
          case "west" ->{
              if(currentRoom.getWest()!=null){
                  currentRoom=currentRoom.goWest();
              }
              else System.out.println("Can't go that way");
          }
      }
    }
  }
}
