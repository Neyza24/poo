package com.company;
import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");

        Integer numero = scanner.nextInt();

        if (esPrimo(numero)) {
            System.out.println("Es primo");
        }
        else {
            System.out.println("No es primo");
        }
    }
    public static Boolean esPrimo (Integer numero) {
        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (esDivisible(numero, i)){
                contador = contador + 1 ;
            }
        }
        if (contador > 2) {
            return false;
        }
        else {
            return true;
        }
    }

    public static Boolean esDivisible (int n, int divisor) {
        return n%divisor == 0;
    }*/


   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        Integer numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        Integer numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        Integer numero3 = scanner.nextInt();

        Integer numeroMax = maximoEntreTresNumeros(numero1, numero2, numero3);

        System.out.println("el numero máximo es " + numeroMax);


    }

    public static Integer maximoEntreTresNumeros (int numeroA, int numeroB, int numeroC) {
        Integer numeroMax = numeroA;

        if (numeroMax<numeroB){
            numeroMax = numeroB;
        }
        if (numeroMax<numeroC){
            numeroMax = numeroC;
        }

        return numeroMax;

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer texto:");
        String texto1 = scanner.nextLine();

        System.out.println("Ingrese el segundo texto:");
        String texto2 = scanner.nextLine();;

        System.out.println(cadenasDeTextoDistintas(texto1, texto2));
    }

    public static Boolean cadenasDeTextoDistintas (String textoA, String textoB){
        if(textoA.equals(textoB)) {
            System.out.println("Son iguales");
            return true;
        } else{
            System.out.println("No son iguales");
            return false;
        }

    }


}
