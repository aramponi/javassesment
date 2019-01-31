package com.infine.kata;

import java.util.ArrayList;
import java.util.List;

public class Player {
  private Weapon weapon;
  private String name;

  public Player(String name, Weapon weapon) {
    this.name = name;
    this.weapon = weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public String action() {
      return weapon.getAttack();
    
  }
  
}