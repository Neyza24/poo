package com.playground.neyza;

public class Animal {
    public String tipoAnimal;
    public String nombre; // A estos campos se los conoce como atributos; los atributos son las características que definen al objeto y nos permite diferenciar uno de otro
    public Integer edad; //La palabra public(tipo de acceso) permite que otras clases puedan acceder a los atributos de la clase animal- no es buena práctica utilizar public (más adelante veremos otros tipos de acceso)
    public String cantidadComida;
    public String sonido;

        //La sintaxis para crear un constructor, dentro de las llaves va el código que queremos que se ejecute, en este caso solo estamos creando el constructor
        // Creando un constructor al que le pasaremos parámetros:
        public Animal(String tipoAnimal, String nombre, Integer edad, String cantidadComida, String sonido) {
            //Asignando un valor al atributo de la clase Animal
            this.tipoAnimal = tipoAnimal;
            this.nombre = nombre;
            this.edad = edad;
            this.cantidadComida = cantidadComida;
            this.sonido = sonido;
        }
}
