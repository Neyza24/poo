package com.company;

public abstract class PizzaComprable {
    private String nombre;
    private String descripcion;

    public PizzaComprable(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }



}
