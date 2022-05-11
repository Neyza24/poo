package com.company;

public class Pizza implements Comprable{
    private String nombre;
    private String descripcion;
    private Double precioBase;
    private String tamanio;

    public Pizza(String nombre, String tamanio, Double precioBase) {
        this.nombre = nombre;
        this.descripcion = "";
        this.precioBase = precioBase;
        this.tamanio = tamanio;
    }


    @Override
    public Double informarPrecio() {
        Double precioPizza = this.precioBase;

        if(this.tamanio.equals("Grande")) {
            precioPizza *= 2;
        }
        return precioPizza;
    }

    @Override
    public String descripcionProducto() {
        descripcion = "Pizza: " + nombre + " ," + tamanio + " tiene un precio base de " + informarPrecio() + " pesos";
        return descripcion;

    }


}
