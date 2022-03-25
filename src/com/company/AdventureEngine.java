package com.company;


import java.util.ArrayList;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);

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
    return player.attack();
  }

  public EquipCase equipWeapon(String itemName){
    return player.equipWeapon(itemName);
  }

  public Weapon getEquippedWeapon(){
    return player.getEquippedWeapon();
  }
}




