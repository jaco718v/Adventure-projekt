package com.company;

import java.util.ArrayList;
import java.util.Random;

public class MapCreator {
    Random izer = new Random();

  Room room0 = new Room("room0", "\u001B[42m7 hours later, Gabriel's plane touches down in the very heart of Africa. After a short drive, Gabriel arrives at the burial mound... \n" +
          "\"(Whistle)... a Wheel-within-a-wheel! Like a vèvè... It's a little bigger, than I thought it'd be.\"\n",
      "The landscape is otherwise flat around the burial mound, sitting at the mouth of the valley.", null);
  Room room1 = new Room("room1", "\u001B[40m\u001B[33mYou're in the floodlit entryway of the burial mound. Vines run like snakes across the down-sloping ceiling.\n" +
      "The air in here feels clammy, as humid as outside, but immediately colder...\n" +
      "The passage narrows slightly as it goes down into the mound, then branches left and right.\n" +
      "It doesn't exactly beckon you in. Could this humble dirt mound really be the final resting place of a voodoo queen?",
      "There isn't much to find in this room. An wide central corridor with, it seems, three exits.\n" +
      "You notice there's a diamond-shaped stone slab above the entryway... A single snake slithers across it. Ominous.", "You're back in the entry hallway.");
  Room room2 = new Room("room2", "A naked room, still reached by the light from the entryway. There's just... nothing in this whole room.\n" +
      "The door leads on, on the opposite side.","Nothing was found.","You're in an empty room.");
  Room room3 = new Room("room3", "This room is immediately darker than the previous one, and a bit bigger, like a hall. Gabriel resists the urge to test the echo. \n" + //optionalString + "\n" +//
      "The ceiling seems to have partially caved in, yet, no light from the outside breaks through... The floor is wide and appears to have been swept recently",
      "It's hard to really see anything in here... wait, what's this?", "You're in the darkened hall.");
  Room room4 = new Room("room4", "You're standing in a a dimly lit room. More vines crawl across the uneven walls, that block out the light. There's a faint shine from the doorway, coming from the inside of the mound.\n" +
      "There's a mural of tribal art on the wall. The images remind Gabriel of the descriptions of African tribal culture, Gunther recounted in his journal... Could these primitive drawings be a reference to Tetelo?",
      "There are a few dry, stiff brushes on the ground, nothing of interest.",
      "You're in the room with the mural.");
  Room room5 = new Room("room5", "This room is a little bit smaller, and noticeably tidy. A banner with a tribal symbol hangs from the vaulted ceiling. \n" +
      "It would appear, this hallway originally had four exits, but the one in the far corner is now clearly blocked off by rubble.",
      "There isn't much of interest in the hallway", "You're in the cross-shaped hallway.");
  Room room6 = new Room("room6", "The room is lit with an array of almost completely melted candles, that cover the shelf of a small ritual shrine. ",
      "An area of the wall next to the shrine has been used as a sort of guestbook. The strange scribbling on the wall looks like a voodoo cypher, but the only marks that remain are inchorent and barely legible." +
          "Tucked away in the corner lies an ornate club. It looks to be a more ritualistic instrument, than a weapon",
      "You're at the shrine with the melted candles.");


  Room room7 = new Room("room7", "This room bends a bit closer to the central circular mound. The curve of the ceiling seems to be almost looming over you.",
      "You rummage around the sparse furniture, and discover an old torch in a crate in the corner", "You're in the inwards bending room");
  Room room8 = new Room("room8", "You can see the rays of the early sunset slip through cracks in the ceiling of the neighbouring room. Their diffused light floods half of this room, while leaving the other in contrasting darkness.",
      "There are some animal bones in the corner of the room... and... a strange statue..?", "You're in the half-lit room.");
  Room room9 = new Room("room9", "The cracks in the ceiling run wide and across the room. Outside, the sun appears to be about to set. The outer wall seems to have sustained some damage. Next to the crumbled wall is a large hole in the ground.",
      "Peeking over the hole's edge, you can just barely make out the contours of the chamber beneath, as if some of other cracks in the mound, are letting sunlight into it as well.", "You're in the room with the hole in the ground.");
  Room room10 = new Room("room10", "Much of this room's wall has collapsed... It even seems recent. A few cracks in the ceiling let in just enough light to see the room properly. There are rocks and gravel strewn about the floor, and two exits on the opposite side.", "Not so much more here, but rubble.", "You're in the collapsed room.");


