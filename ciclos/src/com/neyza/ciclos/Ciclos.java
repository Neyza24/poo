package com.neyza.ciclos;

public class Ciclos {
    public static void main(String[] args) {
        //While
        /*
        int i = 0;
        while (i < 5) {
            System.out.println("El valor de i es: " +  i);
            i++;  //es lo mismo que escribir i = i + 1
        }
        //do while

        i = 0;
        do{
            System.out.println("El valor de i es: " +  i);
            i++;  //es lo mismo que escribir i = i + 1
        } while (i < 5);

        //For--->dentro de los paréntesis va a partir de donde inicializa, condición e incremento

        for (int j = 0; j < 5; i++) {
            System.out.println("El valor de j es: " + j);
        }
         */

        //for each para arreglos
        //Para recorrer un arreglo con un for sería de la sgte forma:
        String[] values = {"a", "b", "c"};
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        //Con for each sería:
        //str será la variable que se va ir actualizando por cada iteración, seguido de dos puntos y el nombre de la colección sobre la cual vamos a iterar
        //Dentro del cuerpo va la variable interna que definimos dentro del ciclo
        for (String str: values) {
            System.out.println(str);
        }

    }
}
