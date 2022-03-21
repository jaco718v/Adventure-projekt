package com.company;

import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import javax.swing.*;
import java.io.File;

public class AdventureInterface {

  public void help() {
    System.out.println("North: Go north\nEast: Go east\nSouth: Go South \nWest: Go west\n" +
        "Inventory: Examine items you are carrying,\n" +
        "and Search: Further investigate the room");
  }

  public void intro() { System.out.println("Intro"); }

  public static void main(String[] args) {
    AdventureEngine engine = new AdventureEngine();
    AdventureInterface obj = new AdventureInterface(engine.getPlayer().getInventory());

    Scanner sc = new Scanner(System.in);
    String choice = " ";

    obj.intro();
    //obj.playMusic();
    engine.setRoomConnections();
    //engine.createItems();
    System.out.println(engine.getNarrative());
    while (!choice.equalsIgnoreCase("exit")) {
      choice = sc.nextLine().toLowerCase();
      String firstWord = engine.firstWordSplit(choice);
      String secondWord = engine.secondWordSplit(choice);
      boolean validDirectionFlag = true;
      switch (firstWord){
        case "help" -> {
          obj.help();
        }
        case "look" -> {
          System.out.println(engine.getLOOK());
        }
        case "search" -> {
          System.out.println(engine.getSearch());
          System.out.println(engine.getPlayer().getCurrentRoom().printRoomInventory());
        }
        case "north","n" -> {
          validDirectionFlag=engine.goNorth();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "east","e" -> {
          validDirectionFlag=engine.goEast();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "south","s" ->{
          validDirectionFlag=engine.goSouth();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "west","w" ->{
          validDirectionFlag=engine.goWest();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "take" ->{
          if (engine.getPlayer().takeItem(engine.getPlayer().findItem(secondWord, engine.getPlayer().getCurrentRoom().getRoomItems()))){
            System.out.println("Item was added to your inventory");}
            else
            System.out.println("There is no such item in this room");
        }
        case "drop" ->{
          if (engine.getPlayer().dropItem(engine.getPlayer().findItem(secondWord, engine.getPlayer().getInventory()))){
            System.out.println("Item was removed from inventory");}
          else
            System.out.println("There is no such item in inventory");
          }
        case "inventory" -> {
          if(engine.getPlayer().getInventory().size()==0){
            System.out.println("Inventory is empty");
          }
          for(Item item: engine.getPlayer().getInventory())
          System.out.printf(item.getItemName() + "\t");
        }
        case "exit" ->{
          System.out.println("exiting game...");}
      }
      if (!validDirectionFlag){
        //if (Player.getCurrentRoom().getNorth().getName().equals("room18") {
        //System.out.println("The stone door remains closed...");
        //} else {
        System.out.println("Can't go that way");}
    }
    }
  }
