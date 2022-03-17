package com.company;

import java.util.Locale;
import java.util.Scanner;

public class AdventureInterface {

  public void help() {
    System.out.println("Your possible option are:\nlook: Get room description again\n" +
        "North: Go north\nEast: Go east\nSouth: go South \nWest: go west");
  }

  public void intro() {
    System.out.println("Intro");
  }

  public static void main(String[] args) {
    AdventureInterface obj = new AdventureInterface();
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    String choice = " ";
    obj.intro();
    engine.setRoomConnections();
    System.out.println(engine.getBeskrivelse());
    while (!choice.equalsIgnoreCase("exit")) {
      choice = sc.next().toLowerCase(Locale.ROOT);
      boolean validDirectionFlag = true;
      switch (choice){
        case "help" -> {
          obj.help();
        }
        case "look" -> {
          System.out.println(engine.getBeskrivelse());
        }
        case "north","n","go north" -> {
          validDirectionFlag=engine.goNorth();
          if(validDirectionFlag){
            System.out.println(engine.getBeskrivelse());
          }
        }
        case "east","e","go east" -> {
          validDirectionFlag=engine.goEast();
          if(validDirectionFlag){
            System.out.println(engine.getBeskrivelse());
          }
        }
        case "south","s","go south" ->{
          validDirectionFlag=engine.goSouth();
          if(validDirectionFlag){
            System.out.println(engine.getBeskrivelse());
          }
        }
        case "west","w","go west" ->{
          validDirectionFlag=engine.goWest();
          if(validDirectionFlag){
            System.out.println(engine.getBeskrivelse());
          }
        }
        case "exit" ->{
          System.out.println("exiting game...");}
      }
      if (!validDirectionFlag){
        System.out.println("Can't go that way");}
    }
    }
  }