  Room room11 = new Room("Room 11", "This room is so vastly different from the others... Beautiful mahogany panels line the wall, like it was an uptown penthouse...\n" +
      "A bookshelf has been carved into the wall, over a workbench, while another slim table curves out from the wall, giving this corner a barroom-like feel.\n" +
      "It would seem almost homey, if, indeed, Gabriel was living under such luxurious conditions, normally...",
      "In here, you've found a delicate rod of a dark metal, fashioned like two intertwining snakes.",
      "You're back in the lounge room");
  Room room12 = new Room("Room 12", "\u001B[40m\u001B[37mVery little light gets into this room from the opposite side. The room is so packed and cluttered, it's difficult to traverse.\n" +
      "You fumble your way through the room, as your eyes can't really adjust to the darkness. The room appears to store... some kind of furniture, maybe?\u001B[33m",
      "dark", "\u001B[40m\u001B[37mYou're in the cluttered dark room.\u001B[33m");
  Room room13 = new Room("Room 13", "\u001B[0m\u001B[33mThis room is brightly floodlit with warm flickering light... There's a torch here in the corner! It's nailed to the wall, though...\u001B[40m\n",
      "\u001B[0m\u001B[33mThere is a square stone-slab sitting in a depression in the wall.\u001B[40m", "\u001B[0m\u001B[33mYou're in the room with the torch on the wall.\u001B[40m");
  Room room14 = new Room("Room 14", "\u001B[40m\u001B[37mYou can't see much of this room, it's very dark. You think you can spot an exit beyond it\u001B[33m",
      "dark", "\u001B[40m\u001B[37mYou're in a dark, curved room.\u001B[33m");
  Room room15 = new Room("Room 15", "You're finally inside the burial chamber.\n" +
      "It's very warm in here, since the room is flooded with light from a large fire pit on the back wall.\n" +
      "In the middle of the room, stands a gruesome stone altar, complete with one of those, ughh, heart-troughs, in the middle...\n",
      "There are four golf-ball-sized holes around the top of the altar... for draining the blood?... yuck!\n" +
          "There's a fire pit on the back wall, bathing the room in a warm orange. There's a rack on the wall, holding two iron bars.",
      "You run back into the burial chamber, and try to shut the door, but it's too late. You're trapped, and the creatures overwhelm you!");
  Room room16 = new Room("Room 16", "A thick cluster of vines hang down in the centre of the room. The inner wall is shrouded in darkness, as it curves around the central chamber",
      "There is a heavy bundle of vines hanging down from the ceiling.", "You're in the room with the thick vines.");
  Room room17 = new Room("Room 17", "A dimly lit room. It seems empty, except for the rocks and pebbles that litter the floor, from a collapsed wall.",
      "searchtext", "You're back in the dimly lit room.");
  Room room18 = new Room("Room 18", "A giant stone door blocks the path to a central chamber.", "In the cold air, it looks like it's billowing smoke from it's sides.",
      "You're back at the stone door.");
  Room room19 = new Room("Room 19", "\u001B[40m\u001B[37mThis room is shrouded in darkness...\u001B[33m",
      "dark","\u001B[40m\u001B[37mYou're in a dark room.\u001B[33m");

