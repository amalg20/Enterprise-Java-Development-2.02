package com.lab2.w2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//class PlayerTest extends Player {
//
//    public PlayerTest(int health, int strength, int lives) {
//        super(health, strength, lives);
//    }

class PlayerTest {


    @Test
    void decrementLive() {
            VideGames player = new VideGames(100, 10, 3);
            player.decrementLive();
            assertEquals(2, player.getLives());
            assertEquals(100, player.getHealth());
        }

    @Test
    void attack() {
            VideGames player1 = new VideGames(100, 10, 3);
            VideGames player2 = new VideGames(100, 10, 3);
            player1.attack(player2);
            assertEquals(90, player2.getHealth());
        }


    @Test
    void checkHealth() {
        VideGames player = new VideGames(100, 10, 3);
        assertEquals(100, player.getHealth());
        player.setHealth(50);
        assertEquals(50, player.getHealth());
    }
}