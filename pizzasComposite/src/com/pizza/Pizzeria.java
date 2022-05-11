package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {
    private List<ProductoComprable> productosComprables;

    public Pizzeria() {
        productosComprables = new ArrayList<>();
    }

    public void agregarProducto(ProductoComprable productoComprable) {
        productosComprables.add(productoComprable);
    }

    public void generarRecibo() {
        for (ProductoComprable productosComprable : productosComprables) {
            System.out.println(productosComprable);
        }
    }
}
