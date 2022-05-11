package com.company;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Ofertable> productos;

    public Sistema(List<Ofertable> productos) {
        this.productos = productos;
    }

    public void agregarProducto (Ofertable ofertable) {
        productos.add(ofertable);
    }

    public Double calcularPrecioOferta() {
        Double precioTotal = 0.0;

        for (Ofertable producto : productos) {
            precioTotal += producto.informeOferta();

        }
        return precioTotal;
    }


}
