package com.company;

public class MapCreator {

  Room room1 = new Room("Room 1","You're in the torch-lit entryway of the burial mound. Vines run like snakes across the down-sloping ceiling.\n" +
      "The air in here feels clammy. The passage narrows slightly as it goes down into the mound, then branches left and right.",
      "You're back in the entry hallway.");
  Room room2 = new Room("Room 2","Very little light gets into this room from the opposite side.\n" +
      "You fumble your way through the room, as your eyes can't really adjust to the darkness\n" +
      "The room appears to store... some kind of furniture, maybe?",
      "You're in the cluttered dark room.");
  Room room3 = new Room("Room 3","There's a lit torch here in the corner! It's nailed to the wall, though...\n" +
      //if (!SnekNCbraSlabCollected) {}
      "There is a square stone-slab on the floor, next to an indentation on the wall",
      "You're in the room with the torch on the wall.");
  Room room4 = new Room("Room 4", "You can't even see half of this room, since part of the mound has collapsed. \n" +
      "You think you can spot an exit beyond it",
      "You're in the partially collapsed room.");
  Room room5 = new Room("Room 5", "You're finally inside the burial chamber.\n" +
      "It's very warm in here, since the room is flooded with light from a large firepit on the backwall.\n" +
      "In the middle of the room, stands a gruesome stone altar, complete with one of those, ughh, heart-troughs, in the middle...\n" +
      "There are four golf-ball-sized holes around the top of it... for draining the blood?... yuck!",
      "You run back into the burial chamber, and try to shut the door, but it's too late. You're trapped, and the creatures overwhelm you!");
  Room room6 = new Room("Room 6", "In here, it's so dark, you can barely make out the bizarre-looking edges of the strange fungi, that sprawl across the wall.\n" +
      "They smell sweet, like flowers, but stronger, and more unpleasant... It almost make you feel dizzy.",
      "You hold your breath, as you rush past the suspicious fungi.");
  Room room7 = new Room("Room 7", "A thick cluster of vines hang from the ceiling in the middle of the room\n" +
      "There's a massive clay jar in the corner." +
      //if (!inventory[].contains."2SnekSlab) {
      " A square stone-slab is embedded in the wall. Two Snakes, huh? This one has a hole in the middle... Curious...",
      "You're in the room with the clay jar.");
  Room room8 = new Room("Room 8", "A giant stone door blocks the path to the burial chamber\n" +
      "In the cold air, it looks like it's billowing smoke from it's sides.",
      "You're back at the stone door.");
  Room room9 = new Room("Room 9", "A dimly lit room. It seems empty, except for the rocks and pebbles that litter the floor, from a collapsed wall.",
      "You're back in the dimly lit room.");

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

/*
    private void createItems() {
      room2[].addItem(new Item(ItemType.ceremonyClub));       // first weapon, hidden until torch is ignited
      room3[].addItem(new Item(ItemType.snekNCbraSlab));      // for Room 7
      room4[].addItem(new Item(ItemType.thickVines));         // can't pickup, but used to swing into and floor a zombie
      room5[].addItem(new Item(ItemType.ironBar, 2));         // trash weapon, too heavy
      room5[].addItem(new Item(ItemType.sjDagger));           // magic weapon
      room5[].addItem(new Item(ItemType.sjMedallion));        // healing item
      room7[].addItem(new Item(ItemType.twoSnekSlab));        // for Room 2
      room7[].addItem(new Item(ItemType.snakeRod));           // the key for the door, open in Room 2
      room8[].addItem(new Item(ItemType.threeSnekSlab));      // for Room 3
      room9[].addItem(new Item(ItemType.torch));              // for igniting in Room2 or 3, lighting Room2, once insight > 2
                                                              // if (!>2) sout "Hmm... I'm not sure where to use it yet..."
      room9[].addItem(new Item(Item type.spiralSnekSlab));    // for Room 9, starts in position, but can be moved
      }


*/
  }
}

