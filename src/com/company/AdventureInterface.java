package com.company;

import java.util.Scanner;
//import javax.swing.*;


public class AdventureInterface {


  public void help() {
    System.out.println("North: Go north\nEast: Go east\nSouth: Go South \nWest: Go west\n" +
        "Inventory: Examine items you are carrying,\n" +
        "and Search: Further investigate the room");
  }

  public void intro() { System.out.println("Intro"); }

  public static void main(String[] args) {
    AdventureInterface obj = new AdventureInterface();
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    String choice = " ";

    obj.intro();
    //engine.playMusic();
    engine.setRoomConnections();
    engine.setItems();
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
          System.out.println(engine.getLook());
        }
        case "search" -> {
          System.out.println(engine.getSearch());
          for(Item item: engine.player.getCurrentRoom().getRoomItems())
            System.out.println(item.getItemName());
        }
        case "eat" ->{
          EatCase isEaten = engine.eatItem(secondWord);
          switch (isEaten){
            case EDIBLE -> {
              System.out.println("You ate the "+secondWord);
            }
            case INEDIBLE -> {
              System.out.println("You cannot eat "+secondWord);
            }
            case NOTFOUND -> {
              System.out.println("There is no "+secondWord+" present in your inventory or this room");
            }
          }
        }
        case "health" -> {
          System.out.println("your current health is: "+engine.player.getHealth());
          switch(engine.health()){
            case Healthy -> System.out.println("You're in perfect condition");
            case Okay -> System.out.println("Your injuries are minor");
            case Injured -> System.out.println("You're quite hurt");
            case Severe -> System.out.println("You're hurting bad");
            case Critical -> System.out.println("Your injuries are near-fatal, you might not survive another encounter");
          }
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
          if (engine.takeItem(secondWord)){
            System.out.println("Item was added to your inventory");}
            else
            System.out.println("There is no such item in this room");

        }
        case "drop" ->{
          if (engine.dropItem(secondWord)){
            System.out.println("Item was removed from inventory");}
          else
            System.out.println("There is no such item in inventory");
          }
        case "inventory" -> {
          if(engine.inventory().size()==0){
            System.out.println("Inventory is empty");
          }
          else {
          for(Item item: engine.inventory())
          System.out.println(item.getItemName());
          }
          if(engine.getEquippedWeapon()!=null){
            System.out.println("Equipped: "+engine.getEquippedWeapon().getItemName());
          }
          else System.out.println("No weapon currently equipped");
        }
        case "attack" ->{
          AttackCase attackCase = engine.attack();
          switch (attackCase){
            case FireWeapon -> System.out.println("You fire your weapon blindly, hitting nothing.");
            case MeleeSwing -> System.out.println("You swing your weapon in the air producing a mildly satisfying sound.");
            case NoAmmo -> System.out.println("You attempt to fire your weapon, yet nothing happens. It would seem you've run out of ammo.");
            case Empty -> System.out.println("Bare-handed, you swing your fists through the air.");
          }
        }
        case "equip" ->{
          EquipCase equipCase = engine.equipWeapon(secondWord);
          switch (equipCase){
            case EQUIPPED -> System.out.println("You equipped your "+secondWord);
            case NOTEQUIPPED -> System.out.println("You cannot equip "+secondWord);
            case NOTFOUND -> System.out.println("Item not found in inventory");
          }
        }
        case "ammo" ->{
          if(engine.player.getEquippedWeapon()!=null){
          int weaponAmmo = engine.player.getEquippedWeapon().ammoLeft();
          if(weaponAmmo>=0)
          System.out.println("Current ammo count is: "+weaponAmmo);
          else
            System.out.println("Current weapon does not use ammo");
          }
          else {
            System.out.println("You have no weapon equipped");
          }
        }
        case "exit" ->{
          System.out.println("exiting game...");}
      }
      if (!validDirectionFlag){
        //if (Player.getCurrentRoom().getNorth().equals(room8)
        //System.out.println("The stone door remains closed...");
        //} else
        System.out.println("Can't go that way");}
    }
    }
  }