  Room room20 = new Room("room20", "descrp20", "searchtext", "recap");
  Room room21 = new Room("room21", "descrp20", "searchtext", "recap");
  Room room22 = new Room("room22", "A variety of racks and other furniture is stored here... of course! The zombies were hiding behind it, impossible to make out in the darkness,", "There's a chest in the corner.", null);
  Room room23 = new Room("room23", "Gabriel repels down the hole, and finds himself in another storage room. The colors of the items immediately show up in the relative darkness of the pit. A selction of their party articles are kept here; costumes, ritual paints, instruments... the works", "There is a part of a broken staircase, that used to lead up to the room above.", "You're in the storage basement.");
  Room room26 = new Room("I don't wanna leave just yet...", "I don't wanna leave just yet...", "recap", null);


  /* //Starting inventory(3) options
   Item rope = new Item("Rope", -1,false,true,false,"use in room 19, and/or 9","Nylon Rope", "Gabriel brought this with him from Schloss Ritter!? Seems to me, he must be an experienced adventurer!");
   Item notes = new Item("Notebook", -1,false,false, false,"decrypt scroll, create picture item when 'examine notes'","Gabriel's Notebook","These are Gabriel's research notes, a diary of sorts, of his investigation of the Voodoo Murders case. It also contains bit of Gunther's account of the Gedde tribe, and Moonbeam's voodoo ciphers. It's gonna make the book a bestseller!");
   Food fluid = new Food("Tequila", -1,true,true,false,"open, use lemon and salt on rusted grate","Tequila Travel Box Set", "");
//Semi-useful
   Food food = new Food("Sausages", -1,true,false,false,"+2 Health","Cold \"Weisswurst\"", "Gabriel bought these in Munich. They have, naturally, long gone cold. Gabriel isn't sure, if he should eat them, now...");
   Item charm1 = new Item("Charm", -1,true,false,false,"15% chance of teleport to lower room number, when attacked","Wölpertinger Tail Charm", "Gabriel met a street-peddler in Munich... Now, he is the lucky owner, of a \"a real Wölpertinger tail\"... heh, whatever that is! This voodoo, gris-gris nonsense must've gotten to his head!");
   Item charm2 = new Item("Phoenix Feather Pendant", -1, false, false, false, "continue-system active", "Phoenix Feather Pendant", "A gorgeous red jasper, carved into the likeness of a feather. It is said to be a real feather from a phoenix.");

   Item NSEW = new Item("Compass", -1,false,false,false, "currently none", "Field Compass", "Hah! Gabriel stole this, while he was in the military. Well, at least, he KEPT it, all these years. It points in the direction of the magnetic north.");
   Item hammer = new Item("Hammer", 3,false,false, false,"none","Toolkit Hammer", "It's a regular hammer, with a stocky head, and a long peen. Heh, now that definitely doesn't belong to Gabriel.");
//Useless
   Item book = new Item("Book", 1,true,true, false, "none","Rada Drum Code", "The Gedde henchmen used these code patterns to communicate encrypted messages across the french quarter, while passing for simple buskers. But why did Gabriel bring this with him to Africa?");
   Item keys = new Item("Keys",-1,false,false,false,"none","St. George Keychain", "These are the keys for the bookstore, an unused gym locker, and, of course, Gabriel's motorcycle. Never leave home without them.\nThe ring is fashioned to look like a dragon, impaled on a curving lance.");
   Item regMap = new Item("Map", -1,false,true,false,"none","Red Basin Topographical Map", "Gabriel brought a map of the local area... But the driver already knew the site of the burial mound! Not much use, now...");
   Item cefa = new Item("Money", -1,false,false,false,"none","CFA Francs (7.000 f)", "This is the currency of Benin... Gabriel exchanged all of his cash at the airport.");
   Item wallet = new Item("Wallet", -1,false,false,false,"none","Moesby's Wallet & Badge", "Gabriel enjoyed his flight to Africa, almost as much, as he enjoyed his flight to Munich... Thank you, \"American's Repressed\". I wonder how Moesby will react, when he finds out?");
   Item tracker = new Item("Tracker", -1,false,true,false,"none","Tracking Device (with signal device)", "This is the toy, that Gabriel snuck out, from the poli... correction... that he ALSO stole, from the police office! He really should've \"snuck\" that back in.");
   Item paint = new Item("Paints", -1,false,false,false,"none","Ritual Body Paint", "Gabriel had Grace paint voodoo totems on his chest, when he snuck into the conclave in the bayou... Urgghh. He wouldn't want to go through that ordeal again.");
   Item bangle = new Item("Bracelet", -1,false,false,false, "none","Cult Snake Bracelet", "Gabriel had Marcus cast this, in order to pass himself off as a member of the voodoo cult... to his credit, it really does look like a thing of evil. Who is planning to fool, this time?");
//----------------------------------------------------------------------------------
//in Dungeon
   Item picture = new Item("Picture",-1, false,false,false, "adds to currentRoom, when 'examine Notes'","Picture of Snake Mound","A sun-worshipper burial site in Africa... Huh. It looks almost like the one Gabriel is exploring.");
*/
    PseudoItems remainz = new PseudoItems("Remains", "Tetelo's Remains");
    PseudoItems grill = new PseudoItems("Grate", "Rusted Grate");
    PseudoItems quarry = new PseudoItems("Rockpile", "Pile of rocks");
    PseudoItems jar = new PseudoItems("Clay Jar", "Huge Ceramic Jar");

