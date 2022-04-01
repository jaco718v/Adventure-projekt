package com.company;

import java.util.ArrayList;

public class Player {
  private Room currentRoom;
  private int health = 35;
  private ArrayList<Item> inventory = new ArrayList<Item>();
  private Weapon equippedWeapon;
  private int insight;                            // insight increments when:
  private int darkSearchCount = 0;                // a Slab is currently in the correct socket (+3)
  private boolean blockFlag=false;                // Inscription over the door is read (permanent + 2)
  private boolean evadeFlag=false;                // Coded Scroll decrypted (permanent +1)
  private boolean fleeFlag=false;                 // room1 is searched (permanent +1)
  private boolean enemyBlockFlag=false;

  public Player(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public boolean playerDeath(){
    if(health<1){
      return true;
    }
    return false;
  }

  public int getDarkSearchCount() { return darkSearchCount; }
  public void setDarkSearchCount() {this.darkSearchCount += 1;}

  public HpCase hpStatus(){
      if( health>30){
        return HpCase.Unhurt;}
      else if (health>26){
        return HpCase.Bruised;}
      else if (health>21){
        return HpCase.Wounded;}
      else if (health>15){
        return HpCase.Injured;}
      else if (health>10){
        return HpCase.Crippled;}
      else if (health>4){
        return HpCase.Bleeding;}
      else return HpCase.Critical;
    }

  public Room getCurrentRoom() {
    return currentRoom;
  }

  public void setCurrentRoom(Room currentRoom) {
    this.currentRoom = currentRoom;
  }

  public void setInventory(ArrayList<Item> inventory) { this.inventory = inventory; }

  public boolean goDirection(Room direction, Player player) {
    if (!(direction == null)) {
      player.setCurrentRoom(direction);
    } else {
      return false;
    }
    return true;
  }

  public boolean takeItem(String itemName) {
    Item itemFound = currentRoom.findRoomItem(itemName);
    if (itemFound != null) {
      currentRoom.getRoomItems().remove(itemFound);
      inventory.add(itemFound);
      return true;
    }
    return false;
  }

  public Item findInventoryItem(String itemName) {
    for (int i = 0; i < getInventory().size(); i++) {
      if (itemName.equalsIgnoreCase(getInventory().get(i).getItemName())) {
        return inventory.get(i);
      }
    }
    return null;
  }

  public boolean dropItem(String itemName) {
    Item itemFound = findInventoryItem(itemName);
    if (itemFound != null) {
      getCurrentRoom().addRoomItem(itemFound);
      getInventory().remove(itemFound);
      return true;
    }
    return false;
  }

  public ArrayList<Item> getInventory() {
    return inventory;
  }

  public boolean openItem(ArrayList<Item> containerLocation, String itemName) {
    Item itemFound = findInventoryItem(itemName);
    if (itemFound == null) {
      containerLocation = getCurrentRoom().getRoomItems();
      itemFound = getCurrentRoom().findRoomItem(itemName);
      if (itemFound != null) {
        Container box = (Container) itemFound;
        for (Item item : box.getContent()) {
          inventory.add(item);
          box.getContent().remove(item);
        }
//      Item removed = findInventoryItem(itemName);
      if (box.isEnvelope()) { inventory.remove(box); }
        return true;
      }
    }
    return false;
  }

  public void eatFood(ArrayList<Item> foodLocation,Food food) {
    int foodEffect = food.eatFood(foodLocation,food);
    health += foodEffect;
    if (health < 30) {
      health = 30;
    }
  }

  public EquipCase equipWeapon(String itemName){
    Item itemFound = findInventoryItem(itemName);
    if(itemFound instanceof Weapon weapon){
      if(equippedWeapon!=null){
        inventory.add(equippedWeapon);
      }
      equippedWeapon=weapon;
      inventory.remove(itemFound);
      return EquipCase.EQUIPPED;
    }
    if(itemFound==null){
      return EquipCase.NOTFOUND;
    }
    return EquipCase.NOTEQUIPPED;
  }

  public AttackCase attackAttempt(){
    if(equippedWeapon!=null) {
      if (equippedWeapon.ammoLeft() == 0) {
        return AttackCase.NoAmmo;
      }
      if (currentRoom.getRoomEnemies().size() != 0) {
        return AttackCase.EnemyPresent;
      }
      equippedWeapon.attack();
      return equippedWeapon.weaponEffect();
    }
    return AttackCase.Empty;
  }

  public CombatResult combat(CombatOption attackType){
    if(evadeFlag && attackType== CombatOption.Flee){
      return CombatResult.FleeSucces;
    }
    CombatResult result = combatDecider(attackType);
    switch (result){
      case Succes -> damageEnemy();
      case BrutalSucces -> damageEnemy(3);
      case Loss -> takeDamage();
      case BrutalLoss -> takeDamage(3);
    }
    blockFlag=false;
    evadeFlag=false;
    enemyBlockFlag=false;
    if(result==CombatResult.BlockSucces){
      blockFlag=true;
    }
    else if(result==CombatResult.EvadeSucces){
      evadeFlag=true;
    }
    else if(result==CombatResult.EnemyBlockSucces){
      enemyBlockFlag=true;
    }
    else if(result==CombatResult.FleeSucces){
      fleeFlag=true;
    }
    return result;
  }

  public CombatResult combatDecider(CombatOption attackAction){
  CombatOption enemyAction = currentRoom.getRoomEnemies().get(0).attack(enemyBlockFlag);
    switch (attackAction) {
      case Acute -> {
        switch (enemyAction) {
          case Acute,Counter -> {return CombatResult.Tie;}
          case Cautious -> {return CombatResult.Loss;}
          case Brutal -> {return CombatResult.Succes;}
          case Block -> {return CombatResult.EnemyBlockSucces;}
        }
      }
      case Brutal -> {
        switch (enemyAction) {
          case Acute -> {return CombatResult.Loss;}
          case Brutal,Counter -> {return CombatResult.Tie;}
          case Cautious, Block -> {return CombatResult.BrutalSucces;}
        }
      }
      case Cautious -> {
        switch (enemyAction) {
          case Acute -> {return CombatResult.Succes;}
          case Brutal -> {return CombatResult.BrutalLoss;}
          case Cautious -> {return CombatResult.Tie;}
          case Block -> {return CombatResult.EnemyBlockSucces;}
          case Counter -> {return CombatResult.Loss;}
        }
      }
      case Counter -> {
        switch (enemyAction) {
          case Acute, Brutal,Counter -> {return CombatResult.Tie;}
          case Cautious,Block -> {return CombatResult.Succes;}
        }
      }
      case Block -> {
        switch (enemyAction){
          case Acute,Cautious -> {return CombatResult.BlockSucces;}
          case Brutal -> {return CombatResult.BrutalLoss;}
          case Block -> {return CombatResult.Tie;}
          case Counter -> {return CombatResult.Loss;}
        }
      }
      case Evade -> {
        switch (enemyAction){
          case Acute -> {return CombatResult.Loss;}
          case Cautious,Brutal,Counter -> {return CombatResult.EvadeSucces;}
          case Block -> {return CombatResult.Tie;}
        }
      }
      case Flee -> {
        switch (enemyAction){
          case Acute,Counter -> {return CombatResult.Loss;}
          case Cautious,Brutal -> {return CombatResult.FleeSucces;}
          case Block -> {return CombatResult.Tie;}}
      }
    }
    return null;
  }

  public void damageEnemy(){
    currentRoom.getRoomEnemies().get(0).takeDamage(equippedWeapon.attack());
  }

  public void damageEnemy(int brutal){
    currentRoom.getRoomEnemies().get(0).takeDamage(equippedWeapon.attack()+brutal);
  }

  public int getWeaponDamage(){
    return equippedWeapon.getWeaponDMG();
  }

  public void takeDamage(){
    health-=currentRoom.getRoomEnemies().get(0).enemyAttack();
  }

  public void takeDamage(int brutal){
    health-=brutal + currentRoom.getRoomEnemies().get(0).enemyAttack();
  }

  public void fallDamage(int damageRecived) { health -= damageRecived; }

  public int getHealth() {
    return health;
  }

  public boolean isBlockFlag() {
    return blockFlag;
  }

  public boolean isEvadeFlag() {
    return evadeFlag;
  }

  public boolean isFleeFlag() {
    return fleeFlag;
  }

  public void setFleeFlag(boolean fleeFlag) {
    this.fleeFlag = fleeFlag;
  }

  public Weapon getEquippedWeapon() {
    return equippedWeapon;
  }
}



