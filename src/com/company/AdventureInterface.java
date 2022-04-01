package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//import javax.swing.*;


public class AdventureInterface {


  public void help() {
    System.out.println("(go) + [Direction]\ttake [Item]\t\teat [Item]\t\t\tequip [Item]\n" +
            "search\t\t\t\tdrop [Item]\t\tuse [Item]\t\t\tinventory\n" +
            "look\t\t\t\topen [Item]\t\texamine [Item]\n" +
            "[combat] - help\t\t\t\t\t\t\t\t\t\t\tquit");
    System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t...and more!");
    //hidden commands:  throw   swing (on)    struggle/wrestle    break/smash
    //not implemented
  }
  public void combatHelp(){
    System.out.println("The combat works like Roshambo with:\nAcute>Brutal \tBrutal>Cautious \tCautious>Acute\n"
    +"You also have the defensive options Block and Evade:\nBrutal>Block \tEvade>Acute   Brutal deals 3 extra damage\n"
    +"Succeeding in a defensive move deals no damage, but upgrade cautious to counter the following turn.\n"
        +"Using counter carries no risk, but only beats cautious.");
  }

  public void showVisual() {
    ImageIcon ii = new ImageIcon("src/room13.gif");
    JLabel title = new JLabel();
    JLabel label = new JLabel();
    label.setIcon(ii);
    //Icon icon = new ImageIcon(url);
    JPanel contentPane = new JPanel();
    title.setFont(new java.awt.Font("Times New Roman", Font.BOLD, 16));
    title.setText("       .Tomb Of Tetelo\n - A Gabriel Knight adventure");
    contentPane.add(title, java.awt.BorderLayout.SOUTH);
    contentPane.add(label, java.awt.BorderLayout.CENTER);
    JFrame f = new JFrame(".Tomb of Tetelo");
    f.getContentPane().add(label);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    //icon.paintIcon(null, label.getGraphics(),500,500);
  }
  public ArrayList<Item> intro() {
    System.out.println();
    System.out.println();
    System.out.println("Gabriel Knight is a struggling writer... that is, he's struggling to write anything at all. While researching a mysterious string of local murders, in the\n" +
            "tabloids, eeriely named, \"The Voodoo Murders\", (Yes, that IS his idea, for a new bestseller), he has gotten in contact with his estranged uncle Wolfgang from\n" +
            "Germany, who tells Gabriel of their secret family history, and their centuries past experience with the occult!\n");
    System.out.println("However, by the time Gabriel arrives at the dilapidated Schloss Ritter, in southern Bavaria, it would appear, that Wolfgang has seemingly already\n" +
            "lost his patience, and left on his own... The woman who works there, Gerde, seems to be genuinely worried for him.\n" +
            "Alone and confused, he prays for guidance, in a small chapel, Wolfgang built to their family patron saint, St. George. Even though he's hardly religious.\n" +
            "But in his dreams that night, Gabriel sees a key, and, to his befuddlement, he notices that very same key in Wolfgang's office, the following day.\n" +
            "He immediately realizes, it's the key for the library!\n");
    System.out.println("Upon gaining entry, Gabriel methodically parses through the sections relating to voodoo cults and their history. After studying all morning, he reaches the\n" +
            "same conclusion, Wolfgang must have; All accounts suggest the ancestral home of the Agris tribe, is an area know as the Red Basin, in, what is now known\n" +
            "as the People's Republic of Benin. And there's a high likelihood, that's where Tetelo's remains ended up being buried... and so, it is also likely, that\n" +
            "the Schattenjäger Talisman is there, as well. Good thing, Gabriel still has Moesby's \"American's Repressed\" card...\n" +
            "He should be able to make a flight there, before the night falls.\n");
    System.out.println("Now, posing as an anthropologist, the late Professor Hartridge, who was even possibly another victim of the murderous cultists, Gabriel hopes he can locate\n" +
            "and inconspicuously gain access to their ancestral holy ground. \"Just a quick, little look-see...\"");
    System.out.println("What did Gabriel take with him? (Choose 3 items, e.g. ABC)");
    System.out.println();
    System.out.println("\t\u001B[34m (A) Compass\t\t\t (B) Gabriel's Research\t\t (C) Local Currency\t\t (D) Hammer\t\t");
    System.out.println("\t (E) Rada Drum Code\t\t (F) Sausages\t\t\t\t (G) Rope\t\t\t\t (H) Cultist Bracelet\t\t");
    System.out.println("\t (I) Tequila Travel Box\t (J) Local Area Map\t\t\t (K) Tracking Device\t (L) Moesby's Wallet & Badge\u001B[0m");

    Container boxset = new Container("TeqBox", true, false, false, "use content on Rusty Grate", "Tequila Travel Box", "Hah, is it five o' clock, already? Even now, Gabriel is only thinking about partying!");
    Item rope = new Item("Rope", false,false,"use in room 19, and/or 9","Nylon Rope", "Gabriel brought this with him from Schloss Ritter!? Seems to me, he must be an experienced adventurer!");
    Container notes = new Container("Notebook", false,false, false,"decrypt scroll, create picture item when 'examine notes'","Gabriel's Notebook","These are Gabriel's research notes, a diary of sorts, of his investigation into the Voodoo Murders case. It also contains\na bit of Gunther's account of the Gedde's original tribe, and Moonbeam's voodoo ciphers. It's gonna make the book a bestseller!");
//Semi-useful
    Food wurst = new Food("Sausages", false,false,"+2 Health","Cold \"Weisswurst\"", "Gabriel bought these in Munich. They have, naturally, long gone cold. Gabriel isn't sure, if he should eat them, now...",2,0);
    Item NSEW = new Item("Compass", false,false,"currently none", "Field Compass", "Hah! Gabriel stole this, while he was in the military. Well, at least, he KEPT it, all these years. It points in the direction of the magnetic north.");
    MeleeWeapon hammer = new MeleeWeapon("Hammer", 2,false,false,"none","Toolkit Hammer", "It's a regular hammer, with a stocky head, and a long peen. Heh, now that definitely doesn't belong to Gabriel.");
//Useless
    Item book = new Item("Book", true, false, "none","Rada Drum Code", "The Gedde henchmen used these code patterns to communicate encrypted messages across the french quarter, while passing for simple buskers. But why did Gabriel bring this with him to Africa?");
    Item regMap = new Item("Map", false,false,"none","Red Basin Topographical Map", "Gabriel brought a map of the local area... But the driver already knew the site of the burial mound! Not much use, now...");
    Item cefa = new Item("Money", false,false,"none","CFA Francs (7.000 f)", "This is the currency of Benin... Gabriel exchanged all of his cash at the airport.");
    Item wallet = new Item("Wallet", false,false,"none","Moesby's Wallet & Badge", "Gabriel enjoyed his flight to Africa, almost as much, as he enjoyed his flight to Munich... Thank you, \"American's Repressed\". I wonder how Moesby will react, when he finds out?");
    Item tracker = new Item("Tracker", false,false,"none","Tracking Device (with signal device)", "This is the toy, that Gabriel snuck out, from the poli... correction... that he ALSO stole, from the police office! He really should've \"snuck\" that back in.");
    Item bangle = new Item("Bracelet", false,false,"none","Cult Snake Bracelet", "Gabriel had Marcus cast this, in order to pass himself off as a member of the voodoo cult... to his credit, it really does look like a thing of evil. Who is planning to fool, this time?");

    Scanner keybdINput = new Scanner(System.in);
    String choice = keybdINput.nextLine().toUpperCase();
    String letter = " ";
    Item itemBehindLetter;
    ArrayList<Item> startingInventory = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
        letter = choice.substring(i, i + 1);
      switch (letter) {
        case "A":
          itemBehindLetter = NSEW;
          startingInventory.add(itemBehindLetter);
          break;
        case "B":
          itemBehindLetter = notes;
          startingInventory.add(itemBehindLetter);
          break;
        case "C":
          itemBehindLetter = cefa;
          startingInventory.add(itemBehindLetter);
          break;
        case "D":
          itemBehindLetter = hammer;
          startingInventory.add(itemBehindLetter);
          break;
        case "E":
          itemBehindLetter = book;
          startingInventory.add(itemBehindLetter);
          break;
        case "F":
          itemBehindLetter = wurst;
          startingInventory.add(itemBehindLetter);
          break;
        case "G":
          itemBehindLetter = rope;
          startingInventory.add(itemBehindLetter);
          break;
        case "H":
          itemBehindLetter = bangle;
          startingInventory.add(itemBehindLetter);
          break;
        case "I":
          Random izer = new Random();
          RangedWeapon bottle = new RangedWeapon("Tequila", 2, izer.nextInt(6) + 3, false, false, "none", "Bottle of Tequila", "Party time! I'd thought, that Gabriel would prefer more of a... \"guido\" kind of cocktail.");
          Item juice = new Item("Lemon", false, false, "none", "Lemon Juice Dispenser", "This came in the Tequila Box Set... What is the order now, again? Salt first, then lemon, then... no...");
          Item salt = new Item("Salt", false, false, "none", "Salt Shaker", "This small salt shaker was also included in the Tequila Box Set. It is, what you'd expect. Table salt in a cheap plastic dispenser.");
          itemBehindLetter = (Container) boxset;
          boxset.addContainedItem(bottle);
          boxset.addContainedItem(juice);
          boxset.addContainedItem(salt);
          startingInventory.add(itemBehindLetter);
          break;
        case "J":
          itemBehindLetter = regMap;
          startingInventory.add(itemBehindLetter);
          break;
        case "K":
          itemBehindLetter = tracker;
          startingInventory.add(itemBehindLetter);
          break;
        case "L":
          itemBehindLetter = wallet;
          startingInventory.add(itemBehindLetter);
          break;
        }
      }
    return startingInventory;
  }

  public static void main(String[] args) {
    AdventureInterface obj = new AdventureInterface();
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    String choice = null;
    engine.player.setInventory(obj.intro());
    obj.showVisual();
    engine.playMusic();
    engine.setRoomConnections();
    engine.setItems();
    System.out.println(engine.getNarrative());

    while (choice==null || !choice.equalsIgnoreCase("quit") ||!engine.player.playerDeath()) {
      choice = sc.nextLine().toLowerCase();
      String firstWord = engine.firstWordSplit(choice);
      String secondWord = engine.secondWordSplit(choice);
      boolean validDirectionFlag = true;
      boolean enemyTurnFlag=false;
      switch (firstWord){
        case "help" -> {
          obj.help();
        }
        case "combat" ->{
          obj.combatHelp();
        }
        case "open" -> {
          ContainerCase isOpened = engine.openItem(secondWord);
          switch (isOpened){
            case OPENED -> {
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
        }
        case "look" -> {
          System.out.println(engine.getLook());
        }
        case "search" -> {
          if (engine.getSearch() != null) {
            System.out.println(engine.getSearch());
            if(engine.player.getCurrentRoom().getRoomEnemies().size()>0){
              System.out.println("An enemy "+engine.getRoomEnemy().getName()+" is in the room with you!");
            }
            if (engine.player.getCurrentRoom().getRoomItems().size()>0) {
              System.out.println("The room also contains:");
              for (PseudoItems pseudo : engine.player.getCurrentRoom().getRoomPseudos()) {
                System.out.printf("\u001B[30m" + pseudo.getPseudoName() + "\t\t\u001B[33m");
              }
              System.out.println();
              for (Item item : engine.player.getCurrentRoom().getRoomItems()) {
                System.out.printf("\u001B[30m" + item.getItemName() + "\t\t\u001B[33m");
              }
              System.out.println();
            }
          } else {
            System.out.println(engine.darkSearch());
            engine.player.fallDamage(1);
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
            System.out.println("There is no such item in this room, or that item isn't portable.");

        }
        case "drop" ->{
          if (engine.dropItem(secondWord)){
            System.out.println("Item has been dropped.");}
          else
            System.out.println("There is no such item in inventory");
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
          else System.out.println("No weapon currently equipped");
        }
        case "attack" -> {
          AttackCase attackCase = engine.attack();
          switch (attackCase) {
            case RangedWeaponMiss -> System.out.println("You fire your weapon blindly, hitting nothing.");
            case MeleeSwingMiss -> System.out.println("You swing your weapon in the air.");
            case ThrownWeaponMiss -> System.out.println("You throw your weapon at nothing.");
            case NoAmmo -> System.out.println("You attempt to fire your weapon, yet nothing happens. It would seem you've run out of ammo.");
            case Empty -> System.out.println("You are unarmed, i'd be best to avoid combat.");
            case EnemyPresent -> {
              System.out.println("You engage the enemy "+engine.getRoomEnemy().getName());

              while(!engine.player.playerDeath() || engine.player.getCurrentRoom().getRoomEnemies().size() >0 && !engine.player.isFleeFlag()){
              CombatOption choice1 = engine.combatRandomChoice1();
              CombatOption choice2 = choice1;
              while (choice2 == choice1) {
                choice2 = engine.combatRandomChoice1();
              }
              switch (choice1) {
                case Acute -> System.out.println("1. Acute attack");
                case Brutal -> System.out.println("1. Brutal attack");
                case Cautious -> System.out.println("1. Cautious attack");
                case Counter -> System.out.println("1. Counter");
                case Evade -> System.out.println("1. Evade");
                case Block -> System.out.println("1. Block");
              }
              switch (choice2) {
                case Acute -> System.out.println("2. Acute attack");
                case Brutal -> System.out.println("2. Brutal attack");
                case Cautious -> System.out.println("2. Cautious attack");
                case Counter -> System.out.println("2. Counter");
                case Evade -> System.out.println("2. Evade");
                case Block -> System.out.println("2. Block");
              }
              System.out.println("3. Flee");
              boolean ammoWarningFlag = engine.ammoWarning();
              if(engine.player.getEquippedWeapon().ammoLeft()>0)
              System.out.println("Remaining ammo: "+engine.player.getEquippedWeapon().ammoLeft());
              if(engine.ammoWarning()){
                System.out.println("You're out of ammo. Fleeing is recommended.");
              }

              int attackChoice = 0;
              while (attackChoice != 1 && attackChoice != 2 && attackChoice != 3) {
                attackChoice = sc.nextInt();
              }
              CombatResult result;
              if (attackChoice == 1) {
                result = engine.combat(choice1);
              } else if (attackChoice == 2) {
                result = engine.combat(choice2);
              } else {
                result = engine.combat(CombatOption.Flee);
              }
              System.out.println("The enemy choice was "+engine.getRoomEnemy().getEnemyAction());
              switch (result) {
                case Succes -> {
                  if(ammoWarningFlag){
                  System.out.println("You've no ammo left to use ");
                  } else
                  System.out.println("You succeed in attacking, dealing " + engine.player.getWeaponDamage() + " damage to "
                    + engine.getRoomEnemy().getName());
                }
                case BrutalSucces -> {
                  if(ammoWarningFlag){
                  System.out.println("You've no ammo left to use ");
                } else
                  System.out.println("You succeed in a brutal attacking, dealing " + engine.player.getWeaponDamage() + "+ 3 extra damage to "
                    + engine.getRoomEnemy().getName());
                }
                case BlockSucces -> System.out.println("You successfully blocked the attack, enabling a possible counterattack");
                case EvadeSucces -> System.out.println("You successfully evade the attack, enabling a possible counterattack or a guaranteed flee attempt;");
                case Tie -> System.out.println("The outcome is a tie!");
                case Loss -> System.out.println("The enemy succeeded in attacking, dealing "
                    + engine.getRoomEnemy().enemyAttack() + " damage to you.");
                case BrutalLoss -> System.out.println("The enemy succeeded in executing a brutal attack, dealing "
                    + engine.getRoomEnemy().enemyAttack() + " + 3 extra damage to you.");
                case EnemyBlockSucces -> System.out.println("The enemy succeeds in blocking your attack.");
                case FleeSucces -> System.out.println("You flee the battle");
              }
                System.out.println("Gabriels current health: "+engine.player.getHealth()+"/30");
                System.out.println(engine.getRoomEnemy().getName()+ "'s current health: "+engine.getRoomEnemy().getHealth());

              if(engine.enemyDeath()){
                System.out.println("You've defeated the enemy");
              }
              if(engine.player.playerDeath()){
                System.out.println("You died :(");}
              if(engine.player.isFleeFlag()) {
                System.out.println("You flee the battle");
              }
              }
              engine.fleeFlagReset();
            }
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
        case "quit" ->{
          System.out.println("exiting game...");
        }
        case "solve" ->{
          engine.map.setNewConnections();
          engine.map.unleashZombies();
        }
      }
      if (!validDirectionFlag){
        //if (Player.getCurrentRoom().getNorth().equals(room8)
        //System.out.println("The stone door remains closed...");
        //} else
        System.out.println("Can't go that way");}
      if(enemyTurnFlag){
      }
    }
  }
}
