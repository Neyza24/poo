package com.pizza;

public abstract class ProductoComprable {
    private String nombre;
    private String descripcion;

    public ProductoComprable(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract Double calcularPrecio();

    public String getNombre() {
        return nombre;
    }
}
