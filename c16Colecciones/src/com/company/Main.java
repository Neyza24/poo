package com.company;

public class Main {
    public static void main(String[] args) {
        //Creamos un equipo:
        Equipo equipo = new Equipo("Real Madrid");
        equipo.agregarJugador(new Jugador(7, "Cristiano", false, true));
        equipo.agregarJugador(new Jugador(3, "Messi", false, false));
        equipo.agregarJugador(new Jugador(2, "Mbappe", true, true));
        equipo.agregarJugador(new Jugador(1, "Bale", true, true));
        equipo.agregarJugador(new Jugador(9, "Di Maria", false, false));

        equipo.mostrarJugadoresTitulares();

        System.out.println(equipo.getCantidadTitularesLesionados());

        //Preguntamos si contiene algún jugador en específico, para eso debemos sobreescribir el hashCode y el Equals en  clase jugador, pasandole los atributos que queremos que valide:
        //Hacemos un get de jugadores en la clase equipo para poder acceder:
        System.out.println(equipo.getJugadores().contains(new Jugador(2, "Mbappe", true, true)));


    }
}
