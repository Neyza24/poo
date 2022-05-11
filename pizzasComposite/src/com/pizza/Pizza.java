package com.pizza;

import com.company.Comprable;

public class Pizza extends ProductoComprable {
    private Double precioBase;
    private String tamanio;

    public Pizza(String nombre, String descripcion, Double precioBase, String tamanio) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.tamanio = tamanio;
    }

    @Override
    public Double calcularPrecio() {
        Double precioTotal = precioBase;

        if(tamanio.equals("Grande")) {
            precioTotal = precioBase*2;
        }
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Pizza " + this.getNombre() + ", " + tamanio + " que tiene un precio base de " + precioBase + " pesos";
    }
}