    Item bonez = new Item("Bones", true,false,"none","Animal Bones","...at least, you THINK, these are animal bones.");

    //ThrownWeapon sRock = new ThrownWeapon("Rock", 2,false,false,"none","Small Rock", "It's like a rock. Only smaller.");
    //ThrownWeapon bRock = new ThrownWeapon("Rock", 4,true,false, "none","Rock","It's a rock");
    Item rock = new Item("Rock", true,true, "none","Rock", null);
            //  When player.inventory().contains [Item] rock, destroy and replace with (%2==0) sRock or bRock.
    Food waakye = new Food("Stew", true,false,"1 Health, 5 poisonDMG","Bean Stew","A stew containing beans, rice, pasta, and meat, and some ingredients Gabriel doesn't recognise. It's gone cold.", 1,5);

    Container set = new Container("Boxset",true,false, "none","Tequila Set", "Gabriel picked this up from the Tax-Free store at the airport. Haha, even now, he still thinks only of partiying?");
    //ThrownWeapon glass = new ThrownWeapon("Glass", false, false, "none", "Shotglass", "There were two of these in the Tequila Box Set. As if Gabriel wouldn't rather drink from the bottle!");
    RangedWeapon bottle = new RangedWeapon("Tequila", 2, izer.nextInt(6)+3,false, false,"none","Bottle of Tequila","Party time! I'd thought Gabriel would prefer more of a... \"guido\" kind of cocktail.");
    Item juice = new Item("Lemon", false,false, "none","Lemon Juice Dispenser", "This came in the Tequila Box Set... What is the order now, again? Salt first, then lemon, then... no...");
    Item salt = new Item("Salt", false,false,"none","Salt Shaker", "This small salt shaker was also included in the Tequila Box Set. It is, what you'd expect. Table salt in a cheap plastic dispenser.");

