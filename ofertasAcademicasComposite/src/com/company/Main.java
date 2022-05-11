package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso frontend = new Curso("Frontend", 16.0, 2.0, 1000.0);
        Curso backend = new Curso("Backend", 20.0, 2.0, 900.0);

        Programa fullStack = new Programa("Fullstack");
        fullStack.agregarCurso(frontend);
        fullStack.agregarCurso(backend);

        Taller taller1 = new Taller("Taller1", 2, 20.0);

        Carrera carrera1 = new Carrera("Programación", 200.0);
        carrera1.agregarCurso(frontend);
        carrera1.agregarCurso(backend);
        carrera1.agregarTaller(taller1);

        List<Ofertable> productos = Arrays.asList(frontend, backend, taller1, fullStack, carrera1);
        Sistema sistema1 = new Sistema(productos);
        System.out.println(sistema1.calcularPrecioOferta());
    }
}
