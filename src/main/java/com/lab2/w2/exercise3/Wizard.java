package com.lab2.w2.exercise3;

public class Wizard extends Player {

    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        this.spell = spell;
    }

    public int getSpell() {

        return spell;
    }

    public void setSpell(int spell) {

        this.spell = spell;
    }

    public Elf convertToElf() {
        return new Elf(super.getHealth(), super.getStrength(), super.getLives(), this.spell);
    }
}