    Container box = new Container("Coffin",true,true,"can open, is empty, sout ...contains nothing of interest, at the moment", "Sèkey Madoulè","It's a small ritual coffin, the size of a large handbag, used for voodoo rituals, especially in sacrificial rites.");
    Item pot = new Item("Kiln", true,true,"none","Kiln (with Pestle)","Pressumeably, the cult would use this to grind the plants or roots, they make their drugs from. It is empty.");
    Item mask1 = new Item("Mask", false,true,"if inventory.contains(mask2) {setOccupant}", "Lion Mask","\"A Lion mask! Hah. That's what I should have gone as, for the conclave.\"");
    Item mask2 = new Item("Mask", false,true,"if inventory.contains(mask1) {setOccupant}", "Snake Mask","A snake mask, not unlike \"good ol' Jerry\". \"Brother Snake\" might have been too obvious for a disguise, though.");
    Item robe = new Item("Gown", false,false,"valuable: 40 $, if inventory.contains(costume) {toggleOccupant}\"","Tribal Gown", "A simple, long tribal dress. Nothing fancy, but it looks old. Could be valuable.");
    Item costume = new Item("Dress", false,false,"valuable: 65 $, if inventory.contains(robe) {toggleOccupant}","Totemic Animal Dress","A ritualistic gown, made with dark fur from some animal... It seems to be part of a set with the wolf mask.");
    Item gourd = new Item("Gourd",false,false,"valuable: 75 $","Ritual Gourd","An ason, an instrument similar to the maraca, a ritual rattle used in trance-related voodoun practices.");
    Item blood = new Item("Jar", true,true,"none","Harou Of Bloodpaint","It's one of those special jars, the voodoo cult uses to store ritual paint in, for making their vèvès.");
    Item pouch = new Item("Powder", true,false,"use with mask1 in inventory, for 1 extra sout","Pouch of Powder","This is the hypnotic drug, Dr. John blew in Gabriel's face, during the bayou conclave, to weaken his spirit for Loa possesssion... Powerful stuff. It ought to be illegal!");
    Item drum = new Item("Drum", true,true,"none","Rada Drum","It's a simple animal skin drum, used in voudoun ritual practices. And, as Gabriel learned, also, as an encryption device for secret cult communiquès.");

    Container baobShell = new Container("Fruit", true,false, "+4 Health", "Strange Fruit", "This large fruit has a hard brown shell, with a fuzzy surface.");
    Food baobab = new Food("Fruit", true,false, "+4 Health", "Strange Fruit", "This large fruit has a hard brown shell, with a fuzzy surface. Breaking it open revealed the white endocarp inside,\nit looks like a mix of a coconut and a mango. It smells okay.",4,0);
    RangedWeapon ceremonyClub = new RangedWeapon ("Club",3,izer.nextInt(5)+2,false,false,"valuable: 60 $","Ceremonial Club", "It is old, for sure. It seems to be for ritualistic practice, rather than a weapon, and doesn't have much heft to it.");
    Item codedScroll = new Item("Scroll", false,false,"decryption minigame:","Coded Scroll", "These strange markings seem familiar... Yes, Gabriel thinks this code IS similar, to the one he saw in St.Louis Cemetery #1.");

    MeleeWeapon snekRod = new MeleeWeapon("Rod", 4,false,false,"key for the lock, room12","Snake Rod", "An intricate cast, from an unfamiliar, lightweight dark metal. It's design looks like two intertwining snakes... Something about this strange item, feels... disturbing.");
    Item skulSlab = new Item("Slab", false,true,"keystone1","Skull Slab", "A square, heavy stone slab. It features a prominent skull design, but there's a hole through the slab, in the right eye socket.");
    Item skulSnekSlab = new Item("Slab", false,true,"keystone3","Skull & Snake Slab", "A square, heavy stone slab. It is decorated with the carving of a snake, coiling itself around a skull.");
    Item snekSkulSlab = new Item("Slab", false,true,"keystone2","Snake & Skull Slab", "A square, heavy stone slab. The front is adorned with a prominent skull, with a snake slithering through the eye sockets");
    //ThrownWep torch = new ThrownWep("Torch", 1,true,true,"light room 12 once, then die out","Empty Torch", "\"Ahh, shucks, the canister is completely dry... The wick still feels oily, though!\" It may yet burn, but not for very long.\nGabriel is thinking, he would have brought his own torch, if there had been any at Schloss Ritter.");
    // the torch should disappear upon use, so it's illegal

    MeleeWeapon liftingBar = new MeleeWeapon("Bar", 7,false,false,"prepares eventEntity(room15)","Iron Bar", "A heavy iron bar. Whew... It reminds Gabriel, that he hasn't been using his gym membership in months... It is slightly rusted.");
    MeleeWeapon sjKnife = new MeleeWeapon("Dagger", 5,false,false,"damage boost when 'equip'","Schattenjäger Dagger", "A Ritter family heirloom. It doesn't look like much, certainly nothing like St. George's sword... I guess it'll have to do.");
    //Talisman sjMedallion = new Talisman("Talisman", 3,false,false,"heals up to 11 Health, cures venom, dagger boost","Schattenjäger Talisman", "Now, this is more like it. A relief of a lion fighting a snake adorns the front of the medallion.\n" +
//         "It looks blocky, it's really thick, and seems to be of solid gold... Whoa, certainly weighs like solid gold, too...\n" +
//         "I'm gonna break my back, wearing this thing!... but jokes aside, there is true power in this amulet. Gabriel can feel it affecting him, when he holds it.");

