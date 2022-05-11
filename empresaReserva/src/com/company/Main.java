package com.company;

public class Main {
    public static void main(String[] args) throws EmpresaException {

        Empresa empresa = new Empresa();

        empresa.agregarReservas(new Reserva("1001", 2, "Buenos Aires", "Bagrado"));
        empresa.agregarReservas(new Reserva("1002", 1, "Bagrado", "Buenos Aires"));
        empresa.agregarReservas(new Reserva("1003", 4, "Luján", "Bagrado"));
        empresa.agregarReservas(new Reserva("1004", 1, "Mercedes", "Luján"));
        empresa.agregarReservas(new Reserva("1005", 3, "China", "Bagrado"));

        System.out.println("La recaudación total es de: $" + empresa.recaudacionTotal());


        try {
            System.out.println("Total de personas que pasarán por esta estacion: " + empresa.cantVecesRecorridas("Luján"));
        } catch (EmpresaException e) {
            e.printStackTrace();
        }

    }
}
