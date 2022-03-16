package com.company;

public class GameMap {

  Room room1 = new Room("Room 1","A blue room");
  Room room2 = new Room("Room 2","A green room");
  Room room3 = new Room("Room 3","A purple room");
  Room room4 = new Room("Room 4", "A red room");
  Room room5 = new Room("Room 5", "A brown room");
  Room room6 = new Room("Room 6", "An orange room");
  Room room7 = new Room("Room 7", "A pink room");
  Room room8 = new Room("Room 8", "A yellow room");
  Room room9 = new Room("Room 9", "turqoise room");

  public void setRoomConnections(){
    room1.setEast(room2);
    room1.setSouth(room4);

    room2.setWest(room1);
    room2.setEast(room3);

    room3.setWest(room2);
    room3.setSouth(room6);

    room4.setNorth(room1);
    room4.setSouth(room7);

    room5.setSouth(room8);
    room6.setNorth(room3);
    room6.setSouth(room9);

    room7.setNorth(room4);
    room7.setEast(room8);

    room8.setWest(room7);
    room8.setNorth(room5);
    room8.setEast(room9);

    room9.setNorth(room6);
    room9.setWest(room8);
  }
}

