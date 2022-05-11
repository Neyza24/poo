package com.company;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        puerto.addContenedor(new Contenedor(1, "CHINA", false));
        puerto.addContenedor(new Contenedor(9, "EE.UU.", false));
        puerto.addContenedor(new Contenedor(6, "DESCONOCIDO", true));
        puerto.addContenedor(new Contenedor(3, "BRASIL", false));
        puerto.addContenedor(new Contenedor(7, "RUSIA", false));
        puerto.addContenedor(new Contenedor(5, "CANADA", false));
        puerto.addContenedor(new Contenedor(4, "DESCONOCIDO", false));

        System.out.println("-------------------Listando todos los contenedores-------------------------------" + "\n");
        puerto.mostrarContenedores();

        System.out.println("-------------------Cantidad de contenedores con procedencia desconocida-------------------------------" + "\n");
        System.out.println("La cantidad de contenedores con procedencia desconocida es: " + puerto.cantidadContendoresDesconocidos());
    }
}
