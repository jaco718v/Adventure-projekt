package com.company;

import java.util.Locale;
import java.util.Scanner;

public class AdventureInterface {

  public static void main(String[] args) {
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    engine.mapSet();
    String choice = " ";
    String intro = engine.intro();
    System.out.println(intro);
    String firstRoomDesc = engine.FirstRoomdesc();
    System.out.println(firstRoomDesc);
    while (!choice.equalsIgnoreCase("exit")) {
      choice = sc.next().toLowerCase(Locale.ROOT);
      String displayChoice = engine.options(choice);
      System.out.println(displayChoice);
    }
  }
}