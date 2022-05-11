package com.company;

public class Curso implements Ofertable{
    private String nombre;
    private String descripcion;
    private Double cargaHorariaMensual;
    private Double cantidadMeses;
    private Double precioHora;


    public Curso(String nombre, Double cargaHorariaMensual,Double cantidadMeses, Double precioHora ) {
        this.nombre = nombre;
        this.descripcion = "";
        this.cargaHorariaMensual = cargaHorariaMensual;
        this.cantidadMeses = cantidadMeses;
        this.precioHora = precioHora;
    }


    @Override
    public Double informeOferta() {
        Double cargaHorariaTotal = cargaHorariaMensual*cantidadMeses;
        Double precioTotalCurso = cargaHorariaTotal*precioHora;
        descripcion = "Tiene una carga horaria de: " + cargaHorariaTotal + " hs mensuales, con un precio de: " + precioHora + " pesos la hora, es decir que tiene un precio de: " + precioTotalCurso + " pesos.";
        System.out.println("Curso: " + nombre + "\nDescripción: " + descripcion);
        return precioTotalCurso;
    }

}
