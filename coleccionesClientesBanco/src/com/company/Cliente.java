package com.company;

public class Cliente {
    private String nombre;
    private String numeroCuenta;
    private Double saldo;

    public Cliente(String nombre, String numeroCuenta, Double saldo) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
