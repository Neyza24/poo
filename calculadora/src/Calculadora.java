import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
// Creamos una variable utilizando el método Scanner y solicitar los datos por consola:
        Scanner sc = new Scanner(System.in);
// Declaramos las variables que serán los datos que vamos a estar recibiendo del usuario:
        float num1;
        float num2;
//Solicitanos los datoss al usuario por consola:
        System.out.println("Ingrese el primer número: ");
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextFloat();
//Le pedimos al usuario que seleccione que operación quiere realizar:
        System.out.println("Seleccione la operación: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
// Almacenamos en una variable la opción que elija el usuario
        int opcion = sc.nextInt();
// Mostramos por consola la opción que eligio el usuario:
        //System.out.println(opcion);
// Aplicamos una estructura de control switch case ya que tenemos más de dos opciones:
        switch (opcion) {
            case 1:
                float suma = num1 + num2;
                System.out.println("El resultado es: " +  suma);
                break;
            case 2:
                float resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                float multiplicacion = num1 * num2;
                System.out.println("El resultado es: " +  multiplicacion);
                break;
            case 4:
                //Hacemos una validación para que el num2 no sea cero ya que daría innito como resultado
                if(num2 == 0) {
                    System.out.println("No es posible dividir entre cero");
                } else {
                    float division = num1 / num2;
                    System.out.println("El resulatdo es: " +  division);
                }
                break;
            default:
                System.out.println("Ingrese una opción valida");
                break;
        }
    }
}
