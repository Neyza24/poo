package com.neyza.example.model;

//La clase persona vendría a ser el molde o plantilla. Cada objeto sería creado utilizando el molde o plantilla definida en la clase persona
//Así cada persona(objeto) puede tener diferente nombre, edad y dirección pero todas tendrían algo en común, que son instancias de la misma clase y por ende tendrían el mismo comportamiento
//Para crear un nuevo objeto se debe utilizar la palabra reservada new
public class Persona {
    public String nombre; // A estos campos se los conoce como atributos; los atributos son las caracteristicas que definen al objeto y nos permite diferenciar uno de otro
    public int edad; //La palabra public permite que otras clase puedan acceder a los atributos de la clase persona- no es buena práctica utilizar public
    public String direccion;

    //La sintáxis para crear un constructor, dentro de las llaves va el código que queremos que se ejecute, en este caso solo estamos creando el constructor
    public Persona() {

    }
// Creando un constructor al que le pasaremos parámetros:
    public Persona(String nombre, int edad, String direccion) {
        //Asigando un valor al atributo de la clase Persona (empieza en la línea 6), para acceder utilizamos this.
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;

    }
}
