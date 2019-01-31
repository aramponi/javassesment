package com.infine.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void check_all_configuration() {
        Player player = new Player("john", new Knife("knife"));
        assertEquals("Perform knife attack", player.action());

        player = new Player("john", new Revolver("revolver"));
        assertEquals("Perform revolver attack", player.action());

        player = new Player("john", new PlasmaGun("Plasma Gun"));
        assertEquals("Perform plasma gun attack", player.action());

        player = new Player("john", new Weapon("Flame Thrower"));
        assertEquals("Unknown Action", player.action());

    }
}
