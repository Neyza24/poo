package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------Datos del persona-------------------------");
        Persona persona1 = new Persona("Francois", "Gamadiel", "2323D", 24);
        System.out.println("Nombre: " + persona1.getNombre() + "\nApellido: " + persona1.getApellido() + "\nDNI: " + persona1.getDni() + "\nEdad: " + persona1.getEdad() );

        System.out.println("---------------------TituloTerciario-------------------------");
        TitutloTerciario titutloTerciario1 = new TitutloTerciario(persona1, 5, "22-02-2008", "05-12-2014", "SI", "SI", "NACIONAL");
        TitutloTerciario titutloTerciario2 = new TitutloTerciario(persona1, 5, "22-02-2006", "05-12-2012", "NO", "SI", "PROVINCIAL");

        System.out.println(titutloTerciario1.esValidoANivelNacional()); //True
        System.out.println(titutloTerciario2.esValidoANivelNacional()); //False

        System.out.println(titutloTerciario1.sePuedeEjercer());//true
        System.out.println(titutloTerciario2.sePuedeEjercer()); //False

        System.out.println("---------------------TituloLicenciatura-------------------------");
        TituloLicenciatura tituloLicenciatura1 = new TituloLicenciatura(persona1, 10,"22-02-2009", "22-12-2015", "SI", "SI", "Globalización", "23-06-2015", 5);
        TituloLicenciatura tituloLicenciatura2 = new TituloLicenciatura(persona1, 10,"22-02-2009", "22-12-2015", "NO", "SI", "Globalización", "23-06-2015", 3);

        System.out.println(tituloLicenciatura1.compareTo(tituloLicenciatura2)); //1

        System.out.println(tituloLicenciatura1.sePuedeEjercer());
        System.out.println(tituloLicenciatura2.sePuedeEjercer());

    }
}
