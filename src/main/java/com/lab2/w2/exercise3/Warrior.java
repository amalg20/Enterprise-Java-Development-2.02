package com.lab2.w2.exercise3;

public class Warrior extends Player{
    private int force;

    public Warrior(int health, int strength, int lives, int force) {
        super(health, strength, lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public Elf convertToElf() {
        return new Elf(super.getHealth(), super.getStrength(), super.getLives(), this.getForce());
    }
}
