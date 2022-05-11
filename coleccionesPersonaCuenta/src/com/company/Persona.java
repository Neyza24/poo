package com.company;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private List<Cuenta> cuentas;

    public Persona(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        cuentas = new ArrayList<>();
    }

    public void  agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public Integer getCantidadCuentas() {
        Integer contadorCuentas = 0;

        for (Cuenta cuenta : cuentas) {
            contadorCuentas++;
        }
        return contadorCuentas;
    }


    public String getNombreCompleto() {
        return nombre + apellido;
    }

    public Boolean esMayorEdad() {
        return edad > 60;
    }




    public Double getSaldoTotal() {
        Double saldoTotalCuentas = 0.0;
        for (Cuenta cuenta : cuentas) {
            if(cuenta.getSaldo() > 0) {
                saldoTotalCuentas+= cuenta.getSaldo();
            }
        }
        return saldoTotalCuentas;
    }

    public void mostrarCuentas() {
        cuentas.sort(null);
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }

    public Integer getEdad() {
        return edad;
    }


}
