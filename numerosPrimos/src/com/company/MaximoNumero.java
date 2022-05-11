package com.company;
import java.util.Scanner;
public class MaximoNumero {
    public static void main(String[] args) {
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

    }
}
