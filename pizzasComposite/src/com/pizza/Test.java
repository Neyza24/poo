package com.pizza;

import com.company.Combinada;
import com.company.Pizza;
import com.company.SistemPizzeria;

public class Test {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria();
        ProductoComprableFactory factory = ProductoComprableFactory.getInstance();
        pizzeria.agregarProducto(factory.generarProducto("MUZZARELLA"));
        pizzeria.agregarProducto(factory.generarProducto("ESPECIAL"));
        pizzeria.agregarProducto(factory.generarProducto("LOCA"));

        pizzeria.generarRecibo();
    }
}
