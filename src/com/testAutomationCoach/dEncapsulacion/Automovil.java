package com.testAutomationCoach.dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;

	private double litrosDeGasoline;
	private double revolucionesPorMin;
	private double temperatura;



	
	Automovil() {
		marca = "Ford";
		velocidadActual = 0.0;
		maximaVelocidad = 200.0;
		tipoDeTransmision = "Manual";
		numDePuertas = 2;
		numDeLlantas = 4;
		litrosDeGasoline = 40;
		revolucionesPorMin = 0;
		temperatura = 20;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
		this.litrosDeGasoline = 40;
		this.revolucionesPorMin = 0;
		this.temperatura = 20;
	}
	//comportamiento

	public void encender(){
	Input.print("Girar llave hacia enfrente");
	if(litrosDeGasoline >0){
		this.revolucionesPorMin=800;
		this.litrosDeGasoline -=0.05;
	}else{
		Input.print("Se esta ahogando el carro");
	}

	}

	public void acelerar() {
		Input.print("run run\n");
		this.velocidadActual += 5.0;
		this.litrosDeGasoline -=0.5;

	}
	
	public void frenar() {
		Input.print("Screeeeech!\n");
		this.velocidadActual = 0;
	}
	
	public void retroceder() {
		Input.print("piii piii piii piii\n");
		this.velocidadActual -= -5;
		this.litrosDeGasoline -=0.5;
	}
	
	public double getVelocidad() {
		return velocidadActual;
		
	}
	public void apagar(){
		Input.print("Girar llave hacia atras");
		this.revolucionesPorMin =0;
	}
}
