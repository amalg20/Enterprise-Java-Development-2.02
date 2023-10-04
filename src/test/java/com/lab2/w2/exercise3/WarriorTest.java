package com.lab2.w2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {

    @Test
    void convertToElf() {
        Warrior warrior = new Warrior( 100, 20, 3, 10);
        Elf elf = new Elf(80, 15, 2, 10);


        Elf convertElf = warrior.convertToElf();
        assertEquals(elf.toString(), convertElf.toString() );


    }

    @Test
    void isSameClass(){

        Warrior warrior = new Warrior( 100, 20, 3, 10);
        Elf elf = new Elf(80, 15, 2, 20);

        Elf convertElf = warrior.convertToElf();
        assertEquals(elf.getClass(), convertElf.getClass());

    }
}