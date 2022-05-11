package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<PizzaComprable> productos;

    public Pizzeria() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(PizzaComprable pizzaComprable) {
        productos.add(pizzaComprable);
    }

    public void mostrarDetalleProducto() {
        for (PizzaComprable producto : productos) {
            System.out.println(producto);
        }
    }
}
