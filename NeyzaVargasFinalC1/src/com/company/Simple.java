package com.company;

public class Simple extends PizzaComprable {
    private Double precioBase;
    private String tamanio;

    public Simple(String nombre, String descripcion, Double precioBase, String tamanio) {
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
        return "Pizza " + getNombre() + ", " + tamanio + " que tiene un precio base de " + calcularPrecio() + " pesos";
    }

}
