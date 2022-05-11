package com.pizza;

import com.company.Comprable;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends ProductoComprable{
    private List<ProductoComprable> productosComprables;

    public Combinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        productosComprables = new ArrayList<>();
    }

    public void agregarProducto(ProductoComprable productoComprable) {
        productosComprables.add(productoComprable);
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;

        for (ProductoComprable productosComprable : productosComprables) {
            precioTotal += productosComprable.calcularPrecio();
        }
        return precioTotal/productosComprables.size();
    }

    @Override
    public String toString() {
        String pizzas = "es la combinación de ";
        for (ProductoComprable pizza : productosComprables) {
            pizzas += ((Pizza)pizza).getNombre() + " y ";
        }
        return "Pizza: " + getNombre() + ", " + pizzas + " tiene un precio de " + calcularPrecio() + " pesos";
    }

}
