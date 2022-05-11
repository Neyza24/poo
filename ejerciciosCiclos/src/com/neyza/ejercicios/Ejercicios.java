package com.neyza.ejercicios;

import java.util.Random;
import java.util.Scanner;

//Desarrollar un programa que pida al usuario adivinar el número entre 0 y 10. El número se debe generar aleatoriamente. 3 intentos
public class Ejercicios {
    public static void main(String[] args) {
        //Para generar números random java tiene un método llamado Random
        Random r = new Random();
        //Usamos el objeto r para generar un num entero entre 0 y 10. Le pasamos el límite superior en este caso sería 11
        int randNum = r.nextInt(11);
        //System.out.println(randNum);

        //Necesitamos nuestra variable de tipo scanner, para poder leer los números desde consola
        Scanner sc = new Scanner(System.in);
        //Cuando no hay número definido de iteraciones, lo mejor y más lógico es utilizar un ciclo while
        int userNum = -1; //
        int intentos = 3;

        while (userNum != randNum) {
            System.out.println("Adiniva el número aleatorio entre 0 y 10:");
            //Guardamos el número que ingrese el usuario en la variable userNum
            userNum = sc.nextInt();
            //Validamos si el usuario adivino o no
            if(userNum != randNum) {
                intentos--; // intentos = intentos - 1
                //Le avisamos al usuario que falló y cuantos intentos le queda
                System.out.println("Fallaste... intentos restantes: " + intentos);
                if(intentos == 0) {
                    System.out.println("No te quedan más intentos");
                    System.out.println("El número aleatorio era:  " + randNum);
                    break;
                }
            } else {
                System.out.println("Acertaste");
            }
        }
    }
}
