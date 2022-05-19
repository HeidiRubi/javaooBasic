package com.testAutomationCoach.eHerencia.animals;

public class Perro extends Canino {
//overrride animal es una clase generica porque un perro y gato ya es una clase mas concreta
	public void hacerRuido() {
		System.out.println("Guau guau!");
	}
	public void comer() {
		System.out.println("Como Dowchow y carne de pollo");
	}
}
