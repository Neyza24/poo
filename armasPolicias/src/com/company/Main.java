package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------Datos policia-----------------------------");
        Policia martinez = new Policia("Juan", "Martinez", 2123);
        System.out.println("Nombre:"+ martinez.getNombre() + "\nApellido:" + martinez.getApellido() + "\nLegajo:" + martinez.getLegajo());

        System.out.println("------------------Arma corta-----------------------------");
        ArmaCorta armaNueva = new ArmaCorta(martinez, 10, 210.5, "Nose", 2, "NUEVA");
        System.out.println(armaNueva.esAutomatica());

        ArmaLarga arma1 = new ArmaLarga(martinez, 6, 200.2, "Rooler", 3, "EN USO", true, "Nose", 3);
        ArmaLarga arma2 = new ArmaLarga(martinez, 6, 200.2, "Rooler", 3, "EN USO", true, "Nose", 2);
        System.out.println(arma1.compareTo(arma2));
        System.out.println("-----------------¿Esta en condiciones de uso?------------------------------");
        System.out.println(arma1.estaEnCondicionDeUso());



    }

}
