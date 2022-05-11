package com.company;

public class Cuenta implements Comparable<Cuenta>{
    private Integer numeroDeCuenta;
    private Double saldo;

    public Cuenta(Integer numeroDeCuenta, Double saldo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }


    @Override
    public int compareTo(Cuenta cuenta) {
        if(this.numeroDeCuenta > cuenta.numeroDeCuenta) {
            return 1;
        }
        if(this.numeroDeCuenta < cuenta.numeroDeCuenta) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "numeroDeCuenta: " + numeroDeCuenta + ", saldo: " + saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }
}
