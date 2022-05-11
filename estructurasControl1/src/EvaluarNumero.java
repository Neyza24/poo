import java.util.Scanner;

public class EvaluarNumero {
    public static void main(String[] args) {
        /*Probando con números pares e impares con if y else por consola:
        num % 2 = 0 --> par
        num % 2 != 0 ---> impar
         */
        /* Ejercicio 1
        System.out.println("Ingrese un número entero: "); //Solicitamos que ingrese un num al usuario
        Scanner sc = new Scanner(System.in); //Para recibir el dato desde la consola
        int num = sc.nextInt(); //Variable para almacenar el num que ingrese el usuario-Método que hace que podamos leer el dato desde la consola
        int residuo = num % 2; //

        switch (residuo) {
            case 0:
                System.out.println("El númeroe s par");
                break;
            default:
                System.out.println("El número es impar");
                break;
        }
        */

        /*Ejercicio 2, los días de la semana:
        Recibir un número entre el 1 y 7 y decir que día de la semana es
        1 ---> Domingo
        2---> Lunes
         */
        System.out.println("Ingrese un número entero entre 1 y 7: ");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Es domingo");
                break;
            case 2:
                System.out.println("Es lunes");
                break;
            case 3:
                System.out.println("Es martes");
                break;
            case 4:
                System.out.println("Es miércoles");
                break;
            case 5:
                System.out.println("Es jueves");
                break;
            case 6:
                System.out.println("Es viernes");
                break;
            case 7:
                System.out.println("Es sábado");
                break;
            default:
                System.out.println("Ingrese un número válido");
                break;
        }

    }
}
