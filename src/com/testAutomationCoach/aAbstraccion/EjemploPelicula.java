package com.testAutomationCoach.aAbstraccion;

public class EjemploPelicula {


    public static void main(String[] args) {
        Pelicula godFather = new Pelicula();
        godFather.actores = new String [3];
        godFather.nombre = "The Godfather";
        godFather.duracionSegundos = 139;
        godFather.fecha  ="04/10/1972";
        godFather.actores[0] = "Marlon Brando";
        godFather.actores[1] = "Al Pacino";
        godFather.actores[2] = "James Caan";
        godFather.director = "Francis Ford Coppola";
        godFather.version = "Subtitulada";

        godFather.buscarPeliculaVer();
        godFather.elegirVersion();
        godFather.comprarPelicula();
        godFather.verPelicula();


        libs.Input.print("Nombre: " + godFather.nombre + "\n");
        libs.Input.print("Duracion: " + godFather.duracionSegundos + " segundos" +"\n");
        libs.Input.print("fecha: " + godFather.fecha + "\n");
        libs.Input.print("Actor: " + godFather.actores[0] + "\n");
        libs.Input.print("Actor: " + godFather.actores[1] + "\n");
        //libs.Input.print("Actor: " + godFather.actores[2] + "\n");
        libs.Input.print("Director: " + godFather.director + "\n");
        libs.Input.print("Version: " + godFather.version + "\n");
    }
}
