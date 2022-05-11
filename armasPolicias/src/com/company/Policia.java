package com.company;

public class Policia {
    private String nombre;
    private String apellido;
    private Integer legajo;

    public Policia(String nombre, String apellido, Integer legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Integer getLegajo() {
        return this.legajo;
    }
}
