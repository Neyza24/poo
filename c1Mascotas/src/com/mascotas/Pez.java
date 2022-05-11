package com.mascotas;

public class Pez extends Mascota{
    public Pez(String tipoAnimal, String nombre, Integer edad, String cuantoCome, String sonido) {
        super(tipoAnimal, nombre, edad, cuantoCome, sonido);
    }

    @Override
    public void mensaje() {
        System.out.println(getNombre() + " es " + getTipoAnimal() + ", tiene " + getEdad() + " años");
        System.out.println(getNombre() + " come " + getCuantoCome() + " y hace " + getSonido());
    }
}
