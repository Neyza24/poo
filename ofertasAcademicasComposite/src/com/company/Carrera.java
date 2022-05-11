package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrera implements Ofertable {
    private String nombre;
    private String descripcion;
    private List<Ofertable> cursos;
    private List<Ofertable> talleres;
    private Double precioBasico;

    public Carrera(String nombre, Double precioBasico) {
        this.nombre = nombre;
        this.descripcion = "";
        cursos = new ArrayList<>();
        talleres = new ArrayList<>();
        this.precioBasico = precioBasico;
    }

    public void agregarCurso(Ofertable ofertable) {
        cursos.add(ofertable);
    }

    public void agregarTaller(Ofertable ofertable) {
        talleres.add(ofertable);
    }


    @Override
    public Double informeOferta() {
        Double precioTotalCarrera = 0.0;
        Double precioTotalTaller = 0.0;
        Double precioTotalCurso = 0.0;

        for (Ofertable curso : cursos) {
            precioTotalCurso += curso.informeOferta();
        }

        for (Ofertable taller : talleres) {
            precioTotalTaller += taller.informeOferta();
        }

        precioTotalCarrera = precioBasico + precioTotalTaller + precioTotalCurso;
        return precioTotalCarrera;

    }
}
