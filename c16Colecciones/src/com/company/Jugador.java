package com.company;

import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private Integer nroCamiseta;
    private String nombre;
    private Boolean lesionado;
    private Boolean titular;

    public Jugador(Integer nroCamiseta, String nombre, Boolean lesionado, Boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

   //Como necesitamos comparar implementanmos la clase comparable pero tenemos que decirle con que se va comaprar para que no sea cualquier objeto,
   //Entonces ponemos Comparable<Jugador> y así le estaríamos diciendo que vamos a comprar contra jugador y evitamos hacer el casteo
    @Override
    public int compareTo(Jugador jugador) {
        //Siquisieramos que se ordene por nombre utilizamos elcompareTo:
        //return this.nombre.compareTo(jugador.nombre);//

        if(this.nroCamiseta > jugador.nroCamiseta) {
            return 1;
        }
        if(this.nroCamiseta < jugador.nroCamiseta) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "nroCamiseta: " + nroCamiseta + ", nombre: " + nombre + '\'' + ", lesionado: " + lesionado + ", titular:" + titular;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nroCamiseta, jugador.nroCamiseta) && Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroCamiseta, nombre);
    }

    public Boolean getTitular() {
        return titular;
    }

    public Boolean getLesionado() {
        return lesionado;
    }
}
