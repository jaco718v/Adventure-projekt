package com.company;



public class AdventureEngine {
  MapCreator map = new MapCreator();
  Player player = new Player(map.room1);

  public void setRoomConnections(){
    map.setRoomConnections();
  }

  //public String getBeskrivelse()
  // { return (player.getCurrentRoom()).getBeskrivelse(); }

  public String getNarrative() {
      if (player.getCurrentRoom().isExplored()) {
        return (player.getCurrentRoom()).getRecap();
      } else {
          (player.getCurrentRoom()).setExplored(true);
          return (player.getCurrentRoom()).getBeskrivelse();
      }
  }

  public boolean goNorth(){
    return player.goDirection((player.getCurrentRoom()).getNorth(),player);
  }

  public boolean goEast(){
    return player.goDirection((player.getCurrentRoom()).getEast(),player);
  }

  public boolean goSouth(){
    return player.goDirection((player.getCurrentRoom()).getSouth(),player);
  }

  public boolean goWest(){
    return player.goDirection((player.getCurrentRoom()).getWest(),player);
  }
}





