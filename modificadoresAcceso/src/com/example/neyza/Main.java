package com.example.neyza;

public class Main {
    public static void main(String[] args) {
        //Declaramos el precio de un producto x (En este caso esta hardcodeado--< ya tiene un valor:
        double itemPrice = 10.0;
        //Instanciamos nuestro objeto de taxCalculator para poder acceder al método taxAmount que creamos en la clase TaxCal...
        TaxCalculator tc = new TaxCalculator();


        //Almacenamos el precio del impuesto a pagar en una variable, le pasamos como parámetro el precio del producto:
        double itemTax = tc.getTaxAmount(itemPrice);
        //Mostramos rn consola:
        System.out.println(itemTax);

    }
}
