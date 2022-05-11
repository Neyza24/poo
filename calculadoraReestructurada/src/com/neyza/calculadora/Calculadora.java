package com.neyza.calculadora;

//La clase calculadora será la encargada de ejecutar la lógica necesaria para las operaciones
//Vamos a definir un método para cada operación(suma, resta, multi, div)
public class Calculadora {
    //Método suma:
    public float operacionSuma (float num1, float num2) {
        float suma = num1 + num2;
        return suma;
    }
    //Método resta:
    public float operacionResta (float num1, float num2) {
        float resta = num1 - num2;
        return resta;
    }
    //Método multiplicación:
    public float operacionMultiplicacion (float num1, float num2) {
        float multiplicacion = num1 * num2;
        return multiplicacion;
    }
    //Método división:
    public float operacionDivision (float num1, float num2) {
        float division = num1 / num2;
        return division;
    }
    public void menu () {
        System.out.println("Seleccione la operación: ");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
    }
}
