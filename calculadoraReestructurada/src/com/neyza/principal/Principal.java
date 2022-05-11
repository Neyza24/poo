package com.neyza.principal;
import com.neyza.calculadora.Calculadora;
//Importamos el objeto Scanner:
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("++++CALCULADORA++++");
//Creamos un objeto de tipo Scanner con el cual vamos a poder leer datos desdela consola
        Scanner sc = new Scanner(System.in);
// Declaramos las variables que serán los datos que vamos a estar recibiendo del usuario:
        float num1;
        float num2;
//Solicitamos los datoss al usuario por consola:
        System.out.println("Ingrese el primer número: ");
//Guardamos los datos ingresados por usuario con el método nextFloat()
        num1 = sc.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = sc.nextFloat();
//Para que podamos llamar a nuestro método desde la clase principal tenemos que crear un objeto de la clase calculadora
        Calculadora cal = new Calculadora();
        cal.menu(); //Llamamos a nuestro método menú, donde el usuario puede elegir una operación:

        //Llamamos el método suma definido en la clase calculadora, como num1 y num2 ya están definidos, no es necesario especificar el tipo de dato
        //float resultado = cal.operacionSuma(num1, num2);
        //System.out.println(resultado);
        //------>En este caso vamos aplicar un swictch ya que tenenmos 4 opciones que peude elegir el usuario, de las líneas 24 a 26 no aplicarian ya que se ejecutar a partir del switch

        //Almacenamos la opción seleccionada por el usuario en una variable
        int opcion = sc.nextInt();

        //Switch de opcion (se ejecutará dependiendo la operación que elija el usuario:
        switch (opcion) {
            case 1:
                System.out.println("El resultado es: " + cal.operacionSuma(num1, num2));
                break;
            case 2:
                System.out.println("El resultado es: " + cal.operacionResta(num1, num2));
                break;
            case 3:
                System.out.println("El resultado es: " + cal.operacionMultiplicacion(num1, num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("No es posible realizar una división entre cero");
                } else {
                    System.out.println("El resultado es: " + cal.operacionDivision(num1, num2));
                }
                break;
            default:
                System.out.println("Ingrese una opción válida");
        }
    }
}
