package com.lab2.w2.exercise3;

import java.util.Objects;

public class Elf extends Player{

    private int speed;

    public Elf(int health, int strength, int lives, int speed) {
        super(health, strength, lives);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Elf elf = (Elf) o;
        return speed == elf.speed ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
