/*package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EventEntity extends Room {     // I.e. monster moves north if possible/as needed, or maybe
    // a turret with previous- and currentRoom, watches spaces around it
    private String name;
    private Room assigned;
    //    private String description;
//    private String recap;
//    private String search;
    private Room north;
    //    private Room east;
//    private Room south;
//    private Room west;
    private ArrayList<Item> eventItems;


    public EventEntity(String name, Room north, Room east, Room south, Room west, ArrayList<Item> eventItems, boolean explored) {
        super(name, north, east, south, west);
    }
    //ask player, if he is (or has been to) Room assigned.
    //check it's private condition, and execute the code.
    //----------------------------------------------------
    //-Snake Trap if player doesn't choose to immediately leave treasure chamber, room23.
    //-Use lemon, use salt in room20/21, turns room21 (reset pointer) into room20, remove Rusted Grate from roomItems.
    //-Venomous Milipede in collapsed corridor, rooms 9,10, and 20. RoomCount% chance of biting when searching room.
    //-Unlocking the door, using the key in room 12. Triggered by use torch in room 2 or 3 when insight <5. Triggers 4x zombie fight.
    //-Using the vines in room14, when door isOpen, teleports to room17, trigger 2 zombie fight, and hurt zombie, drop vine in inventory.
    //-Reaching room18 when door isOpen, trigger fake 3 zombie fight, then Wolfgang gives Gabriel the dagger for the real fight vs. 2.
    //-Cabrit sans cor, room15, Wolfgang sacrifices himself, Gabriel finally gets the Schattenjäger Talisman.

    //-Room1 when event15 isTriggered, Game Over screen. No illegals = Loot value:, Secrets found:, Illegals: 16-96 years in prison, depending on stolen items.

    public void decryptScroll() throws InterruptedException {
        Scanner keybdINput = new Scanner(System.in);
        String cipher = keybdINput.next();
        Random izer = new Random();
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', ' ', ' ', ' ', ' ', ' '};
        int guessNumber = izer.nextInt(32);
        char falseSymbol = alphabet[guessNumber];
        char[] transcription = new char[15];
        char[] returnedAnswer;

        public char[] getFalseTranscription() {
            for (int i = 0; i >= 15; i++) {
                transcription[i] = falseSymbol;
            }

        }

        while (!cipher.equalsIgnoreCase("exit")) {
            System.out.println("\tChoose a decryption cipher:\n\t(C)onclave, (R)itual, (P)rayer, or (W)orship?\n");
            switch (cipher) {
                // Output: xxxxxxxxxxxxxxx
                default:
                    returnedAnswer = getFalseTranscription();
                    break;
                // Output: xAxRxTxxANx xxR
                case "R":
                    for (int i = 0; i >= 15; i++) {
                        switch (i) {
                            case 0:
                            case 2:
                            case 4:
                            case 6:
                            case 7:
                            case 10:
                            case 12:
                            case 13:
                                transcription[i] = falseSymbol;
                                break;
                            case 1:
                            case 8:
                                transcription[i] = 'A';
                                break;
                            case 3:
                            case 14:
                                transcription[i] = 'R';
                                break;
                            case 5:
                                transcription[i] = 'T';
                                break;
                            case 9:
                                transcription[i] = 'N';
                                break;
                            case 11:
                                transcription[i] = ' ';
                                break;
                        }
                    }
                    returnedAnswer = transcription;

                    // Output: CxBxIx SxxSxCOx
                case "W":
                    for (int i = 0; i >= 15; i++) {
                        switch (i) {
                            case 1:
                            case 3:
                            case 5:
                            case 8:
                            case 9:
                            case 11:
                            case 14:
                                transcription[i] = falseSymbol;
                                break;
                            case 0:
                            case 12:
                                transcription[i] = 'C';
                                break;
                            case 2:
                                transcription[i] = 'B';
                                break;
                            case 4:
                                transcription[i] = 'I';
                                break;
                            case 6:
                                transcription[i] = ' ';
                                break;
                            case 7:
                            case 10:
                                transcription[i] = 'S';
                                break;
                            case 13:
                                transcription[i] = 'O';
                                break;
                        }
                    }
                    returnedAnswer = transcription;
            }
            for (char symbol : returnedAnswer) {
                Thread.sleep(400);
                System.out.printf(String.valueOf(symbol) + "\t\tHmmm...");
            }

        }
    }
}*/