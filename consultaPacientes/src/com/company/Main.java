package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------Datos consulta----------------------------------------");
        Consulta consulta1 = new Consulta("20-03-2022", "Oftalmología", 14, 30);
        Consulta consulta2 = new Consulta("20-04-2022", "Oftalmología", 14, 30);
        System.out.println("---------------------------------Datos del paciente de obra social1------------------------");
        ObraSocial pacienteObraSocial1 = new ObraSocial(consulta1, "21-12-1991", "Manuel", "Lenois", "NO", "Caritas", 4);
        System.out.println("Fecha de nacimiento: " + pacienteObraSocial1.getFechaNacimiento() +
                            "\nNombre: " + pacienteObraSocial1.getNombre() +
                            "\nApellido: " + pacienteObraSocial1.getApellido() +
                            "\nPrimeraConsulta: " + pacienteObraSocial1.getPrimeraConsulta());
        System.out.println("-------------------¿Es admitible para una consulta de evaluación inicial?----------------------------------------");
        System.out.println(pacienteObraSocial1.permitirEvaluacionInicial());


        ObraSocial pacienteObraSocial2 = new ObraSocial(consulta1, "21-12-1989", "José", "Lenois", "NO", "Caritas", 2);
        System.out.println(pacienteObraSocial1.compareTo(pacienteObraSocial2));
    }
}
