package com.testAutomationCoach.aAbstraccion;

public class CarritoDeCompras {
    Articulo[] carro;
    int numArticulos;
    String name;
    public CarritoDeCompras(){
        carro = new Articulo[100];
        numArticulos = 0;
    }
    public void agregarArticulo(Articulo a) {
        carro[numArticulos] = a;
        numArticulos++;
    }

    public void muestraArticulo(int i) {
        System.out.println(carro[i].name);
    }
}