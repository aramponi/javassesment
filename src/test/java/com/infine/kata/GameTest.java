package com.infine.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void check_all_configuration() {
        Player player = new Player("john", new Weapon("knife"));
        assertEquals("Perform knife attack", player.action());

        player = new Player("john", new Weapon("revolver"));
        assertEquals("Perform revolver attack", player.action());

        player = new Player("john", new Weapon("Plasma Gun"));
        assertEquals("Perform plasma gun attack", player.action());

        player = new Player("john", new Weapon("Flame Thrower"));
        assertEquals("Unknown Action", player.action());

    }
}
