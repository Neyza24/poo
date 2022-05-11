package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------Datos alumno/a----------------------------- ");
        Alumno Luca = new Alumno("Luca", "Valencia", 2345);
        System.out.println("Nombre:" + Luca.getNombre() + "\nApellido:" + Luca.getApellido() + "\nLegajo:" + Luca.getLegajo());

        System.out.println("---------------------Datos sobre examen parcial--------------------------");

        Parcial infraestructura = new Parcial(Luca, "Examen POO", "Realizar la...", 3.2, 2);
        Parcial frontend = new Parcial(Luca, "parcial 1", "Relizar la...", 4.5, 3);
        System.out.println(infraestructura.estaAprobado());
        System.out.println(frontend.estaAprobado());
        System.out.println("La nota de su parcial fue: " + infraestructura.getNota());
        infraestructura.esPosibleRecuperar();
        System.out.println("La nota de su parcial fue: " + frontend.getNota());
        frontend.esPosibleRecuperar();


        System.out.println("------------------------------Datos examen final----------------------------");
        Final infra1 = new Final(Luca, "Examen de POO", "Se debe generar un UML para la siguiente consigna", 4.5, 4.3,"Tenemos una clase padre Examen y una clase hija final");
        Final front2 = new Final(Luca, "Examen de POO", "Se debe generar un UML para la siguiente consigna", 4.5, 2.3,"Tenemos una clase padre Examen y una clase hija final");
        System.out.println(infra1.estaAprobado());
        System.out.println(front2.estaAprobado());
        System.out.println(infra1.compareTo(front2));
        System.out.println(front2.compareTo(infra1));


    }
}
