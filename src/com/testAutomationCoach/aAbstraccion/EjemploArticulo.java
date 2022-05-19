package com.testAutomationCoach.aAbstraccion;

public class EjemploArticulo {
    public static void main(String[] args) {
        Articulo laptop = new Articulo();
        laptop.name = "laptop lenovo";
        Articulo camaPerro = new Articulo();
        Articulo audifonos = new Articulo();
        CarritoDeCompras carro = new CarritoDeCompras();

        //mi ejemplo
//        Articulo osito = new Articulo();
//        osito.name = "oso de peluche azul";
//        osito.precio = 510;
//        osito.descripcion = "Osito de felpa, suave y con ropita para vestirlo, mide: 40 cm";
//        osito.estrella = 4.2;
//        osito.procedencia = "China";

//        osito.buscar();
//        osito.verPais();
//        osito.leerDescripcion();
//        osito.comprar();
//        osito.esperarLlegada();
//        osito.calificarProducto();

//        libs.Input.print("Nombre: "+osito.name +"\n");
//        libs.Input.print("Pais: "+osito.procedencia+"\n");
//        libs.Input.print("Precio: "+osito.precio+"\n");
//        libs.Input.print("Dscripcion: "+osito.descripcion+"\n");
//        System.out.println("Esperando... ya llego' :)");
//        libs.Input.print("Calificacion: "+osito.estrella+"\n");
        carro.agregarArticulo(laptop);
        carro.agregarArticulo(camaPerro);
        carro.agregarArticulo(audifonos);

        carro.muestraArticulo(0);
    }
}
