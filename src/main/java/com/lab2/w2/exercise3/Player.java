package com.lab2.w2.exercise3;

abstract class Player {
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }

    public int getStrength() {

        return strength;
    }

    public void setStrength(int strength) {

        this.strength = strength;
    }

    public int getLives() {

        return lives;
    }

    public void setLives(int lives) {

        this.lives = lives;
    }

    public void decrementLive() {

        lives--;
        health = 100;
        if (lives <= 0) {
            System.out.println("This player is dead");
        }
    }

    public void attack(Player playerToAttack) {

        playerToAttack.setHealth(playerToAttack.getHealth() - this.strength);
    }

    public void checkHealth() {
        if (health <= 0) {
            decrementLive();
        }
    }
}
