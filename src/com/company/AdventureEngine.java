package com.company;


import java.util.ArrayList;

public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);
/*
  void playMusic(){
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

  public void createItems() {
    map.createItems();
  }

  public String getNarrative() {
    if (player.getCurrentRoom().isExplored()) {
      return (player.getCurrentRoom()).getRecap();
    } else {
      (player.getCurrentRoom()).setExplored(true);
      return (player.getCurrentRoom()).getBeskrivelse();
    }
  }

  public String getLOOK() {
    return (player.getCurrentRoom()).getBeskrivelse();
  }

  public String getSearch() {
    return (player.getCurrentRoom()).getSearchString();
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

}




