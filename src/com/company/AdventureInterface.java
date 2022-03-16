package com.company;

import java.util.Locale;
import java.util.Scanner;

public class AdventureInterface {

  public static void main(String[] args) {
    AdventureEngine engine = new AdventureEngine();
    Scanner sc = new Scanner(System.in);
    String choice = " ";
    engine.intro();
    engine.mapSet();
    while (!choice.equalsIgnoreCase("exit")) {
      choice = sc.next().toLowerCase(Locale.ROOT);
      String displayChoice = engine.options(choice);
      System.out.println(displayChoice);
    }
  }
}