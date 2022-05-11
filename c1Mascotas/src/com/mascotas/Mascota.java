package com.mascotas;

public abstract class Mascota {
    private String tipoAnimal;
    private String nombre;
    private Integer edad;
    private String cuantoCome;
    private String sonido;

    public Mascota(String tipoAnimal, String nombre, Integer edad, String cuantoCome, String sonido) {
        this.tipoAnimal = tipoAnimal;
        this.nombre = nombre;
        this.edad = edad;
        this.cuantoCome = cuantoCome;
        this.sonido = sonido;
    }

    public abstract void mensaje();

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getCuantoCome() {
        return cuantoCome;
    }

    public String getSonido() {
        return sonido;
    }
}
