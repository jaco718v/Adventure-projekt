package com.company;

import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
//import javax.swing.*;
import java.io.File;

public class AdventureInterface {

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
    obj.playMusic();
    engine.setRoomConnections();
    System.out.println(engine.getNarrative());
    while (!choice.equalsIgnoreCase("exit")) {
      choice = sc.next().toLowerCase(Locale.ROOT);
      boolean validDirectionFlag = true;
      switch (choice){
        case "help" -> {
          obj.help();
        }
        case "look" -> {
          System.out.println(engine.getLOOK());
        }
        case "north","n","go north" -> {
          validDirectionFlag=engine.goNorth();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "east","e","go east" -> {
          validDirectionFlag=engine.goEast();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "south","s","go south" ->{
          validDirectionFlag=engine.goSouth();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
          }
        }
        case "west","w","go west" ->{
          validDirectionFlag=engine.goWest();
          if(validDirectionFlag){
            System.out.println(engine.getNarrative());
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
