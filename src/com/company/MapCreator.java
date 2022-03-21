package com.company;

import java.util.ArrayList;

public class MapCreator {
  //String optionalString = player.getCurrentRoom().getOptionalString()
  //ArrayList<Item> roomItems = getCurrentRoom().getRoomItems();
  //for (int i = 0; i <= )

  ArrayList<Item> room1Items = new ArrayList<>();
  ArrayList<Item> room2Items = new ArrayList<>();
  ArrayList<Item> room3Items = new ArrayList<>();
  ArrayList<Item> room4Items = new ArrayList<>();
  ArrayList<Item> room5Items = new ArrayList<>();
  ArrayList<Item> room6Items = new ArrayList<>();
  ArrayList<Item> room7Items = new ArrayList<>();
  ArrayList<Item> room8Items = new ArrayList<>();
  ArrayList<Item> room9Items = new ArrayList<>();
  ArrayList<Item> room10Items = new ArrayList<>();
  ArrayList<Item> room11Items = new ArrayList<>();
  ArrayList<Item> room12Items = new ArrayList<>();
  ArrayList<Item> room13Items = new ArrayList<>();
  ArrayList<Item> room14Items = new ArrayList<>();
  ArrayList<Item> room15Items = new ArrayList<>();
  ArrayList<Item> room16Items = new ArrayList<>();
  ArrayList<Item> room17Items = new ArrayList<>();
  ArrayList<Item> room18Items = new ArrayList<>();
  ArrayList<Item> room19Items = new ArrayList<>();
  ArrayList<Item> room20Items = new ArrayList<>();
  ArrayList<Item> room21Items = new ArrayList<>();
  ArrayList<Item> room22Items = new ArrayList<>();
  ArrayList<Item> room23Items = new ArrayList<>();


  Room room0 = new Room("Room 0","After discovering his Uncle Wolfgang had departed from Germany in a rush, Gabriel searched manically through the Schloss Ritter library...\n" +
          "After long hours of study, and attempting a purification ritual in the Chapel, Gabriel decides his one and best lead would be the texts that suggest a link between the Gedde tribe, and the one described in Gunther's Journal." +
          "Thankfully, Gabriel has held onto has Moesby's \"American's Repressed\" card... Heh, and it's not like he didn't already overcharge it!" +
          "7 hours later, Gabriel's plane touches down in eastern Africa." +
          "You have arrived at the burial mound... \"(Whistle)... a Wheel-within-a-wheel!\" \n",
          "The landscape is otherwise flat, all around the burial mound.","recap", null);
  Room room1 = new Room("Room 1","You're in the floodlit entryway of the burial mound. Vines run like snakes across the down-sloping ceiling.\n" +
          "The air in here feels clammy, as humid as outside, but immediately colder... The passage narrows slightly as it goes down into the mound, then branches left and right.\n" +
          "It doesn't exactly beckon you in. Could this humble dirt mound really be the final resting place of a voodoo queen?",
          "There isn't much to find in this room. Open space, with, it seems, three exits. You notice, there's a diamond-shaped stone slab above the entryway.\n" +
                  "A single snake slithers across it.","You're back in the entry hallway.", room1Items);
  Room room2 = new Room("Room 2","A naked room, still reached by the light from the entryway. There's just... nothing in this whole room. The door leads on, on the opposite side.",
          "Nothing was found.", "You're in an empty room.", room2Items);
  Room room3 = new Room("Room 3","This room is immediately darker than the previous one, and a bit bigger. " + //optionalString + "\n" +//
          "The ceiling seems to have partially caved in, yet, no light from the outside breaks through... The floor is wide and appears to have been swept recently",
          "It's hard to really see anything in here... wait, what's this?","You're in the darkened hall.", room3Items);
  Room room4 = new Room("Room 4","You're standing in a a dimly lit room. The walls are a bit uneven here, blocking out the light. There's a faint shine from the doorway, coming from the inside of the mound.\n" +
          "There's a mural of tribal art on the wall. The images remind Gabriel of the descriptions of African tribal culture, Gunther recounted in his journal... Could these primitive drawings be a reference to Tetelo?",
          "There are a few dry, stiff brushes on the ground, nothing of interest.",
          "You're in the room with the mural.", room4Items);
  Room room5 = new Room("Room 5","This room is a little bit smaller, and noticeably tidy. A banner with a tribal symbol hangs from the vaulted ceiling. \n" +
          "It would appear, this hallway originally had four exits, but the one in the far corner is now clearly blocked off by rubble.",
          "There isn't much of interest in the hallway", "You're in the cross-shaped hallway.", room5Items);
  Room room6 = new Room("Room 6","The room is lit with an array of almost completely melted candles, that cover the shelf of a small ritual shrine. ",
          "An area of the wall next to the shrine has been used as a sort of guestbook. The strange scribbling on the wall looks like a voodoo cypher, but the only marks that remain are inchorent and barely legible." +
                  "Tucked away in the corner lies an ornate club. It looks to be a more ritualistic instrument, than a weapon",
          "You're at the shrine with the melted candles.", room6Items);


