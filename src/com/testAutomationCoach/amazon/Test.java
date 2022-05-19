package com.testAutomationCoach.amazon;

public class Test {
    public static void main(String[] args) {

        HomePage home = new HomePage();
        home.buscarProducto("Laptop");
        ResultsPage results = new ResultsPage();
        //results.agregarCarrito();
    }
}
