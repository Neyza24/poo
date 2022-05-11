package com.company;

import java.util.ArrayList;
import java.util.List;

public class Programa implements Ofertable{
    private String nombre;
    private String descripcion;
    private List<Ofertable> cursos;
    private Double bonoDescuento;

    public Programa(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        cursos = new ArrayList<>();
        this.bonoDescuento = 0.20;
    }

    public void agregarCurso(Ofertable ofertable) {
        cursos.add(ofertable);

    }


    @Override
    public Double informeOferta() {
        Double precioTotalPrograma = 0.0;

        for (Ofertable curso : cursos) {
            precioTotalPrograma += curso.informeOferta();
        }
        precioTotalPrograma -= (precioTotalPrograma*bonoDescuento);
        descripcion = "Nombre programa: " + nombre + "\nPrecio total del programa: " + precioTotalPrograma;
        System.out.println(descripcion);
        return precioTotalPrograma;
    }
}