    Item jewel1 = new Item("Ruby",false,false,"valuable: 5.800 $, cursed, permanent lose 1 insight if touched, 50/50 to receive when taking illegal Item from room23","Teardrop Ruby","A beautiful blood red stone in a teardrop cut. Undoubtedly quite valuable... Gabriel hopes for the eventual buyer, the jewel isn't cursed.");
    Item jewel2 = new Item("Saphire",false,false,"valuable: 6.600 $, 50/50 to receive when taking illegal Item from room23","Teardrop Saphire","A beautiful deep blue stone in a teardrop cut. Undoubtedly quite valuable.");
    Item jewel3 = new Item("Belt",false,false,"valuable: 2.250 $, found behind Grate","Snakescale Belt","A belt in a shimmering snakescale-like design, with an elaborate emerald buckle. Undoubtedly quite valuable.");
    Item jewel4 = new Item("Coin", false,false,"valuable: 175-240 $, found from random Event (multiples possible).", "Ancient Tribal Coin","This gold coin is obviously ancient... And probably rare. Undoubtedly quite valuable.");


  public void setRoomConnections() {
    room0.setWest(room26);
    room0.setNorth(room26);
    room0.setEast(room1);
    room0.setSouth(room1);

    room1.setWest(room26);
    room1.setNorth(room26);
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
    //room9.setDOWN(room23);

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
    //room23.setUP(room9);
  }
  public void setItems() {
        room0.addRoomItem(baobShell);
        room0.addRoomItem(bonez);

        room5.addRoomItem(rock);
        room9.addRoomItem(rock);
        //room9.addRoomItem(sRock);
        room10.addRoomItem(rock);   //everytime room10 is entered
        room20.addRoomItem(rock);   //everytime room20 is entered
        room21.addRoomItem(rock);

        room21.addRoomItem(grill);
        room20.addRoomItem(grill);
        room20.addRoomItem(quarry);
        room17.addRoomItem(jar);

        room16.addRoomItem(bonez);
        room6.addRoomItem(ceremonyClub);
        room8.addRoomItem(baobShell);
        room11.addRoomItem(codedScroll);

        room11.addRoomItem(snekRod);          // the key for the door, open in room12
        room17.addRoomItem(skulSlab);
        room13.addRoomItem(skulSnekSlab);     // In the correct socket, but can be taken if inventory.contains(snekRod)
        room7.addRoomItem(snekSkulSlab);
        //room9.addRoomItem(torch);             // for igniting in room12 or 13, for room12 eventEntity, once insight > 5

        room15.addRoomItem(liftingBar);
        room15.addRoomItem(liftingBar);
        //room15.addRoomItem(sjKnife);        // Received from room18 eventEntity "Uncle Wolfgang"
        //room15.addRoomItem(sjMedallion);    // Received from room15 eventEntity "...and open sesame!"

        room1.addRoomItem(set);
        set.addContainedItem(bottle);
        set.addContainedItem(salt);
        set.addContainedItem(juice);
        //set.addContainedItem(glass);
        //set.addContainedItem(glass);

        room23.addRoomItem(box);
        room23.addRoomItem(pot);
        room23.addRoomItem(mask1);
        room23.addRoomItem(mask2);
        room23.addRoomItem(robe);
        room23.addRoomItem(costume);
        room23.addRoomItem(gourd);
        room23.addRoomItem(blood);
        room23.addRoomItem(pouch);
        room23.addRoomItem(drum);
        //room23.addRoomItem(jewel X); */
    }
}
