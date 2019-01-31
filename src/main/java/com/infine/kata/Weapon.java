package com.infine.kata;

public class Weapon {

    public String type;
    String attack;

    public Weapon(String type) {
        this.type = type;
    }

    public String getAttack() {
        return "Unknown Action";
    }
   
}
