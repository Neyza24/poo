package com.example.neyza;

public class TaxCalculator {
    double rate = 0.1; //Private

    //Método para calcular el precio de la tasa
    public double getTaxAmount (double price) {
        return rate * price;
    }
}


//Con private --->solo podemos acceder dentro de la misma clase y no desde otra clase
//private double rate = 0.1;
//Por default ---> solo podemos acceder desde clases que estén en el mismo paquete en nuestro caso todas las clases que esten dentro de package com.example.neyza; pueden acceder
// double rate = 0.1; //Default
//Con protected---> Nuestros atributos son accesibles desde clases que están dentro del mismo paquete,
//Para que una clase sea la sub clase de otra, tiene que heredar para eso utilizamos la palabra extends y la clase a la cual queremos pasar la sub clase
//Ejemplo: public class Main extends TaxCalculator; en este caso Main será la sub clase de TaxCalculator
//protected double rate = 0.1;
//Public el más flexible, ya que se puede acceder desde cualquier parte del proyecto