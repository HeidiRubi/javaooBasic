package com.testAutomationCoach.amazon;

public class HomePage {
    Imagen logoAmazon;
    TextField campoBusqueda;
    Button lupaBusqueda;
    Link devolucionesPedido;
    Imagen[] articuloSugerido;


    public void buscarProducto(String nombreProducto){
        campoBusqueda.ingresarTexto(nombreProducto);
        lupaBusqueda.click();
    }
    public void clickDevoluciones(){
        devolucionesPedido.click();
    }

    public void seleccionarArticulo(String nombreArticulo){
        //buscar todas las imagenes
    }
}
