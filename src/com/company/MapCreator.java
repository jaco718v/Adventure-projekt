package com.company;

public class MapCreator {
  Room room0 = new Room("Room 0","descrp", null);
  Room room1 = new Room("Room 1","descrp1", "recap" );
  Room room2 = new Room("Room 2","descrp2", "recap" );
  Room room3 = new Room("Room 3","descrp3", "recap" );
  Room room4 = new Room("Room 4","descrp4", "recap" );
  Room room5 = new Room("Room 5","descrp5", "recap" );
  Room room6 = new Room("Room 6","descrp6", "recap" );
  Room room7 = new Room("Room 7","descrp7", "recap" );
  Room room8 = new Room("Room 8","descrp8", "recap" );
  Room room9 = new Room("Room 9","descrp9", "recap" );
  Room room10 = new Room("Room 10","descrp10", "recap" );
  Room room11 = new Room("Room 11","You're in the torch-lit entryway of the burial mound. Vines run like snakes across the down-sloping ceiling.\n" +
      "The air in here feels clammy. The passage narrows slightly as it goes down into the mound, then branches left and right.",
      "You're back in the entry hallway.");
  Room room12 = new Room("Room 12","Very little light gets into this room from the opposite side.\n" +
      "You fumble your way through the room, as your eyes can't really adjust to the darkness\n" +
      "The room appears to store... some kind of furniture, maybe?",
      "You're in the cluttered dark room.");
  Room room13 = new Room("Room 13","There's a lit torch here in the corner! It's nailed to the wall, though...\n" +
      //if (!SnekNCbraSlabCollected) {}
      "There is a square stone-slab on the floor, next to an indentation on the wall",
      "You're in the room with the torch on the wall.");
  Room room14 = new Room("Room 14", "You can't even see half of this room, since part of the mound has collapsed. \n" +
      "You think you can spot an exit beyond it",
      "You're in the partially collapsed room.");
  Room room15 = new Room("Room 15", "You're finally inside the burial chamber.\n" +
      "It's very warm in here, since the room is flooded with light from a large firepit on the backwall.\n" +
      "In the middle of the room, stands a gruesome stone altar, complete with one of those, ughh, heart-troughs, in the middle...\n" +
      "There are four golf-ball-sized holes around the top of it... for draining the blood?... yuck!",
      "You run back into the burial chamber, and try to shut the door, but it's too late. You're trapped, and the creatures overwhelm you!");
  Room room16 = new Room("Room 16", "In here, it's so dark, you can barely make out the bizarre-looking edges of the strange fungi, that sprawl across the wall.\n" +
      "They smell sweet, like flowers, but stronger, and more unpleasant... It almost make you feel dizzy.",
      "You hold your breath, as you rush past the suspicious fungi.");
  Room room17 = new Room("Room 17", "A thick cluster of vines hang from the ceiling in the middle of the room\n" +
      "There's a massive clay jar in the corner." +
      //if (!inventory[].contains."2SnekSlab) {
      " A square stone-slab is embedded in the wall. Two Snakes, huh? This one has a hole in the middle... Curious...",
      "You're in the room with the clay jar.");
  Room room18 = new Room("Room 18", "A giant stone door blocks the path to the burial chamber\n" +
      "In the cold air, it looks like it's billowing smoke from it's sides.",
      "You're back at the stone door.");
  Room room19 = new Room("Room 19", "A dimly lit room. It seems empty, except for the rocks and pebbles that litter the floor, from a collapsed wall.",
      "You're back in the dimly lit room.");
  Room room20 = new Room("Room 20","descrp20", "recap" );
  Room room21 = new Room("Room 20","descrp20", "recap" );
  Room room22 = new Room("I don't wanna leave just yet...","I don't wanna leave just yet...", "recap" );

  Item ceremonyClub = new Item("Ceremony Club", "desc");
  Item snekNCbraSlab = new Item(null,null);
  Item ironBar = new Item(null, null);
  Item sjDagger = new Item(null, null);
  Item sjMedallion = new Item(null, null);        // healing item
  Item twoSnekSlab = new Item(null, null);        // for Room 2
  Item snakeRod = new Item(null, null);           // the key for the door, open in Room 2
  Item threeSnekSlab = new Item(null, null);      // for Room 3
  Item torch = new Item(null, null);              // for igniting in Room2 or 3, lighting Room2, once insight > 2
  Item spiralSnekSlab = new Item(null, null);


  public void setRoomConnections() {
    room0.setWest(room22);
    room0.setNorth(room22);
    room0.setEast(room1);
    room0.setSouth(room1);

    room1.setWest(room22);
    room1.setNorth(room22);
    room1.setEast(room2);
    room1.setSouth(room21);

    room2.setEast(room3);
    room2.setSouth(room13);
    room2.setWest(room1);

    room3.setWest(room2);
    room3.setEast(room4);

    room4.setWest(room3);
    room4.setSouth(room5);

    room5.setNorth(room4);
    room5.setWest(room19);
    room5.setSouth(room6);

    room6.setNorth(room5);

    room7.setNorth(room17);
    room7.setWest(room8);

    room8.setWest(room9);
    room8.setEast(room7);

    room9.setNorth(room10);
    room9.setEast(room8);

    room10.setNorth(room20);
    room10.setEast(room11);
    room10.setSouth(room9);

    room11.setWest(room10);
    room11.setEast(room12);
    room11.setSouth(room14);

    room12.setWest(room11);
    room12.setEast(room13);

    room13.setWest(room12);
    room13.setNorth(room2);
    room13.setSouth(room16);

    room14.setNorth(room11);
    room14.setSouth(room17);

    room15.setSouth(room18);

    room16.setNorth(room13);
    room16.setSouth(room19);

    room17.setNorth(room14);
    room17.setEast(room18);
    room17.setSouth(room7);

    room18.setWest(room17);
    room18.setNorth(room15);
    room18.setEast(room19);

    room19.setNorth(room16);
    room19.setWest(room18);
    room19.setEast(room5);

    room20.setSouth(room10);
    room21.setNorth(room1);
  }

  public void createItems(){
    room2.addRoomItem(ceremonyClub);       // first weapon, hidden until torch is ignited
    room3.addRoomItem(snekNCbraSlab);      // for Room 7
    room5.addRoomItem(ironBar);           // trash weapon, too heavy
    room5.addRoomItem(sjDagger);           // magic weapon
    room5.addRoomItem(sjMedallion);        // healing item
    room7.addRoomItem(twoSnekSlab);        // for Room 2
    room7.addRoomItem(snakeRod);           // the key for the door, open in Room 2
    room8.addRoomItem(threeSnekSlab);      // for Room 3
    room9.addRoomItem(torch);              // for igniting in Room2 or 3, lighting Room2, once insight > 2
    room9.addRoomItem(spiralSnekSlab);    // for Room 9, starts in position, but can be moved
  }
  }

