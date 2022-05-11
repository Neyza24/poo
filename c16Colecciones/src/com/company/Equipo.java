package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipo;
    //Tenemos que indicarle que tiene una lista de jugadores:
    private List<Jugador> jugadores;

    //Para crear el constructor para listas sería:
    public Equipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        //Forma de inicializar una lista es instanciando un ArrayList que es de tipo concreto.List es una interface(contrato) y ArrayList<>() es
        jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void mostrarJugadoresTitulares() {
        //Para ordenar una lista lo hacemos con el sort y le pasamos null por convención de java,
        //con eso le estamos diciendo confía en mí los jugadores saben ordenarse (en este caso pusimos que son comparables por número de camiseta):
        jugadores.sort(null);
        for (Jugador jugador: jugadores) {
            if(jugador.getTitular()) {
                System.out.println(jugador);
            }
        }
    }

    public Integer getCantidadTitularesLesionados() {
        Integer contadorLesionados = 0;

        for (Jugador jugador : jugadores) {
            if(jugador.getTitular() && jugador.getLesionado()) {
                contadorLesionados++;
            }
        }
        return contadorLesionados;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
