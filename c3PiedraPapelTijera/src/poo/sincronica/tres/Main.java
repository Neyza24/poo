package poo.sincronica.tres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreJugador1 = "";
        String nombreJugador2 = "";
        String opcionJugador1 = "";
        String opcionJugador2 = "";
        Integer puntajeJugador1 = 0;
        Integer puntajeJugador2 = 0;


        Scanner lector = new Scanner(System.in);

        //Solicitando nombres a los jugadores:
        System.out.println("Jugador 1,ingrese nombre: ");
        nombreJugador1 = lector.nextLine();

        System.out.println("Jugador 2,ingrese nombre: ");
        nombreJugador2 = lector.nextLine();

        while(!opcionJugador1.equals("*") || !opcionJugador2.equals("*")) {

            //Solicitando que elijan una opción:
            System.out.println(nombreJugador1 + " seleccione una de las siguientes opciones: (1) Piedra, (2) Papel, (3) Tijera, (4) Spock, (*) Para terminar el juego ");
            opcionJugador1 = lector.nextLine();
            if(opcionJugador1.equals("*")) {
                break;
            }
            System.out.println(nombreJugador2 + " seleccione una de las siguientes opciones: (1) Piedra, (2) Papel, (3) Tijera, (4) Spock, (*) Para terminar el juego ");
            opcionJugador2 = lector.nextLine();
            if(opcionJugador2.equals("*")) {
                break;
            }

            //función cualGana:
            Integer resultado = cualGana(Integer.parseInt(opcionJugador1), Integer.parseInt(opcionJugador2));
            if(resultado.equals(1)) {
                puntajeJugador1++;
            } else if (resultado.equals(2)) {
                puntajeJugador2++;
            }
        }

        if(puntajeJugador1 > puntajeJugador2) {
            System.out.println(nombreJugador1 + " Ganaste !!!");
        } else if(puntajeJugador1 < puntajeJugador2) {
            System.out.println(nombreJugador2 + " Ganaste !!!");
        }else {
            System.out.println("Quedaron en un empate");
        }


    }

    public static Integer cualGana(Integer jugadaJugador1, Integer jugadaJugador2) {

        if((jugadaJugador1 > 0 && jugadaJugador1 < 5 ) && (jugadaJugador2 > 0 && jugadaJugador2 < 5 )) {
            if((jugadaJugador1 == 1 && jugadaJugador2 == 3) || (jugadaJugador1 == 2 && jugadaJugador2 == 1) || (jugadaJugador1 == 2 && jugadaJugador2 == 4) || (jugadaJugador1 == 3 && jugadaJugador2 == 2) || (jugadaJugador1 == 4 && jugadaJugador2 == 1) || (jugadaJugador1 == 4 && jugadaJugador2 == 3)) {
                System.out.println("Gano el jugador 1" );
                return 1;
            } else if((jugadaJugador2 == 1 && jugadaJugador1 == 3) || (jugadaJugador2 == 2 && jugadaJugador1 == 1) || (jugadaJugador2 == 2 && jugadaJugador1 == 4) || (jugadaJugador2 == 3 && jugadaJugador1 == 2) || (jugadaJugador2 == 4 && jugadaJugador1 == 1) || (jugadaJugador2 == 4 && jugadaJugador1 == 3)) {
                System.out.println("Gano el jugador 2");
                return 2;
            }else if((jugadaJugador1 == 1 && jugadaJugador2 == 1) || (jugadaJugador1 == 2 && jugadaJugador2 == 2) || (jugadaJugador1 == 2 && jugadaJugador2 == 2) || (jugadaJugador1 == 4 && jugadaJugador2 == 4)) {
                System.out.println("Es un empate");
                return 0;
            }
        } else {
            System.out.println("Ingrese una opción válida ");
        }
        return 9;
    }
}
