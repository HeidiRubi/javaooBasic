package com.testAutomationCoach.aAbstraccion;

public class EjemploCancion {
    public static void main(String[] args) {
        Cancion likeYouDo = new Cancion();
        likeYouDo.artista = "Joji";
        likeYouDo.anioLanzamiento = 2020;
        likeYouDo.duracionSegundos = 240;
        likeYouDo.letra = "no one loves me like you do";

        likeYouDo.grabar();
        likeYouDo.editar();
        likeYouDo.reproducir();
    }
}
