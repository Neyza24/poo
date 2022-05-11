package com.company;

public class Test {
    public static void main(String[] args) {

        Pizzeria dominos = new Pizzeria();
        PizzaComprableFactory fabrica = PizzaComprableFactory.getInstance();

        dominos.agregarProducto(fabrica.generarProducto("MUZZARELLA"));
        dominos.agregarProducto(fabrica.generarProducto("ESPECIAL"));
        dominos.agregarProducto(fabrica.generarProducto("ANANA"));
        dominos.agregarProducto(fabrica.generarProducto("COMBINADA"));
        dominos.mostrarDetalleProducto();

    }
}
