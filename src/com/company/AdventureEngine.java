package com.company;


import java.util.ArrayList;
import java.util.Random;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room0);
  Random izer = new Random();



  /*public void playMusic(){
    try
    {
      String musicLocation = "src/Dark Art.wav";
      File musicPath = new File(musicLocation);
      if (musicPath.exists()) {
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        //JOptionPane.showMessageDialog(null, "hit OK to pause");
        long clipTimePosition = clip.getMicrosecondPosition();
        clip.stop();

        //JOptionPane.showMessageDialog(null, "hit OK to resume");
        clip.setMicrosecondPosition(clipTimePosition);
        clip.start();

        //JOptionPane.showMessageDialog(null, "hit OK to stop");
      }
      else
      {
        System.out.println("Can't find file");
      }
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }
*/

  public void setRoomConnections() {
    map.setRoomConnections();
  }

  public void setItems() {
    map.setItems();
  }

  public String getNarrative() {
    if (player.getCurrentRoom().isExplored()) {
      return (player.getCurrentRoom()).getRecap();
    } else {
      (player.getCurrentRoom()).setExplored(true);
      return (player.getCurrentRoom()).getDescription();
    }
  }

  public EatCase eatItem(String item){
    Item itemFound =player.findInventoryItem(item);
    ArrayList<Item> foodLocation = player.getInventory();
    if(itemFound ==null){
      itemFound = player.getCurrentRoom().findRoomItem(item);
      foodLocation = player.getCurrentRoom().getRoomItems();
      if(itemFound ==null){
        return EatCase.NOTFOUND;
      }
    }
    if(itemFound instanceof Food){
      player.eatFood(foodLocation,(Food)itemFound);
      return EatCase.EDIBLE;
    }
    return EatCase.INEDIBLE;
  }

  public HpCase health(){
    return player.hpStatus();
  }

  public String getSearch() {
    return (player.getCurrentRoom()).getSearch();
  }

  public String getLook() {
    return (player.getCurrentRoom()).getDescription();
  }

  public boolean goNorth() {
    return player.goDirection((player.getCurrentRoom()).getNorth(), player);
  }

  public boolean goEast() {
    return player.goDirection((player.getCurrentRoom()).getEast(), player);
  }

  public boolean goSouth() {
    return player.goDirection((player.getCurrentRoom()).getSouth(), player);
  }

  public boolean goWest() {
    return player.goDirection((player.getCurrentRoom()).getWest(), player);
  }

  public boolean takeItem(String item) {
    return player.takeItem(item);
  }

  public boolean dropItem(String item) {
    return player.dropItem(item);
  }

//  public boolean openItem(String item) { return player.openItem(item); }

  public String darkSearch(int count) {
    player.setDarkSearchCount();
    int darkNumber = izer.nextInt(4)+player.getDarkSearchCount();
    String themeIteration = " ";
    switch (darkNumber) {
      case 0:
      case 1:
        themeIteration = "\u001B[40m\u001B[37mTrying to navigate the darkness, Gabriel stubs his toe on an cracked floor panel. \"Arrgh!\"\u001B[33m";
        break;
      case 2:
        themeIteration = "\u001B[40m\u001B[37mThis room is too dark. Trying to search it, Gabriel first stumbles, then falls and hurts himself.\u001B[33m";
        break;
      case 3:
        themeIteration = "\u001B[40m\u001B[37mHeh, Gabriel isn't going to find anything in a room this dark! He trip over a crooked floor tile, and scrapes the kneecap. Annoying!\u001B[33m";
        break;
      case 4:
      case 5:
        themeIteration = "\u001B[40m\u001B[37Gabriel can't even see his hand before him, in this pitch black room! He feels it, though, when he loses balance, and cut the side of his hand, bracing on a sharp edge...\u001B[33m";
        break;
      case 6:
      case 7:
        themeIteration = "\u001B[40m\u001B[37mIt's so dark in here, Gabriel won't be finding much of anything... A floor tile is missing! Gabriel loses balance, as he steps in the hole, spraining his ankle. Ouch!\u001B[33m";
        break;
      case 8:
        themeIteration = "\u001B[40m\u001B[37mIt's not possible to find anything in this darkness... Gabriel stands back up. \"Oww!\" ... he bumped his head on a wooden support beam.\u001B[33m";
        break;
      case 9:
        themeIteration = "\u001B[40m\u001B[37mThis room is effectively too dark, for Gabriel to search in here. He trips, falls... yada, yada, you get the point.\u001B[33m";
        break;
      default:
        themeIteration = "\u001B[40m\u001B[37mUnable to see anything, Gabriel trips over debris on the floor... He falls, and ends up with a rusty nail in his arm. Hope, he DID get that tetanus shot!\u001B[33m";
        break;
    }
    return themeIteration;
  }


  public String firstWordSplit(String word) {
    if (word.contains("go ")){
      return secondWordSplit(word);
    }
    if(word.contains(" ")) {
      return word.substring(0, word.indexOf(" "));
    }
    else return word;
  }

  public String secondWordSplit(String word) {
    if (word.contains(" ")) {
      return word.substring(word.indexOf(" ")+1);
    }
    else return word;
  }

  public ArrayList<Item> inventory(){
    return player.getInventory();
  }

  public AttackCase attack(){
    return player.attackAttempt();
  }

  public boolean ammoWarning(){
    if(player.getEquippedWeapon().ammoLeft()==0){
      return true;
    }
    return false;
  }

  public CombatOption combatRandomChoice1(){
    Random random = new Random();
    int number = (random.nextInt(17)+1);
    switch (number){
      case 1,2,3,4,5 ->{ return CombatOption.Acute;}
      case 6,7,8 ->{return CombatOption.Brutal;}
      case 9,10,11,12->{
        if(player.isBlockFlag() || player.isEvadeFlag()){
          return CombatOption.Counter;}
        else
        return CombatOption.Cautious;}
      case 13,14,15 ->{return CombatOption.Evade;}
      case 16,17 ->{return CombatOption.Block;}
    }
    return null;
  }

  public CombatResult combat(CombatOption combatCase){
   return player.combat(combatCase);
  }

  public void fleeFlagReset(){
    player.setFleeFlag(false);
  }

  public boolean enemyDeath() {
    return (player.getCurrentRoom().getRoomEnemies().get(0).enemyDeath(player.getCurrentRoom()));
  }

  public EquipCase equipWeapon(String itemName){
    return player.equipWeapon(itemName);
  }

  public Enemy getRoomEnemy(){
    return player.getCurrentRoom().getRoomEnemies().get(0);
  }

  public Weapon getEquippedWeapon(){
    return player.getEquippedWeapon();
  }
}




