package com.company;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("Fred", "Annen", 25);

        persona.agregarCuenta(new Cuenta(1001, 2500.0));
        persona.agregarCuenta(new Cuenta(1008, 0.0));
        persona.agregarCuenta(new Cuenta(1005, 3500.0));
        persona.agregarCuenta(new Cuenta(1003, 8500.0));

        persona.mostrarCuentas();
        System.out.println(persona.getSaldoTotal());

        System.out.println(persona.esMayorEdad());

    }
}
