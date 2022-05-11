package com.company;

public class Taller implements Ofertable{
    private String nombre;
    private String descripcion;
    private Integer cantidadTrabajosPracticos;
    private Double precioTrabajoPractico;


    public Taller(String nombre, Integer cantidadTrabajosPracticos, Double precioTrabajoPractico) {
        this.nombre = nombre;
        this.descripcion = "";
        this.cantidadTrabajosPracticos = cantidadTrabajosPracticos;
        this.precioTrabajoPractico = precioTrabajoPractico;
    }


    @Override
    public Double informeOferta() {
        Double precioTaller = cantidadTrabajosPracticos*precioTrabajoPractico;
        descripcion = "Nombre taller: " + nombre + "\nPrecio del taller es: " + precioTaller;
        System.out.println(descripcion);
        return precioTaller;
    }
}
