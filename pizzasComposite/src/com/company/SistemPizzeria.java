package com.company;

import java.util.ArrayList;
import java.util.List;

public class SistemPizzeria {
    private List<Comprable> pizzas;

    public SistemPizzeria() {
        pizzas = new ArrayList<>();
    }

    public void agregarPizzas(Comprable comprable) {
        pizzas.add(comprable);
    }

    public Double calcularPrecioProductos() {
        Double precioTotal = 0.0;

        for (Comprable pizza : pizzas) {
            precioTotal += pizza.informarPrecio();
        }
        return precioTotal;
    }


}
