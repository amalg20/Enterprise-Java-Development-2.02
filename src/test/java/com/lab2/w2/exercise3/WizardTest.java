package com.lab2.w2.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void convertToElf() {
        Wizard wizard = new Wizard( 100, 20, 3, 10);
        Elf elf = new Elf(80, 15, 2, 10);

        Elf convertElf = wizard.convertToElf();
        assertEquals(elf, convertElf);
    }

    @Test
    void isSameClass(){

        Wizard wizard = new Wizard( 100, 20, 3, 10);
        Elf elf = new Elf(80, 15, 2, 20);

        Elf convertElf = wizard.convertToElf();
        assertEquals(elf.getClass(), convertElf.getClass());

    }
}