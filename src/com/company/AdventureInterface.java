package com.company;

import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.*;


public class AdventureInterface {


  public void help() {
    System.out.println("(go) + [Direction]\ttake [Item]\t\teat [Item]\t\t\tequip [Item]\n" +
            "search\t\t\t\tdrop [Item]\t\tuse [Item]\t\t\tinventory\n" +
            "look\t\t\t\topen [Item]\t\texamine [Item]\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\tquit");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t...and more!");
    //hidden commands:  throw   swing (on)  struggle  wrestle
  }

  public void intro() {
    System.out.println("Gabriel Knight is a struggling writer... that is, he's struggling to write anything at all. While researching a mysterious string of local murders, in the tabloids, eeriely  named,\n" +
            "\"The Voodoo Murders\", his idea, for a new bestseller, Gabriel has gotten in contact with his estranged uncle Wolfgang from Germany, who tells him of their family's\n" +
            "secret history, and their experience with the occult!\n");
    System.out.println("However, by the time Gabriel arrives at the dilapidated Schloss Ritter, in southern Bavaria, he finds that Wolfgang has seemingly lost his patience, and already left on his own...\n" +
            "Alone and confused, he prays to their patron saint St. George fo guidance, even though you could hardly call him religious. In his dreams that night, he sees a key, and to his surprise,\n" +
            "he notices the key in Wolfgang's office, the following day. He immediately realizes, it's the key for the library.\n");
    System.out.println("Upon gaining entry, Gabriel methodically parses through the sections relating to voodoo cults and their history. After studying all morning, he reaches the same conclusion,\n" +
            "Wolfgang must have; All accounts suggest the ancestral home of the Agris tribe, is an area know as the Red Basin, in, what is now known as the People's Republic of Benin.\n" +
            "And there's a high likelihood, that that's where Tetelo's remains ended up being buried... and thus, it is likely, that the Schattenjäger Talisman may be there, as well.\n" +
            "Good thing, Gabriel still has Moesby's \"American's Repressed\" card... He should be able to make a flight there, before the night falls.\n");
    System.out.println("Now, posing as an anthropologist, the late Professor Hartridge, possibly another victim of the murderous cultists, Gabriel hopes he can locate and gain access to their burial mound.");
    System.out.println("What did Gabriel take with him? (Choose 3 items)");
    System.out.println();
    System.out.println("\t\u001B[30mRope\t\t\u001B[31mGabriel's Research Notes\t\t\u001B[32mTequila Travel Box Set\t\t\u001B[33mSausages\t\t");
    System.out.println("\t\u001B[34mCompass\t\t\u001B[35mHammer\t\t\u001B[36mRada Drum Code\t\t\u001B[37mCultist Bracelet\t\t");
    System.out.println("\t\u001B[38mKeychain\t\t\u001B[39mArea Map\t\t\u001B[40mLocal Currency\t\t\u001B[41mWallet");
    System.out.println("\t\u001B[42mTracking Device\t\t\u001B[43mBody Paint\t\t\u001B[44mOther\t\t");
  }



  public void setInitialInventory(Item first, Item second, Item third) {
    ArrayList<Item> broughtGear = new ArrayList<>();
    broughtGear.add(first); broughtGear.add(second); broughtGear.add(third);
    //engine.player.setInventory(broughtGear);
  }

  public static void main(String[] args) {
    AdventureInterface obj = new AdventureInterface();
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    String space = " ";

    obj.intro();
    //engine.playMusic();
//    ArrayList<Item> startingInventory = engine.player.setInventory(ArrayList<Item> newInventory);
    engine.setRoomConnections();
    engine.setItems();
    System.out.println(engine.getNarrative());
    while (!space.equalsIgnoreCase("quit")) {
      space = sc.nextLine().toLowerCase();
      String firstWord = engine.firstWordSplit(space);
      String secondWord = engine.secondWordSplit(space);
      boolean validDirectionFlag = true;
      switch (firstWord){
        case "help" -> {
          obj.help();
        }
        /*
        case "open" -> {
          containerStatus isOpened = engine.openItem(secondWord);
          switch (isOpened){
            case UNLOCKED -> {
              System.out.println("You open the "+secondWord);
            }
            case LOCKED ->  {
              System.out.println("You don't have the key!");
            }
            case NOTCONTAINER -> {
              System.out.println("The "+secondWord+"has no content.");
            }
            case NOTFOUND -> {
              System.out.println("There is no "+secondWord+" present in the inventory, nor in this room");
            }
          }
        }*/
        case "look" -> {
          System.out.println(engine.getLook());
        }
        case "search" -> {
          if (engine.getSearch() != null) {
            System.out.println(engine.getSearch());
            System.out.println("The room also contains:");
            for (Item item : engine.player.getCurrentRoom().getRoomItems())
              System.out.printf("\u001B[30m" + item.getItemName() + "\t\t\u001B[33m");
          }
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
            case Unhurt -> System.out.println("\u001B[36mGabriel is in perfect condition... Well, he could go to the gym, once in a while.");
            case Bruised -> System.out.println("\u001B[32mGabriel has been hurt. The bruise is quite sore, already.");
            case Wounded -> System.out.println("\u001B[33mGabriel has an open wound... that's gonna hurt in the morning.");
            case Injured -> System.out.println("\u001B[33mGabriel is badly injured. He needs medical attention, soon.");
            case Crippled -> System.out.println("\u001B[31mGabriel is crippled... hopefully the bone isn't broken!?");
            case Bleeding -> System.out.println("\u001B[31mGabriel is bleeding from multiple lesions. His life is in danger!");
            case Critical -> System.out.println("\u001B[31mGabriel's injuries are near-fatal, he is not long for this world...");
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

        case "examine" ->{
          Item examined = engine.player.findInventoryItem(secondWord);
          if (examined != null) {
            System.out.println(examined.getItemDescription());
          }
          else
            System.out.println("You have no such item.");
        }

        case "take" ->{
          if (engine.takeItem(secondWord)){
            System.out.println("Item was added to your inventory.");}
            else
            System.out.println("There is no such item in this room.");

        }

        case "drop" ->{
          if (engine.dropItem(secondWord)){
            System.out.println("Item has been dropped.");}
          else
            System.out.println("There is no such item in inventory.");
        }

        case "inventory" -> {
          if(engine.inventory().size()==0){
            System.out.println("Inventory is empty");
          }
          else {
          for(Item item: engine.inventory())
            System.out.printf("\u001B[36m" + item.getItemName() + "\t\t\u001B[40m\u001B[33m");
          }
          if(engine.getEquippedWeapon()!=null){
            System.out.println("Equipped: "+engine.getEquippedWeapon().getItemName());
          }
          else System.out.println();
            System.out.println("No weapon currently equipped");
        }

        case "attack" ->{
          AttackCase attackCase = engine.attack();
          switch (attackCase){
            case RangedWeapon -> System.out.println("You fire your weapon blindly, hitting nothing.");
            case MeleeSwing -> System.out.println("You swing your weapon in the air producing a mildly satisfying sound.");
            case ThrownWeapon -> System.out.println("Weapon thrown.");
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
        case "quit" ->{
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
