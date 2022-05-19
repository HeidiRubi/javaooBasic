package com.testAutomationCoach.eHerencia.animals;

public class Felino extends Animal {

    public void recorrerTerreno() {
        System.out.println("Soy un animal solitario");
    }

    @Override
    public void comer() {
        super.comer();
        System.out.println("como carnita");
    }
}

