package com.mascotas;

public class Mascotas {
    public static void main(String[] args) {
        Perro perro = new Perro("Perro", "Manchitas", 2, "1 kilo y medio", "guau guau");
        Pez pez = new Pez("Pez", "Nemo", 1, "140 gramos", "nose");
        Gato gato = new Gato("Gato", "Silvestre", 3, "medio kilo", "miauw miauw");
        Tortuga tortuga = new Tortuga("tortuga", "Manuelita", 12, "300 gramos", "toc toc");
        Pajaro pajaro = new Pajaro("pájaro", "Gardel", 1, "350 gramos", "pio pio");

        perro.mensaje();
    }
}
