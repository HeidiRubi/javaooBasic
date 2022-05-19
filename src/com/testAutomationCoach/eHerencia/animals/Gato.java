package com.testAutomationCoach.eHerencia.animals;

public class Gato extends Felino {
//estamos haciendo override
    public void hacerRuido() {
        System.out.println("Miau");
    }
    public void comer() {
        System.out.println("Como Whiskas y Pajaritos");
        super.comer();
    }

}
