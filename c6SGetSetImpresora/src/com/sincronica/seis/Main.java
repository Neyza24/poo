package com.sincronica.seis;

public class Main {
    public static void main(String[] args) {
        Impresora impresora = new Impresora("HP", "USB","21-Enero-1991");
        impresora.setHojasDisponibles(6);
        impresora.imprimir("Hola");
        impresora.imprimir("Mundo");
        impresora.imprimir("estamos");
        impresora.imprimir("Holas");
        impresora.imprimir("Mundos");
        impresora.imprimir("estamoss");
        impresora.imprimir("Holadd");
        System.out.println("La impresora tiene las siguientes caracteristicas: " + impresora.getModelo() + " " + impresora.getFechaDeFabricacion() + " " +impresora.getTipoConexion());
    }
}
