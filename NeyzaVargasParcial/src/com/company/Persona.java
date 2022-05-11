package com.company;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private Integer edad;

    public Persona(String nombre, String apellido, String dni, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public Integer getEdad() {
        return this.edad;
    }
}
