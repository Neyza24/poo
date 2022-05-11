package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends PizzaComprable {

    private List<PizzaComprable> productos;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        productos = new ArrayList<>();
    }

    public void agregarProducto(PizzaComprable pizzaComprable) {
        productos.add(pizzaComprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (PizzaComprable producto : productos) {
            precioTotal += producto.calcularPrecio();
        }
        return precioTotal/ productos.size();
    }

    @Override
    public String toString() {
        String pizzas = "es la combinación de ";
        for (PizzaComprable producto : productos) {
            pizzas += ((Simple)producto).getNombre() + " y ";
        }
        return "Pizza: " + getNombre() + ", " + pizzas + " tiene un precio de " + calcularPrecio() + " pesos";
    }
}