  Room room7 = new Room("Room 7","This room bends a bit closer to the central circular mound. The curve of the ceiling seems to be almost looming over you.",
          "You rummage around the sparse furniture, and discover an old torch in a crate in the corner", "You're in the inwards bending room" , room7Items);
  Room room8 = new Room("Room 8","You can see the rays of the early sunset slip through cracks in the ceiling of the neighbouring room. Their diffused light floods half of this room, while leaving the other in contrasting darkness.",
          "There are some animal bones in the corner of the room... and... a strange statue..?" , "You're in the half-lit room.", room8Items);
  Room room9 = new Room("Room 9","The cracks in the ceiling run wide and across the room. Outside, the sun appears to be about to set. The outer wall seems to have sustained some damage. Next to the crumbled wall is a large hole in the ground.",
          "Peeking over the hole's edge, you can just barely make out the contours of the chamber beneath, as if some of other cracks in the mound, are letting sunlight into it as well." , "You're in the room with the hole in the ground.", room9Items);
  Room room10 = new Room("Room 10","Much of this room's wall has collapsed... It even seems recent. A few cracks in the ceiling let in just enough light to see the room properly. There are rocks and gravel strewn about the floor, and two exits on the opposite side.", "Not so much more here, but rubble." , "You're in the collapsed room.", room10Items);


  Room room11 = new Room("Room 11","This room is so vastly different from the others... Beautiful mahogany panels line the wall, like it was an uptown penthouse...\n" +
      "A bookshelf has been carved into the wall, over a workbench, while another slim tableplate curves out from the wall, giving the room a barroom-like feel.\n " +
      "It would seem almost homey, if, indeed, Gabriel was living under such luxurious conditions, normally...",
      "You find a delicate rod of a dark metal, fashioned like two intertwining snakes.",
      "You're back in the lounge room", room11Items);
  Room room12 = new Room("Room 12","Very little light gets into this room from the opposite side. The room is so packed and cluttered, it's difficult to traverse.\n" +
      "You fumble your way through the room, as your eyes can't really adjust to the darkness. The room appears to store... some kind of furniture, maybe?",
      "This room is dark. Trying to search it, you stumble and hurt yourself.","You're in the cluttered dark room.", room12Items);
  Room room13 = new Room("Room 13","This room is brigthly floodlit with warm flickering light... There's a torch here in the corner! It's nailed to the wall, though...\n",
      "There is a square stone-slab sitting in a depression in the wall","You're in the room with the torch on the wall.", room13Items);
  Room room14 = new Room("Room 14", "You can't see much of this room, it's very dark. You think you can spot an exit beyond it",
      "You aren't going to find anything in a room this dark. You trip over a crooked floor tile, and scrape your kneecap. Annoying!","You're in a dark, curved room.", room14Items);
  Room room15 = new Room("Room 15", "You're finally inside the burial chamber.\n" +
      "It's very warm in here, since the room is flooded with light from a large firepit on the backwall.\n" +
      "In the middle of the room, stands a gruesome stone altar, complete with one of those, ughh, heart-troughs, in the middle...\n",
      "There are four golf-ball-sized holes around the top of the altar... for draining the blood?... yuck!\n" +
              "There's a firepit on the backwall, bathing the room in a warm orange. There's a rack on the wall, holding two iron bars.",
          "You run back into the burial chamber, and try to shut the door, but it's too late. You're trapped, and the creatures overwhelm you!", room15Items);
  Room room16 = new Room("Room 16", "A thick cluster of vines hang down in the centre of the room. The inner wall is shrouded in darkness, as it curves around the central chamber",
      "There is a heavy bundle of vines hanging down from the ceiling.", "You're in the room with the thick vines.", room16Items);
  Room room17 = new Room("Room 17", "This room is shrouded in darkness", "Trying to navigate the darkness, you stub your toe on an awkward floorpanel","You're in a dark room.", room17Items);
  Room room18 = new Room("Room 18", "A giant stone door blocks the path to the burial chamber.","In the cold air, it looks like it's billowing smoke from it's sides.",
      "You're back at the stone door.", room18Items);
  Room room19 = new Room("Room 19", "A dimly lit room. It seems empty, except for the rocks and pebbles that litter the floor, from a collapsed wall.",
      "searchtext","You're back in the dimly lit room.", room19Items);

  Room room20 = new Room("Room 20","descrp20", "searchtext", "recap", room20Items);
  Room room21 = new Room("Room 20","descrp20", "searchtext","recap", room21Items);
  Room room22 = new Room("I don't wanna leave just yet...","I don't wanna leave just yet...", "searchtext", "recap", room22Items);

  Item ceremonyClub = new Item("Club", "Ceremonial Club");
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
/*
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

 */
}

