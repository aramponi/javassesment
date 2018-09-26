package com.infine.kata;

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
    if (this.weapon.type == "knife") {
      return "Perform knife attack";
    } else {
      if (this.weapon.type == "revolver") {
        return "Perform revolver attack";
      } else {
        if (this.weapon.type == "Plasma Gun") {
          return "Perform plasma gun attack";
        }
      }
    }
    return "Unknown Action";
  }
}