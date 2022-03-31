package com.company;

import java.util.Random;

public class Enemy {
  private int health;
  private String name;
  private Weapon equippedWeapon;    //Only melee weapons for enemies.
  private boolean talisman = false;
  private CombatOption EnemyAction;

  public Enemy(int health, String name, Weapon equippedWeapon){
    this.health=health;
    this.name=name;
    this.equippedWeapon=equippedWeapon;
  }

  public CombatOption attack(boolean enemyBlockFlag){
    Random random = new Random();
    int number;
    if(!talisman){
      number = (random.nextInt(12)+1);}
    else{
      number =(random.nextInt(15)+1);}
    switch (number){
      case 1,2,3 ->{ EnemyAction = CombatOption.Acute;}
      case 4,5,6,7,8 ->{ EnemyAction = CombatOption.Brutal;}
      case 9,10,11,12->{ EnemyAction = CombatOption.Cautious;}
      case 13,14,15 ->{
        if(enemyBlockFlag){EnemyAction = CombatOption.Counter;}
        else{
        EnemyAction =  CombatOption.Block;}}
    }
    return EnemyAction;
  }

  public void takeDamage(int damage){
    health-=damage;
  }
  public void takeDamage(int damage,int Brutal){
    if(!(damage==0))
    health-=Brutal + damage;
  }

  public boolean enemyDeath(Room currentRoom){
    if (health<1){
      currentRoom.addRoomItem(equippedWeapon);
      currentRoom.getRoomEnemies().remove(0);
      return true;
    }
    return false;
  }

  public int enemyAttack(){
    return equippedWeapon.attack();
  }

  public CombatOption getEnemyAction() {
    return EnemyAction;
  }

  public int getHealth() {
    return health;
  }

 /* public boolean isStatus() {
    return status;
  }*/

  public String getName() {
    return name;
  }
}
