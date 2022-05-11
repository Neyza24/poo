package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada implements Comprable{
    private String nombre;
    private String descripcion;
    private List<Comprable> pizzas;

    public Combinada(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        pizzas = new ArrayList<>();
    }

    public void agregarPizza (Comprable comprable) {
        pizzas.add(comprable);
    }

    @Override
    public Double informarPrecio() {
        Double precioCombinada = 0.0;

        for (Comprable pizza : pizzas) {
            precioCombinada += pizza.informarPrecio();
        }
        return precioCombinada/pizzas.size();
    }

    public String descripcionProducto() {
        descripcion = "Pizza: " + nombre + " ,tiene un precio de " + informarPrecio() + " pesos";
        return descripcion;
    }

    public void mostrarDetalle() {
        System.out.println(descripcionProducto() + " contiene las siguientes pizzas: ");
        for (Comprable pizza : pizzas) {
            System.out.println(((Pizza)pizza).descripcionProducto());
        }
    }


}
